package com.designpattern.abstractfactory;

import com.designpattern.carfamily.BMWCar;
import com.designpattern.carfamily.Car;
import com.designpattern.carfamily.LemozeneCar;
import com.designpattern.carfamily.MercedesCar;

public class CarFactory extends AbstractFactory<Car> {

	@Override
	public Car create(String type) {
		switch (type) {
		case "BMW":
			return new BMWCar(type);
		case "Mercedes":
			return new MercedesCar(type);
		case "Lemozene":
			return new LemozeneCar(type);
		default:
			break;
		}
		return null;
	}

}
