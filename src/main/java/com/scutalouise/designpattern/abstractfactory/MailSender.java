package com.scutalouise.designpattern.abstractfactory;

public class MailSender implements Sender {
	public void send() {
		System.out.println("this is MailSender.sender()");
	}
}