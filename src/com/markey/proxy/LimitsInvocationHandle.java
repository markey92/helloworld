package com.markey.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//代理处理器，调用代理对象的操作都会转发到这里，再转发给真实对象。所以在此处进行访问控制，例如每次调用前打印点什么。
public class LimitsInvocationHandle implements InvocationHandler {
	Object target; //真实对象，即代理的对象
	//需要将真实对象传递进行，与代理处理器进行绑定
	public LimitsInvocationHandle(Object target) {
		super();
		this.target = target;
	}
	@Override
	/*
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 * 第一个参数：proxy是代理对象，
	 * 第二个参数：当前调用那个方法，
	 * 第三个参数：方法的参数。
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Begin you show, please"); //在真实对象的方法调用前做点什么
		method.invoke(target, args); //将方法调用转发给真实对象
		return null;
	}

}
