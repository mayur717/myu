package Suit;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Common;
import Page.Loginvalid;

public class Multilogin extends Common{

	public Multilogin() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void inval() throws InterruptedException
	{
	Loginvalid mm=new Loginvalid(d);
	mm.loggre("mayursalve717@gmail.com", "");

	}
	@Test
	public void m() throws InterruptedException
	{
	Loginvalid mm=new Loginvalid(d);
	mm.loggre("mayursalve717@gmail.com", "mayusalve");
	
	}

}
