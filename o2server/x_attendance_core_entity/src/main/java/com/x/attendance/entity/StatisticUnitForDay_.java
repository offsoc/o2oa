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
(value=com.x.attendance.entity.StatisticUnitForDay.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:29:38 CST 2018")
public class StatisticUnitForDay_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<StatisticUnitForDay,Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Double> employeeCount;
    public static volatile SingularAttribute<StatisticUnitForDay,String> id;
    public static volatile SingularAttribute<StatisticUnitForDay,Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Long> lateCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Long> offDutyCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Long> onDutyCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticUnitForDay,Double> onSelfHolidayEmployeeCount;
    public static volatile SingularAttribute<StatisticUnitForDay,String> statisticDate;
    public static volatile SingularAttribute<StatisticUnitForDay,String> statisticMonth;
    public static volatile SingularAttribute<StatisticUnitForDay,String> statisticYear;
    public static volatile SingularAttribute<StatisticUnitForDay,String> topUnitName;
    public static volatile SingularAttribute<StatisticUnitForDay,String> unitName;
}
