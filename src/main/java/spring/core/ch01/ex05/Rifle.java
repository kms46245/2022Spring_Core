package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

//@Component("rifleGun") // 자동으로 할당되는 ID가 아닌 값을 파라미터로 지정을 해줄 수 있다.
public class Rifle implements Gun{
	@Override
	public void fire() {
		System.out.println("소총 두두두");
	}
}
