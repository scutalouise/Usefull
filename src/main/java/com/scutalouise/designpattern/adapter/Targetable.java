package com.scutalouise.designpattern.adapter;
/**
 * 
 * @author scuta
 * since 2015年5月27日 下午4:40:39
 */
public interface Targetable {
	/**
	 * 三种实现adapter方式：
	 * 类adapter
	 * 对象adapter
	 * 接口adapter
	 */

	/* 与原类中的方法相同 */
	public void method1();

	/* 新类的方法 */
	public void method2();
}