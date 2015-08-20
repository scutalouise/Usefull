package com.scutalouise.designpattern.factory.multimethods;

public class SmsSender implements Sender {
	public void send() {
		System.out.println("this is SmsSender.");
	}
}
