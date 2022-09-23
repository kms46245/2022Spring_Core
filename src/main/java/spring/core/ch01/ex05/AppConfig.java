package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.core.ch01.ex05")	// 해당 패키지 이하를 스캔하여 발견시 작업(추가요망) 
public class AppConfig {
	
}
