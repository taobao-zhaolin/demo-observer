package com.taobao.danchen.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
/**
 * 被观察者对象
 * @author danchen
 *
 */
public class TargetObject implements IObserverManagement {
	
	private List<INotify> observerList = new LinkedList<INotify>();
	
	private String data;

	public TargetObject() {
		super();
	}
	
	public void dataChanged(){
		while(true){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Random random = new Random();
			data = "danchen"+random.nextInt();
			notifyAllObservers();
		}
	}

	public String getData() {
		return data;
	}

	@Override
	public boolean addObserver(INotify notify) {
		for(int i=0;i<observerList.size();i++){
			INotify observer = observerList.get(i);
			if(observer.getId()==notify.getId()){
				return false;
			}
		}
		
		this.observerList.add(notify);
		return true;
	}

	@Override
	public boolean deleteObserver(INotify notify) {
		for(int i=0;i<observerList.size();i++){
			INotify observer = observerList.get(i);
			if(observer.getId()==notify.getId()){
				observerList.remove(i);
				break;
			}
		}
		
		return true;
	}

	@Override
	public void notifyAllObservers() {
		for(int i=0;i<observerList.size();i++){
			INotify observer = observerList.get(i);
			try {
				observer.execute(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
