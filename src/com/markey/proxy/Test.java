package com.markey.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActionOne actionOne = new ActionOneImpl(); //创建真实对象
		ActionOne actionOneProxy = (ActionOne) getProxy(actionOne); //动态创建代理对象
		actionOneProxy.sayHello("world"); //调用代理对象
		
		ActionTwo actionTwo = new ActionTwoImpl();
		ActionTwo actionTwoProxy = (ActionTwo) getProxy(actionTwo);
		actionTwoProxy.introduce("Markey");

		actionOneProxy.sayHello("world，again");//再次调用代理对象

	}
	//创建代理对象方法
	public static Object getProxy(Object action) {
		/*
		 * 第一个参数是类加载器，
		 * 第二个参数是真实委托对象所实现的的接口，
		 * 第三个参数是代理处理器，其中实现了访问控制
		 */
		return Proxy.newProxyInstance(action.getClass().getClassLoader(), 
				action.getClass().getInterfaces(), new LimitsInvocationHandle(action));
	}
}
