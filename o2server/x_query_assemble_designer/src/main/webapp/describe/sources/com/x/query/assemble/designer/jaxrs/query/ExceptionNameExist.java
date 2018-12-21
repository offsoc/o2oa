package com.x.query.assemble.designer.jaxrs.query;

import com.x.base.core.project.exception.PromptException;

class ExceptionNameExist extends PromptException {

	private static final long serialVersionUID = -5515077418025884395L;

	ExceptionNameExist(String str) {
		super("名称已存在:{}.", str);
	}

}
