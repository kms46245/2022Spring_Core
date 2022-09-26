package spring.core.ch02.ex02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex02")
@EnableAspectJAutoProxy		// 콘테이너 내에 aspect에 관련된 기능들을 추가한다.
							// 해당 annotation을 추가하지않으면 aspect에 관련된 코드들은 적용되지 않는다.
public class AppConfig {

}
