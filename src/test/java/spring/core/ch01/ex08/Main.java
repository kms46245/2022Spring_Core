package spring.core.ch01.ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
		Lion lion1 = ctx.getBean(Lion.class);
		Lion lion2 = ctx.getBean(Lion.class);
		
		Leopard leopard1 = ctx.getBean(Leopard.class);
		Leopard leopard2 = ctx.getBean(Leopard.class);
	
		Lapin lapin1 = ctx.getBean(Lapin.class);
		Lapin lapin2 = ctx.getBean(Lapin.class);
		
		System.out.println("Lion: " + (lion1 == lion2));			// lion은 기본값인 singleton이므로 하나의 bean으로 여러 객체를 생성한다.
		System.out.println("Leopard: " + (leopard1 == leopard2) );	// leopard도 직접 지정해준 singleton이지만 같은 결과가 도출된다.
		System.out.println("Lapin: " + (lapin1 == lapin2));			// lapin은 prototype이므로 매번 부를때마다 다른 bean으로 생성된다.
		
	}
}