package com.designpattern.bikefamily;

public class CBZBike extends Bike {

	public CBZBike(String bikeType) {
		super();
		this.bikeType = bikeType;
		this.color = "Silver";
		this.model = "2014";
	}

	@Override
	public void specification() {
		System.out.println("Specification of " + bikeType + " are Color is "
				+ color + " and model is " + model);
	}

}
