package com.designpattern.client;

import com.designpattern.abstractfactory.BikeFactory;
import com.designpattern.abstractfactory.CarFactory;
import com.designpattern.bikefamily.Bike;
import com.designpattern.carfamily.Car;
import com.designpattern.factory.Factory;

public class Client {

	public static void main(String[] args) {
		Car car = new Factory<Car>().create(new CarFactory(), "BMW");
		car.specification();

		Bike bike = new Factory<Bike>().create(new BikeFactory(), "CBZ");
		bike.specification();
	}

}
