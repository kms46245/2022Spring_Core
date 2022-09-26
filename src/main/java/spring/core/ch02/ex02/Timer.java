package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Aspect의 기능을 가진 클래스라고 선언
@Aspect			
@Component
public class Timer {
			// 조건의 순서는 접근자/리턴타입/콘텍스트패스(파라미터)가 된다.
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")	//pointcut - joinpoint로 삼을 기준을 지정해준다.
	private void myPointcut() {} // 이렇게 포인트컷을 만들었고 그것을 해당이름의 메서드로 콜한다.
	
	@Around("myPointcut()")  // Around([PointCut]) - jp를 기점으로 전후로 작동을 한다는것을 지정
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature());	// 현재의 jp를 확인
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		// 여기서의 결합되는 지점을 jp(join point)라고하고, 지금의 과정에선 calc과 sleep이 그것이 된다.
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");
		return result;
	}
}
