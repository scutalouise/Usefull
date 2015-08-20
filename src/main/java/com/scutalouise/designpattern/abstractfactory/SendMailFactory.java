package com.scutalouise.designpattern.abstractfactory;

public class SendMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}
}