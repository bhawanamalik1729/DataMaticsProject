package com.weatherForecast.testCases;

import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.weatherForecast.pageObject.ForeCastPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class ForeCastDetailsCopy extends Base{
	
	//WebDriver driver = new ChromeDriver();
	ForeCastPageObject object = new ForeCastPageObject(driver);
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(ForeCastDetailsCopy.class.getName());
	/*@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}*/
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		log.info("Shailendra: I am here");
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("Open Brower complete");
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/Logger.class"));
		//core
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("Appender.class"));
		//config
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/log4j2.xml"));
	}

	@When("^enter valid \"([^\"]*)\"$")
	public void enter_valid(String city) throws Throwable {
//		driver.findElement(By.id("city")).clear();
//	    driver.findElement(By.id("city")).sendKeys(city);
		//ForeCastPageObject object = new ForeCastPageObject(driver);
		log.info("Bhawana I am here");
		object.setTxtCity(city);
	    log.info("Valid city entered");
	    
	}

	@When("Enter the URL")
	public void enter_the_URL_http_localhost() {
	   driver.get("http://127.0.0.1:3000/");
	   log.info("URL open sucessfully");
	}

	@When("Hit enter.")
	public void hit_enter() {
		//ForeCastPageObject object = new ForeCastPageObject(driver);
		object.setHit();
		log.info("Entred the city and hit entred");
	}

	@Then("User must successfully display five days Weather Forecast")
	public void user_must_successfully_display_five_days_Weather_Forecast() {
	    driver.close();
	}

}
