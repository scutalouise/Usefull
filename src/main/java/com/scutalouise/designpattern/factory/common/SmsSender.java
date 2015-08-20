package com.scutalouise.designpattern.factory.common;

public class SmsSender implements Sender {
	public void send() {
		System.out.println("this is SmsSender.");
	}
}
