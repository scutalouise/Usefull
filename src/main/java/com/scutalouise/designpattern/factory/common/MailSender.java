package com.scutalouise.designpattern.factory.common;

public class MailSender implements Sender {
	public void send() {
		System.out.println("this is MailSender.");
	}
}
