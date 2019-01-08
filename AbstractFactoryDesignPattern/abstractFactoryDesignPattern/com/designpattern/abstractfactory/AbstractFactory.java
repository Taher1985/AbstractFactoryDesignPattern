package com.designpattern.abstractfactory;

public abstract class AbstractFactory<T> {

	public abstract T create(String type);

}
