package com.scutalouise.designpattern.singleton;

public class SingletonSynchronized {

	private static SingletonSynchronized instance = null;

	private SingletonSynchronized() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonSynchronized();
		}
	}

	public static SingletonSynchronized getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
}