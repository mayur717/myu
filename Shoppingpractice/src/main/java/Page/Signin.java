package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Signin {
	
WebDriver d;
	
	public Signin (WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signin;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	@FindBy(xpath="//p[@class='submit']//span[1]")
	WebElement sign;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement woman;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
	WebElement dress;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	WebElement img;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]")
	WebElement quickview;
	@FindBy(xpath="//i[@class='icon-plus']")
	WebElement plus;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addtocart;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	
	WebElement secondprcocheck;
	
	
	@FindBy(xpath="//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
	WebElement thirdcheck;
	@FindBy(xpath="//input[@id='cgv']")
	WebElement iagree;
	@FindBy(xpath="//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceed;
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement bank;
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement confirmorder;
	
	@FindBy(xpath="//span[@id='total_price']")
	WebElement total;
	
	@FindBy(xpath="//span[contains(text(),'mayur salve')]")
	WebElement profile;
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	WebElement hist;
	@FindBy(xpath="//span[contains(text(),'Details')]")
	WebElement details;
	
	@FindBy(xpath="//tr[@class='totalprice item']//span[@class='price'][contains(text(),'$54.00')]")
	WebElement finalt;
	public void logins(String em,String ps) throws InterruptedException {
		
		signin.click();
		Thread.sleep(3000);
		email.sendKeys(em);
		password.sendKeys(ps);
		Thread.sleep(3000);
	
		sign.click();
		Actions a=new Actions(d);
		a.moveToElement(woman).build().perform();
		Thread.sleep(3000);
		dress.click();
		
		
		Thread.sleep(3000);
		Actions aa=new Actions(d);
		aa.moveToElement(img).build().perform();
		Thread.sleep(3000);
		quickview.click();
		Thread.sleep(3000);
		d.switchTo().frame(0);
		Thread.sleep(3000);
		plus.click();
		addtocart.click();
		Thread.sleep(3000);
		checkout.click();
		
	
		Thread.sleep(3000);
		secondprcocheck.click();
		Thread.sleep(3000);
		thirdcheck.click();
		Thread.sleep(3000);
		iagree.click();
		Thread.sleep(3000);
		proceed.click();
		Thread.sleep(3000);
		String s1=total.getText();
		System.out.println("Total price is"+s1);
		bank.click();
		confirmorder.click();
		Thread.sleep(3000);
		profile.click();
		Thread.sleep(3000);
		hist.click();
		Thread.sleep(3000);
		details.click();
		String s2=finalt.getText();
		System.out.println("order details price is"+s2);
		Assert.assertEquals(s1, s2);
		
		
		
		
		
	}
		
		
		
		
		

}
