/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.portal.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.portal.core.entity.Portal.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:31:37 CST 2018")
public class Portal_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Portal,String> alias;
    public static volatile ListAttribute<Portal,String> availableIdentityList;
    public static volatile ListAttribute<Portal,String> availableUnitList;
    public static volatile ListAttribute<Portal,String> controllerList;
    public static volatile SingularAttribute<Portal,String> creatorPerson;
    public static volatile SingularAttribute<Portal,String> description;
    public static volatile SingularAttribute<Portal,String> firstPage;
    public static volatile SingularAttribute<Portal,String> icon;
    public static volatile SingularAttribute<Portal,String> id;
    public static volatile SingularAttribute<Portal,String> lastUpdatePerson;
    public static volatile SingularAttribute<Portal,Date> lastUpdateTime;
    public static volatile SingularAttribute<Portal,Boolean> mobileClient;
    public static volatile SingularAttribute<Portal,String> name;
    public static volatile SingularAttribute<Portal,Boolean> pcClient;
    public static volatile SingularAttribute<Portal,String> portalCategory;
}
