package com.x.cms.assemble.control.jaxrs.view.exception;

import com.x.base.core.project.exception.PromptException;

public class ExceptionViewInfoAppIdEmpty extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	public ExceptionViewInfoAppIdEmpty() {
		super("栏目名称[appId]为空,无法进行数据保存。" );
	}
}
