package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {						// 2번째 파라미터로는 경로를 다써도되지만 class를 이용하여 간단히 불러올수있다.			
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}
