package com.designpattern.carfamily;

public class BMWCar extends Car {

	public BMWCar(String carType) {
		super();
		this.carType = carType;
		this.color = "Black";
		this.model = "Sedan";
	}

	@Override
	public void specification() {
		System.out.println("Specification of " + carType + " are Color is "
				+ color + " and model is " + model);
	}

}
