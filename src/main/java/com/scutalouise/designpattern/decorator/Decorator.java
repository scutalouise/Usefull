package com.scutalouise.designpattern.decorator;
/**
 * @author scuta
 * since 2015年5月27日 下午4:51:24
 * 装饰器模式的应用场景：
	1、需要扩展一个类的功能。
	2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
	缺点：产生过多相似的对象，不易排错！
 * 
 */
public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}
}