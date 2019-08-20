package com.somitsolutions.java.Callback;

public class Caller implements Callback {
	
	Callee callee = new Callee(this);

	@Override
	public void notifyCaller() {
		// TODO Auto-generated method stub
		System.out.println("Thank you callee for executing my task.....");
		System.out.println("Now I will take the data and process.....");
		
	}
	
	public void callAsynchronousTask() {
		callee.doAsynchronousTask();
		
	
		
	}
	


}
