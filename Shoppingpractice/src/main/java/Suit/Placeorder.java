package Suit;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Common;
import Page.Signin;



public class Placeorder extends Common{

	public Placeorder() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void loginsucces() throws InterruptedException
	{
		
		Signin si=new Signin(d);
	si.logins(prop.getProperty("email"), prop.getProperty("pass"));

	}
	
}
