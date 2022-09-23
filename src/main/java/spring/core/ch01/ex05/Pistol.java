package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//@Component	// DI를 할때 추적하여 해당 annotation을 발견하게되면, 해당 클래스의 이름을 이용해 IoC함 
public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("권총 빵야빵야");
	}
}
