package spring.core.ch01.ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		// 이 시점에서 이미 콘테이너가 생성되었으므로, lion is born은 나온다.
		
						// 이렇게하면 Id의 값만으로도 bean을 찾을수 있다.
		Lion lion = ctx.getBean(Lion.class);
		lion.shout();
		
		ctx.close();	// container를 종료하는 메서드
	}
}
