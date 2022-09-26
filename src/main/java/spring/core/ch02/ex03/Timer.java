package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect			// 여기서의 aspect는 advise를 가진 bean을 뜻하고, 그에 관한 메서드를 advise라고 한다.
@Component
public class Timer {
	@Before("execution(* spring..*(int))")	// joinpoint가 실행되기 전
	// before(method의 패턴(리턴타입 / 메서드[클래스]명/ 메서드))
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString()); // 해당 joinpoint의 메서드명
		System.out.println("시작 시각: " + LocalDateTime.now());
	}
	
	@After("within(spring..Calculator)")	// joinpoint가 실행된 직후
	// before와는 다르게 클래스명 까지만 기술(현재기준 spring으로 시작해 calculator로 끝나는 메서드)
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	
	@AfterReturning(pointcut="bean(calc*)", returning="result")	// joinpoint가 무언가를 return했을때 (성공했을때) 실행
					// pointcut = 해당 joinpoint의 기준 / returning = 리턴값
	public void printResult(JoinPoint jp, int result) {
		System.out.println(jp.toShortString() + ": " + result);
	}
}