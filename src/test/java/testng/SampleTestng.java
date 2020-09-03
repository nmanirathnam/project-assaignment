package testng;

import java.util.Date;

//import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestng {
	static WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
		
	}
	
	@BeforeMethod
	public void startTime() {
		Date d= new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test(priority=-4)
	public void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.id("email"));
		w.sendKeys("manirathnam");
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys("jacksparrow");
		WebElement c=driver.findElement(By.xpath("//button[@name='login']"));
		c.click();
	}
	@Test(priority=-3)
	public void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.id("email"));
		w.sendKeys("jacksoafn");
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys("adsdn");
		WebElement c=driver.findElement(By.xpath("//button[@name='login']"));
		c.click();
	}
	@Test(priority=-1,invocationCount=3,enabled=false)
	public void tc3() {
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.id("email"));
		w.sendKeys("nmanirathnam");
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys("snowden");
		WebElement c=driver.findElement(By.xpath("//button[@name='login']"));
		c.click();
	}
	@Test(priority=-5,invocationCount=2)
	public void tc4() {
		driver.get("https://www.facebook.com/");
		WebElement w=driver.findElement(By.id("email"));
		w.sendKeys("nmanirathnam33");
		WebElement p=driver.findElement(By.id("pass"));
		p.sendKeys("dfvjjh");
		WebElement c=driver.findElement(By.xpath("//button[@name='login']"));
		c.click();
	}
	

}
