package spring.core.ch02.ex04;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	@Log						// jp가 될 메서드에 @Log를 붙혀준다.
	public void add() {
		System.out.println(1 + 2);
	}
	
	public void minus() {
		System.out.println(2 - 1);
	}
	
	// exception을 발생시키기 위한 메서드
	@Log
	public void divide() {
		int result = 1 / 0;
		System.out.println(result);
	}
}
