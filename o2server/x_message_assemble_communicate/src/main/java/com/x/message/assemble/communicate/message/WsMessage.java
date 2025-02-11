package com.x.message.assemble.communicate.message;

import com.google.gson.JsonElement;
import com.x.base.core.project.annotation.FieldDescribe;
import com.x.base.core.project.gson.GsonPropertyObject;

public class WsMessage extends GsonPropertyObject {

	private static final long serialVersionUID = -3163827472907732223L;

	@FieldDescribe("Ws消息类别.")
	private String type;

	@FieldDescribe("Ws消息接收人.")
	private String person;

	@FieldDescribe("Ws消息标题.")
	private String title;

	@FieldDescribe("Ws消息内容.")
	private JsonElement body;

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JsonElement getBody() {
		return body;
	}

	public void setBody(JsonElement body) {
		this.body = body;
	}

}