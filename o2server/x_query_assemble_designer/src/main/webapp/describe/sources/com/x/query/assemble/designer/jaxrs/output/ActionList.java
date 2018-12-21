package com.x.query.assemble.designer.jaxrs.output;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.entity.JpaObject;
import com.x.base.core.project.bean.WrapCopier;
import com.x.base.core.project.bean.WrapCopierFactory;
import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.http.EffectivePerson;
import com.x.base.core.project.tools.ListTools;
import com.x.query.assemble.designer.Business;
import com.x.query.core.entity.Query;
import com.x.query.core.entity.Reveal;
import com.x.query.core.entity.Stat;
import com.x.query.core.entity.View;
import com.x.query.core.entity.wrap.WrapQuery;
import com.x.query.core.entity.wrap.WrapReveal;
import com.x.query.core.entity.wrap.WrapStat;
import com.x.query.core.entity.wrap.WrapView;

class ActionList extends BaseAction {

	ActionResult<List<Wo>> execute(EffectivePerson effectivePerson) throws Exception {
		try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {
			ActionResult<List<Wo>> result = new ActionResult<>();
			Business business = new Business(emc);

			List<Wo> wos = emc.fetchAll(Query.class, Wo.copier);

			List<WrapView> viewList = emc.fetchAll(View.class, viewCopier);

			List<WrapStat> statList = emc.fetchAll(Stat.class, statCopier);

			List<WrapReveal> revealList = emc.fetchAll(Reveal.class, revealCopier);

			ListTools.groupStick(wos, viewList, "id", "query", "viewList");
			ListTools.groupStick(wos, statList, "id", "query", "statList");
			ListTools.groupStick(wos, revealList, "id", "query", "revealList");

			wos = wos.stream()
					.sorted(Comparator.comparing(Wo::getAlias, Comparator.nullsLast(String::compareTo))
							.thenComparing(Wo::getName, Comparator.nullsLast(String::compareTo)))
					.collect(Collectors.toList());
			result.setData(wos);
			return result;
		}
	}

	public static WrapCopier<View, WrapView> viewCopier = WrapCopierFactory.wo(View.class, WrapView.class,
			JpaObject.singularAttributeField(View.class, true, true), null);

	public static WrapCopier<Stat, WrapStat> statCopier = WrapCopierFactory.wo(Stat.class, WrapStat.class,
			JpaObject.singularAttributeField(Stat.class, true, true), null);

	public static WrapCopier<Reveal, WrapReveal> revealCopier = WrapCopierFactory.wo(Reveal.class, WrapReveal.class,
			JpaObject.singularAttributeField(Reveal.class, true, true), null);

	public static class Wo extends WrapQuery {

		private static final long serialVersionUID = 474265667658465123L;

		public static WrapCopier<Query, Wo> copier = WrapCopierFactory.wo(Query.class, Wo.class,
				JpaObject.singularAttributeField(Query.class, true, true), null);

	}

}