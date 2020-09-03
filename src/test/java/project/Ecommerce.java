package project;

import java.util.*;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce {
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
	
	@Test
	public void tc1() {
		driver.get("https://www.amazon.in/");
		WebElement w=driver.findElement(By.id("twotabsearchtextbox"));
		w.sendKeys("iphone 11",Keys.ENTER);
		List<WebElement> products=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int size=products.size();
		System.out.println("no of products"+size);
		for (int i = 0; i < products.size(); i++) {
			WebElement iphones =products.get(i);
			String text=iphones.getText();
			System.out.println(text);
			
		}
}
}
