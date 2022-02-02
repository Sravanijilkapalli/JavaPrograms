package com.interfaces;

public class ServerImplementation implements Server{
	
	public static void main(String[] args) {
		
		//interfacename obj =new classname();
		
		Server obj = new ServerImplementation();
		
		obj.start("one");
		obj.run("two");
		obj.stop("three");
		
	}
	

	@Override
	public void start(String s) {
		System.out.println(s +"server started");
	}

	@Override
	public void run(String y) {
		System.out.println(y +"server runs");
	}

	@Override
	public void stop(String z) {
		System.out.println(z +"server Stopped");
		
	}	
}
