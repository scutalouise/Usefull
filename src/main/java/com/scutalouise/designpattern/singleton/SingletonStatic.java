package com.scutalouise.designpattern.singleton;

public class SingletonStatic {

	/* 私有构造方法，防止被实例化 */
	private SingletonStatic() {
	}

	/* 此处使用一个内部类来维护单例 */
	private static class SingletonFactory {
		private static SingletonStatic instance = new SingletonStatic();
	}

	/* 获取实例 */
	public static SingletonStatic getInstance() {
		return SingletonFactory.instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}
}