/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.attendance.entity.StatisticTopUnitForDay.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:29:38 CST 2018")
public class StatisticTopUnitForDay_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<StatisticTopUnitForDay,Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Double> employeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,String> id;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Long> lateCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Long> offDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Long> onDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,Double> onSelfHolidayEmployeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay,String> statisticDate;
    public static volatile SingularAttribute<StatisticTopUnitForDay,String> statisticMonth;
    public static volatile SingularAttribute<StatisticTopUnitForDay,String> statisticYear;
    public static volatile SingularAttribute<StatisticTopUnitForDay,String> topUnitName;
}
