package week1.day2;

public class Car {
	public void applyBreak() {
		System.out.println("Apply break");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Switch On Ac");
	}
	public void applyaccelerator() {
		System.out.println("Apply accelerator");
	}
	public static void main(String[] args) {
		Car a= new Car();
		a.applyBreak();
		a.applyGear();
		a.switchOnAc();
		a.applyaccelerator();
	}

}
