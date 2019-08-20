package com.somitsolutions.java.Callback;

public class Callee {
	private Callback cb ;
	
	public Callee (Callback cb) {
		this.cb = cb ;
	}
	
	public void doAsynchronousTask() {
		System.out.println("I am starting the Asynchronous Task....");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		System.out.println("I am done with the Asynchronous Task....... ");
		cb.notifyCaller();
		
	}
	
	

}
