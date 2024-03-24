import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Introduction1  {


		// TODO Auto-generated method stub
		
	WebDriver driver; 
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		
			@Test
			
			public void login() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "path of driver");
		//	WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.browserstack.com/users/sign_in");
			Thread.sleep(3000);
			driver.findElement(By.id("user_email_login")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("user_password")).sendKeys("your_password");
			driver.findElement(By.name("commit")).click();
			
			
		//	String actualUrl="https://live.browserstack.com/dashboard";
		//	String expectedUrl= driver.getCurrentUrl();
			//Assert.assertEquals(expectedUrl,actualUrl);
			}
			
			@AfterClass
			public void teardown()
			{
				driver.quit();
			}
			
			
			}	

	

