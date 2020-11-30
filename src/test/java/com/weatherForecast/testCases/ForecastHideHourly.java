package com.weatherForecast.testCases;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForecastHideHourly extends Base{
	
	private static org.apache.logging.log4j.Logger log =LogManager.getLogger(ForeCastDetails.class.getName());
	String nextDay;
	@Given("^User is on browser$")
	public void user_is_on_browser() throws Throwable {
	    setUp();
	    driver.get("http://127.0.0.1:3000/");
	}

	@When("^enter city name\\.$")
	public void enter_city_name() throws Throwable {
		object.setTxtCity("aberdeen");
		object.setHit();
	}
	
		
	@When("^click on day$")
	public void click_on_day() throws Throwable {
		object.setlblDay();
		log.info("Hide 3 houly data");
	}

	@When("^again click on day$")
	public void again_click_on_day() throws Throwable {
		object.setlblDay();
	}
	
	@Then("^hide (\\d+) hourly forecast from page\\.$")
	public void hide_hourly_forecast_from_page(int arg1) throws Throwable {
	
		nextDay = "Tue20";
		
		assertEquals(object.getLblNextDay(),nextDay);
		
		tearDown();
	
	}


}
