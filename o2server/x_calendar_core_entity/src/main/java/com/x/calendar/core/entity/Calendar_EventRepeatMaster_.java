/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.calendar.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.calendar.core.entity.Calendar_EventRepeatMaster.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:30:20 CST 2018")
public class Calendar_EventRepeatMaster_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Boolean> alarm;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Date> alarmTime;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> calendarId;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> color;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> comment;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> createPerson;
    public static volatile ListAttribute<Calendar_EventRepeatMaster,String> createdMonthList;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Integer> daysOfDuration;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Date> endTime;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> eventType;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> id;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Boolean> isAllDayEvent;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Boolean> isPublic;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> latitude;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> locationName;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> longitude;
    public static volatile ListAttribute<Calendar_EventRepeatMaster,String> manageablePersonList;
    public static volatile ListAttribute<Calendar_EventRepeatMaster,String> participants;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> recurrenceExc;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> recurrenceRule;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Date> recurrenceStartTime;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> repeatStatus;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> source;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,Date> startTime;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> targetType;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> title;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> updatePerson;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> valarmTime_config;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> valarm_Summary;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> valarm_description;
    public static volatile SingularAttribute<Calendar_EventRepeatMaster,String> valarm_mailto;
    public static volatile ListAttribute<Calendar_EventRepeatMaster,String> viewableGroupList;
    public static volatile ListAttribute<Calendar_EventRepeatMaster,String> viewablePersonList;
    public static volatile ListAttribute<Calendar_EventRepeatMaster,String> viewableUnitList;
}
