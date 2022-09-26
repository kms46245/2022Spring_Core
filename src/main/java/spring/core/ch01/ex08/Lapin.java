package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")	// 이 선언의 의미는 해당 클래스가 n개가 생긴다라는것을 표현
public class Lapin {

}
