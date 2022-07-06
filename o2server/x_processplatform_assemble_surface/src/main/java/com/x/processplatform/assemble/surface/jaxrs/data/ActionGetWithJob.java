package com.x.processplatform.assemble.surface.jaxrs.data;

import com.google.gson.JsonElement;
import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;
import com.x.processplatform.assemble.surface.Business;
import com.x.processplatform.core.entity.content.Review;

class ActionGetWithJob extends BaseAction {

	private static final Logger LOGGER = LoggerFactory.getLogger(ActionGetWithJob.class);

	ActionResult<JsonElement> execute(EffectivePerson effectivePerson, String job) throws Exception {
		try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {

			LOGGER.debug("execute:{}, job:{}.", effectivePerson::getDistinguishedName, () -> job);

			ActionResult<JsonElement> result = new ActionResult<>();
			Business business = new Business(emc);
			if ((!this.manager(business, effectivePerson))
					&& (emc.countEqual(Review.class, Review.person_FIELDNAME,
							effectivePerson.getDistinguishedName()) == 0)
					&& (!this.applicationControl(business, effectivePerson, job))) {
				throw new ExceptionJobAccessDenied(effectivePerson.getName(), job);
			}
			result.setData(this.getData(business, job));
			return result;
		}
	}
}