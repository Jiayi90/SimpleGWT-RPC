package edu.example.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.example.client.service.ExampleService;

public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		
		String greeting = "hello" +name;
		
		return greeting;
	}

	@Override
	public int addTwoNumbers(int num1, int num2) {
		
		int y= num1 +num2;
		return y;
	}

	@Override
	public String sayGuteNacht(String name) {
		// TODO Auto-generated method stub
		String greeting = "Gute Nacht"+name;
		return greeting;
	}



}
