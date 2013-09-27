package com.taobao.danchen.observer;

import java.util.Random;
/**
 * TV
 * @author danchen
 *
 */
public class TV implements INotify {
	
	private long id;
	
	public TV() {
		Random random = new Random();
		id = random.nextLong();
	}

	@Override
	public void execute(Object data) {
		if(data instanceof String){
			System.out.println("TV:"+data);
		}else{
			System.out.println("object can't be deal with.");
		}
	}

	@Override
	public long getId() {
		return id;
	}

}
