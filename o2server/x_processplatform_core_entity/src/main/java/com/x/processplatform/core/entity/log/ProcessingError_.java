/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.log;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.log.ProcessingError.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:31:44 CST 2018")
public class ProcessingError_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<ProcessingError,String> data;
    public static volatile SingularAttribute<ProcessingError,String> id;
    public static volatile SingularAttribute<ProcessingError,String> message;
    public static volatile SingularAttribute<ProcessingError,String> work;
}
