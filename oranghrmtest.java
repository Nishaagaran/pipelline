package demo.demo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oranghrmtest {
WebDriver driver;

	@Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin1");
	driver.findElement(By.id("btnLogin")).click();
	WebElement ele=driver.findElement(By.id("welcome"));
	String a=ele.getText();
	Assert.assertEquals("Welcome Paul", a);
	System.err.println("test case passed");
	}
	
}
