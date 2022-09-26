package spring.core.ch02.ex04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	private final Logger logger;
	
	public MyLogger() {
		logger = LogManager.getLogger(MyLogger.class);
	}
	
	@After("@annotation(spring.core.ch02.ex04.Log)")	// 해당 클래스를 jp로 삼는다.
	public void log(JoinPoint jp) {
		logger.info(jp.toShortString());	// 정상흐름의 연출일때는 info
	}
	
	@AfterThrowing(pointcut="@annotation(spring.core.ch02.ex04.Log)", throwing="ex")		// jp에서 exception이 throw되면 작동하는 advice
	public void logError(JoinPoint jp, Throwable ex) {
		logger.error(jp.toShortString() + ": " + ex.getMessage());
	}
}