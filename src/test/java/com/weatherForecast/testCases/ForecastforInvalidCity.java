package com.weatherForecast.testCases;

import static org.junit.Assert.assertEquals;
import org.apache.logging.log4j.LogManager;

//import com.weatherForecast.pageObject.ForeCastPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForecastforInvalidCity extends Base {
	
	
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(ForeCastDetails.class.getName());
	
	@Given("^Browser is open$")
	public void browser_is_open() throws Throwable {

		setUp();
		
	}
	
	@When("^User enter URL$")
	public void user_enter_URL() throws Throwable {
		driver.get("http://127.0.0.1:3000/");
		   log.info("URL open sucessfully");
	}

	
	@When("^User enter invalid city\\.$")
	public void user_enter_invalid_city() throws Throwable {
		//ForeCastPageObject object = new ForeCastPageObject(driver);
	    object.setTxtCity("Delhi");
	    
	}

	@When("^Hit on enter\\.$")
	public void hit_on_enter() throws Throwable {
		//ForeCastPageObject object = new ForeCastPageObject(driver);
		object.setHit();
		log.info("Entred the city and hit entred");
	    
	}

	@Then("^verify error message\\.$")
	public void verify_error_message() throws Throwable {
		
		//ForeCastPageObject object = new ForeCastPageObject(driver);
		String message = "Error retrieving the forecast";
		String errorMessage = object.getErrorMsg();
		
		assertEquals(message, errorMessage);
		
		tearDown();

		
	}

}
