package com.taobao.danchen.observer;
/**
 * 被观察者需要实现的接口
 * @author danchen
 *
 */
public interface IObserverManagement {
	/**
	 * 添加一个观察者
	 * @param notify
	 */
	public boolean addObserver(INotify notify);
	
	/**
	 * 删除一个观察者
	 * @param notify
	 */
	public boolean deleteObserver(INotify notify);
	
	/**
	 * 通知所有的观察者
	 */
	public void notifyAllObservers();
}
