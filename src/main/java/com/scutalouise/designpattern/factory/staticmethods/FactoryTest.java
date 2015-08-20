package com.scutalouise.designpattern.factory.staticmethods;

public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}