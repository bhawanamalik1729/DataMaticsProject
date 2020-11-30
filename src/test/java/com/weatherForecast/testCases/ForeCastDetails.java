package com.weatherForecast.testCases;

import static org.junit.Assert.assertEquals;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForeCastDetails extends Base{
	
	
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(ForeCastDetails.class.getName());
	
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {

		super.setUp();
		
	}

	@When("^enter valid \"([^\"]*)\"$")
	public void enter_valid(String city) throws Throwable {

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
		
		object.setHit();
		log.info("Entred the city and hit entred");
	}

	@Then("User must successfully display five days Weather Forecast")
	public void user_must_successfully_display_five_days_Weather_Forecast() {
		
			assertEquals(object.getRows(),5);
			assertEquals(object.getCols(),5);
		
		
		
		tearDown();
	}

}
