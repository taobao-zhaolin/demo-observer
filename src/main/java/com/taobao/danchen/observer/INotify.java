package com.taobao.danchen.observer;

public interface INotify {
	/**
	 * 观察者需要执行的方法
	 */
	public void execute(Object object);
	
	/**
	 * 获得观察者ID
	 * @return
	 */
	public long getId();
	
}
