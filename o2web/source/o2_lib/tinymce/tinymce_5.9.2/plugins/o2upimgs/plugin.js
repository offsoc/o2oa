tinymce.PluginManager.add('o2upimgs', function(editor, url) {
	var pluginName='多图片上传';
	debugger;
	var o2upimgs = window["o2upimgs_"+editor.id]= {}; //扔外部公共变量，也可以扔一个自定义的位置

	var baseURL=tinymce.baseURL;
	var iframe1 = baseURL+'/plugins/o2upimgs/upfiles.html';
	var base64Encode = editor.getParam('base64Encode', false);

    var images_upload_handler = editor.getParam('images_upload_handler', undefined, 'function');
    if( !images_upload_handler ){
		var enablePreview = editor.getParam('enablePreview', true);
		var localImageMaxWidth = editor.getParam('localImageMaxWidth', 2000);
		var reference = editor.getParam('reference');
		var referenceType = editor.getParam('referenceType');

		images_upload_handler = function(blobInfo, success, failure, image){
			debugger;
			var file = blobInfo.blob();
			var formData = new FormData();
			formData.append('file', file, file.name );

			MWF.xDesktop.uploadImageByScale( reference, referenceType, localImageMaxWidth, formData, file, function (responseData) {
				var id = responseData.data ? responseData.data.id : responseData.id;
				var orgid = responseData.data ? responseData.data.origId : responseData.origId;
				var src = MWF.xDesktop.getImageSrc( id );

				var width = image.naturalWidth;
				var height = image.naturalHeight;

				//按最大宽度比率缩小
				if( localImageMaxWidth && localImageMaxWidth < width ){
					height = parseInt( height * (localImageMaxWidth / width) );
				}
				width = Math.min(width, localImageMaxWidth);

				var attributes = {
					"data-id": id,
					"data-orgid": orgid,
					"data-height": ''+height,
					"data-width": ''+width,
					"style": 'max-width:100%; width:' + width + 'px',
					"onerror": 'MWF.xDesktop.setImageSrc()',
					"alt": file.name || '',
					"data-prv": enablePreview ? 'true' : 'false'
				};

				if(success)success(src, attributes);
			}, function () {
				if(failure)failure();
				return true;
			});
		}
	}
	o2upimgs.images_upload_handler = images_upload_handler;

    o2upimgs.images_upload_base_path = editor.getParam('images_upload_base_path', '', 'string');
    o2upimgs.o2upimgs_filetype = editor.getParam('o2upimgs_filetype', '.png,.gif,.jpg,.jpeg', 'string');
	o2upimgs.res=[];
	var openDialog = function() {
		return editor.windowManager.openUrl({
			title: pluginName,
			size: 'large',
			url:iframe1,
			buttons: [
				{
					type: 'cancel',
					text: 'Close'
				},
				{
					type: 'custom',
					text: 'Save',
					name: 'save',
					primary: true
				},
			],
			onAction: function (api, details) {
				switch (details.name) {
					case 'save':
						o2upimgs.iframeWindow.querySave(function () {
							var html = '';
							var imgs = o2upimgs.res;
							var len = imgs.length;
							for(var i=0;i<len;i++){
								if( imgs[i].url ){
									var attributes = imgs[i].attributes;
									var att = '';
									for(var key in attributes){
										att = att + key+'="' + attributes[key] + '" ';
									}
									html += '<img src="'+imgs[i].url+'" '+att+'/>';
								}
							}
							editor.insertContent(html);
							o2upimgs.res=[];
							editor.fire( 'change' );
							api.close();
						})
						break;
					default:
						break;
				}
				
			}
		});
	};

	editor.ui.registry.getAll().icons.o2upimgs || editor.ui.registry.addIcon('o2upimgs','<svg viewBox="0 0 1280 1024" xmlns="http://www.w3.org/2000/svg" width="24" height="24"><path d="M1126.2,779.8V87.6c0-24-22.6-86.9-83.5-86.9H83.5C14.7,0.7,0,63.7,0,87.7v692c0,36.2,29.2,89.7,83.5,89.7l959.3-1.3c51.7,0,83.5-42.5,83.5-88.3zm-1044,4V86.3h961.6V783.7H82.2v0.1z" fill="#53565A"/><path d="M603,461.6L521.1,366.3,313,629.8,227.2,546.8,102.4,716.8H972.8v-170L768.2,235.2,603.1,461.6zM284.6,358.4a105.4,105.4,0,0,0,73.5-30c19.5-19.1,30.3-45,30.2-71.8,0-56.8-45.9-103-102.4-103-56.6,0-102.4,46.1-102.4,103C183.4,313.5,228,358.4,284.6,358.4z" fill="#9598A0"/><path d="M1197.7,153.6l-0.3,669.3s13.5,113.9-67.4,113.9H153.6c0,24.1,23.9,87.2,83.5,87.2h959.3c58.3,0,83.6-49.5,83.6-89.9V240.8c-0.1-41.8-44.9-87.2-82.3-87.2z" fill="#53565A"/></svg>');
	
	editor.ui.registry.addButton('o2upimgs', {
		icon: 'o2upimgs',
        tooltip: pluginName,
		onAction: function() {
			openDialog();
		}
	});
	editor.ui.registry.addMenuItem('o2upimgs', {
		icon: 'o2upimgs',
		text: '图片批量上传...',
		onAction: function() {
			openDialog();
		}
	});
	return {
		getMetadata: function() {
			return  {
				name: pluginName
				// url: "http://tinymce.ax-z.cn/more-plugins/axupimgs.php",
			};
		}
	};
});
