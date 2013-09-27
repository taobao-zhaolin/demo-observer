package com.taobao.danchen.observer;

import java.util.Random;
/**
 * IPad
 * @author danchen
 *
 */
public class IPad implements INotify {
	
	private long id;
	
	public IPad() {
		Random random = new Random();
		id = random.nextLong();
	}

	@Override
	public void execute(Object data) {
		if(data instanceof String){
			System.out.println("IPad:"+data);
		}

	}

	@Override
	public long getId() {
		return id;
	}

}
