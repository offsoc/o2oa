/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrStatisticReportStatus.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:31:22 CST 2018")
public class OkrStatisticReportStatus_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> centerId;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> centerTitle;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> completeDateLimitStr;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> deployDateStr;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> id;
    public static volatile SingularAttribute<OkrStatisticReportStatus,Integer> overallProgress;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> parentId;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> reportCycle;
    public static volatile SingularAttribute<OkrStatisticReportStatus,Integer> reportDayInCycle;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> reportStatistic;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> responsibilityEmployeeName;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> responsibilityIdentity;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> responsibilityTopUnitName;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> responsibilityUnitName;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> statisticTimeFlag;
    public static volatile SingularAttribute<OkrStatisticReportStatus,Integer> statisticYear;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> status;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> workDateTimeType;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> workId;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> workLevel;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> workProcessStatus;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> workTitle;
    public static volatile SingularAttribute<OkrStatisticReportStatus,String> workType;
}
