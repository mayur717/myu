package Suit;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Common;
import Page.Accountcreation;


public class Creat extends Common{
	public Creat() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void creation() throws InterruptedException
	{
		Accountcreation ac=new Accountcreation(d);
		
		ac.create("mayursalve9@gmail.com");
		ac.personalinfo("mayur", "salve", "mayusalve", "gopal co op society", "pune", "52025", "989526523");
		
		
		
	}
	

}
