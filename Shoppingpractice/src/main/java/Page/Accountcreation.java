package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountcreation {
WebDriver d;
	
	public Accountcreation (WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//a[@class='login']")
	WebElement signin;
	@FindBy(xpath="//input[@id='email_create']")
	WebElement email;
	@FindBy(xpath="//form[@id='create-account_form']//span[1]")
	WebElement creat ;
	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement title ;
	@FindBy(xpath="//input[@id='customer_firstname']")
	WebElement fname ;
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement lname ;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwrd ;
	@FindBy(xpath="//input[@id='address1']")
	WebElement adress ;
	@FindBy(xpath="//input[@id='city']")
	WebElement city ;
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state ;
	@FindBy(xpath="//input[@id='postcode']")
	WebElement zip ;
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement mnumber ;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement register ;
	
	public void create(String emailadr) throws InterruptedException 
	{
		
		signin.click();
		Thread.sleep(5000);
		email.sendKeys(emailadr);
		creat.click();
		Thread.sleep(5000);
		
		
	}
	public void personalinfo(String fnm,String lnameee,String pasw,String adr,String cty,String postal,String phone) throws InterruptedException
	{
		title.click();
		
		
		fname.sendKeys(fnm);
		Thread.sleep(5000);
		lname.sendKeys(lnameee);
		Thread.sleep(5000);
		passwrd.sendKeys(pasw);
		Thread.sleep(5000);
		adress.sendKeys(adr);
		Thread.sleep(5000);
		city.sendKeys(cty);
		Thread.sleep(5000);
		Select s=new Select(state);
		Thread.sleep(5000);
		s.selectByVisibleText("Florida");
		Thread.sleep(5000);
		zip.sendKeys(postal);
		Thread.sleep(5000);
		mnumber.sendKeys(phone);
		Thread.sleep(5000);
		register.click();
		Thread.sleep(5000);
		
		
		
		
		
		
	}

}
