package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginvalid {
	WebDriver d;
	public Loginvalid(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	
		
	}
	
	@FindBy(xpath="//a[@class='login']")
	WebElement sig;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement pas;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement ssign;
	
	public void loggre(String em,String pass) throws InterruptedException
	{
		sig.click();
		Thread.sleep(5000);
		email.sendKeys(em);
		Thread.sleep(5000);
		pas.sendKeys(pass);
		Thread.sleep(5000);
		ssign.click();
		Thread.sleep(5000);
		
		
	}
	

}
