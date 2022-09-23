package spring.core.ch01.ex04;

import java.io.ObjectInputFilter.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration
@Import({Config1.class, Config2.class})	
// 여러개의 config를 통합할때엔 import를 이용해 합친다.
public class AppConfig {
	@Autowired private Gun pistol;	// @Autowired - 컨테이너가 해당 클래스를 찾아서 DI를 자동으로 해준다.
	@Autowired private Gun rifle;
	
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol);
	}
	
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
}
