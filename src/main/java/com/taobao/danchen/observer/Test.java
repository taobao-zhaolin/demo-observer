package com.taobao.danchen.observer;

public class Test {

	public static void main(String[] args) {
		//声明一个被观察者
		TargetObject observerdObject = new TargetObject();
		//声明第一个观察者
		TV newsPaper = new TV();
		observerdObject.addObserver(newsPaper);
		//声明第二个观察者
		IPad ipad = new IPad();
		observerdObject.addObserver(ipad);
		
		//
		observerdObject.dataChanged();
	}

}
