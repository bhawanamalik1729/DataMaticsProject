package com.weatherForecast.testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.weatherForecast.pageObject.ForeCastPageObject;


public class Base {
	
	public static WebDriver driver;
	public ForeCastPageObject object;
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		object = new ForeCastPageObject(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		System.out.println(driver.getTitle());
	}
	
	
	public void tearDown() {
		
		driver.close();
		}

}
