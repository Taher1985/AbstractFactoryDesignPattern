package com.designpattern.abstractfactory;

import com.designpattern.bikefamily.Bike;
import com.designpattern.bikefamily.CBZBike;
import com.designpattern.bikefamily.PulsarBike;
import com.designpattern.bikefamily.YamahaBike;

public class BikeFactory extends AbstractFactory<Bike> {

	@Override
	public Bike create(String type) {
		switch (type) {
		case "CBZ":
			return new CBZBike(type);
		case "Pulsar":
			return new PulsarBike(type);
		case "Yamaha":
			return new YamahaBike(type);
		default:
			break;
		}
		return null;
	}

}
