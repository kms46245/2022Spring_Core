package spring.core.ch01.ex06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoComponent {

}
/* 과제]
 * class 에 적용하고, bean 상태에서 살아남아 있는 annotation을 만들어라.
 */