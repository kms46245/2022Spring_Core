package spring.core.ch01.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.core.ch01.ex02.Shooter;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}
