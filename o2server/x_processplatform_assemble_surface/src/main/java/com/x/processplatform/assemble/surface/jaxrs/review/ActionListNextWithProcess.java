package com.x.processplatform.assemble.surface.jaxrs.review;

import java.util.List;

import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.entity.JpaObject;
import com.x.base.core.project.annotation.FieldDescribe;
import com.x.base.core.project.bean.WrapCopier;
import com.x.base.core.project.bean.WrapCopierFactory;
import com.x.base.core.project.exception.ExceptionEntityNotExist;
import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.jaxrs.EqualsTerms;
import com.x.processplatform.assemble.surface.Business;
import com.x.processplatform.core.entity.content.Review;
import com.x.processplatform.core.entity.element.Process;

public class ActionListNextWithProcess extends BaseAction {

	ActionResult<List<Wo>> execute(EffectivePerson effectivePerson, String id, Integer count, String processFlag)
			throws Exception {
		try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
			Business business = new Business(emc);
			Process process = business.process().pick(processFlag);
			if (null == process) {
				throw new ExceptionEntityNotExist(processFlag, Process.class);
			}
			EqualsTerms equals = new EqualsTerms();
			equals.put(Review.person_FIELDNAME, effectivePerson.getDistinguishedName());
			equals.put(Review.process_FIELDNAME, process.getId());
			ActionResult<List<Wo>> result = this.standardListNext(Wo.copier, id, count, JpaObject.sequence_FIELDNAME,
					equals, null, null, null, null, null, null, null, true, DESC);
			return result;
		}
	}

	public static class Wo extends Review {

		private static final long serialVersionUID = 2279846765261247910L;

		static WrapCopier<Review, Wo> copier = WrapCopierFactory.wo(Review.class, Wo.class, null,
				JpaObject.FieldsInvisible);

		@FieldDescribe("排序号")
		private Long rank;

		public Long getRank() {
			return rank;
		}

		public void setRank(Long rank) {
			this.rank = rank;
		}

	}
}
