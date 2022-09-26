package spring.core.ch02.ex01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Rabbit rabbit = new Rabbit();
		
		calculator.start();
		rabbit.start();
		
		//이것으로 알고싶은것은 다른 작업이더라도 비슷한 aspect가 있으면 안의 내용물이 달라 중복이 된다.
	}
}
