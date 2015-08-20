package com.scutalouise.designpattern.singleton;

import java.util.Vector;

@SuppressWarnings("rawtypes")
public class SingletonPractice {

	private static SingletonPractice instance = null;
	private Vector properties = null;

	public Vector getProperties() {
		return properties;
	}

	private SingletonPractice() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonPractice();
		}
	}

	public static SingletonPractice getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	public void updateProperties() {
		SingletonPractice shadow = new SingletonPractice();
		properties = shadow.getProperties();
	}
}