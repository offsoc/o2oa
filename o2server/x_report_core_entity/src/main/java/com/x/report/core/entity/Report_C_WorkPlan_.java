/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.report.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.report.core.entity.Report_C_WorkPlan.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:31:57 CST 2018")
public class Report_C_WorkPlan_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Report_C_WorkPlan,Date> date;
    public static volatile SingularAttribute<Report_C_WorkPlan,Date> endTime;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> flag;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> id;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> keyWorkId;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> measuresId;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> measuresTitle;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> month;
    public static volatile SingularAttribute<Report_C_WorkPlan,Integer> orderNumber;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> profileId;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> reportId;
    public static volatile SingularAttribute<Report_C_WorkPlan,Date> startTime;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> targetIdentity;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> targetPerson;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> title;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> week;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> workInfoId;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> workTitle;
    public static volatile SingularAttribute<Report_C_WorkPlan,String> year;
}
