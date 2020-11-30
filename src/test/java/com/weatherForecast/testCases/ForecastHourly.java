package com.weatherForecast.testCases;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;

import com.weatherForecast.pageObject.ForeCastPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForecastHourly extends Base {
	
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(ForeCastDetails.class.getName());
	
	@Given("^User is on URL$")
	public void user_is_on_URL() throws Throwable {
	    setUp();
	    driver.get("http://127.0.0.1:3000/");
	}

	@When("^User enter city name$")
	public void user_enter_city_name() throws Throwable {
		
	    object.setTxtCity("aberdeen");
	}

	@When("^Hit enter$")
	public void hit_enter() throws Throwable {
		object.setHit();
		log.info("Entred the city and hit entred");
	}

	@When("^select day column$")
	public void select_day_column() throws Throwable {
		object.setlblDay();
	    
	}

	@Then("^Display three hourly forecast on page\\.$")
	public void display_three_hourly_forecast_on_page() throws Throwable {
		assertEquals(object.getLblDayCell(),3);
		assertEquals(object.getlblHour(),"1730");	
		tearDown();
	}

}
