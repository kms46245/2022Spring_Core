package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")		// scope의 타입을 지정해주는 annotation(기본값은 singleton)
public class Leopard {

}
