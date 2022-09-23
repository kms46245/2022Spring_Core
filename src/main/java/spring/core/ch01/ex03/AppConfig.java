package spring.core.ch01.ex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Pistol;
import spring.core.ch01.ex01.Rifle;
import spring.core.ch01.ex02.Shooter;


@Configuration	// 일반적인 @Bean이 아닌 config용도의 Bean임을 표현함
public class AppConfig {
	// bean - 해당 컨테이너에 이름을가진 bean을 생성한다.
	@Bean
	public Pistol pistol() {
		return new Pistol();
	}
	
	@Bean
	public Rifle rifle() {
		return new Rifle();
	}
	
	@Bean  //1. 생성자(Constructor)를 이용
	public Shooter shooter1() {
		return new Shooter("최한석", pistol());	// 이렇게 피스톨을 부른다고해서 계속 생성하는것이아니라,
	}											// bean에서 singleton단위로 만들기때문에, 없으면 생성 있으면 그것을 이용한다.
	
	@Bean	// 2. Setter를 이용
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setName("한아름");
		shooter.setGun(rifle());
		
		return shooter;
	}
}
