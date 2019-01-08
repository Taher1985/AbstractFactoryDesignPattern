package com.designpattern.bikefamily;

public class PulsarBike extends Bike {

	public PulsarBike(String bikeType) {
		super();
		this.bikeType = bikeType;
		this.color = color;
		this.model = model;
	}

	@Override
	public void specification() {
		System.out.println("Specification of " + bikeType + " are Color is "
				+ color + " and model is " + model);
	}

}
