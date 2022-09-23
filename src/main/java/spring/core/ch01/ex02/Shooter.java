package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter
@NoArgsConstructor
@AllArgsConstructor

// @setter - setter를 만드는 lombok annotation
// @NoArgsConstructor - arguments가 없는 생성자 lombok annotation 
// @AllArgsConstructor - arguments를 가지는 생성자 lombok annotation
public class Shooter {
	private String name;
	private Gun gun;
	
	public void fire() {
		System.out.print(name + ": ");
		gun.fire();
	}
}
