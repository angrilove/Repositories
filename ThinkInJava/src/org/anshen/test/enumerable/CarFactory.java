package org.anshen.test.enumerable;

enum CarFactory {
	FordCar, BuickCar;
	
	public Car create() {
		switch (this) {
		case FordCar:
			return new FordCar();
		case BuickCar:
			return new BuickCar();
		default:
			throw new AssertionError("无效参数");
		}
	}
	
	public static void mian(String[] args) {
		Car car = CarFactory.FordCar.create();
		
		System.out.println(car);
	}

}

interface Car {
	
}

class FordCar implements Car {
	final int out = 1;
}

class BuickCar implements Car {
	
}
