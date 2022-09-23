package spring.core.ch01.ex01;

public class Shooter {
	private Gun gun;
	
	public Shooter(Gun gun) {
		this.gun = gun;
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		gun.fire();
	}
}
