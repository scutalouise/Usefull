package com.scutalouise.designpattern.factory.multimethods;

public class MailSender implements Sender {
	public void send() {
		System.out.println("this is MailSender.");
	}
}
