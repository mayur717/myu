package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Common {
	public static Properties prop;
	public Common() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Mayur\\eclipse-workspace\\Shoppingpractice\\src\\main\\java\\Base\\my.properties");
		
		prop.load(ip);
		
		
		
		
	}
	
	
	
	
	
	
	
	public String URL="http://automationpractice.com/index.php";
	public WebDriver d;
	@Parameters("browser")
	@BeforeMethod
	
	public void setUp(String browser)
	{
		//Launch browser
	
		 if(browser.equals("GC"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			  d= new ChromeDriver();
		}
		 else if(browser.equals("FF"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Mayur\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
				d=new FirefoxDriver();}
		 else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mayur\\Desktop\\test latest\\IEDriverServer.exe");
			d=new InternetExplorerDriver();
		}
		
		//Maximize browser
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		d.get(URL);
	}


	@AfterMethod
	public void tearDown()
	{
		//Close browser
		d.quit();
	}

}
