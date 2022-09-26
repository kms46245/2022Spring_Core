package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component					 //Spring에서 기본적으로 제공해주는 인터페이스
public class Lion implements InitializingBean, DisposableBean{
	@Override	// InitializingBean에서 나온 추상메서드
	public void afterPropertiesSet() throws Exception{
				// Bean을 초기화할때의 작업을 지정
		System.out.println("Lion is born.");
	}
	
	public void shout() {
		System.out.println("Lion shout.");
	}
	
	@Override
	public void destroy() throws Exception{
				//Bean이 소멸될때의 작업을 지정
		System.out.println("Lion is dead.");
	}
}
