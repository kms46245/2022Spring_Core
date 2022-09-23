package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;	//IoC는 Component로 DI는 Autowired를 통해 간소화
	//@Autowired  private Gun rifle;	
	@Autowired @Nullable private Gun rifleGun;
	// 1.해당 타입을 먼저 찾아 DI를 하고,
	// 2. 현재처럼 동일한 타입으로 N개가 있는경우 변수명과 ID가 일치한 것을 DI시킨다.
	// 둘다 지켜지지않을경우 같은 타입에 여러개의 중복이 겹친다는 에러가 발생한다.
	
	public void fire() {
		try {
		pistol.fire();
		//rifle.fire();
		rifleGun.fire();
		} catch (NullPointerException e) {
			System.out.println("Error");
		}
	}
}

// 과제] 피스톨만 존재하는 Shooter에서
// 10, 19번째 줄을 추가했을때 나타나는 exception을 해결하라.

// 과제] Nullable로 값을 강제 DI시킨후의 에러를 통해 앱이 터지지않게 하라.