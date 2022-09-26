package spring.core.ch02.ex02;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public Result calc() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
		
		Result result = new Result();
		result.setResult(1);
		
		return result;
	}
}
