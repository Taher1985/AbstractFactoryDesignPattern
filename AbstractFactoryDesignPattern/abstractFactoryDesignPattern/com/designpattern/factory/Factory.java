package com.designpattern.factory;

import com.designpattern.abstractfactory.AbstractFactory;

public class Factory<T> {

	public T create(AbstractFactory<T> abstractFactory, String type) {
		return abstractFactory.create(type);
	}
}
