package com.weatherForecast.pageObject;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForeCastPageObject {
	
	WebDriver driver;
	String errMsg;
	public ForeCastPageObject(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(this.driver, this);
		
	}

	@FindBy(id = "city")
	WebElement txtCity;
	
	@FindBy(xpath = "//div[@id='root']/div[1]/div[@data-test='error']" )
	WebElement errorMsg;
			
	//String errMsg = this.driver.findElement(By.xpath("//div[@id='root']/div[1]/div[@data-test='error']")).getText();
	@FindBy(xpath = "//div[@id='root']/div/div")
	List<WebElement> rows;
	
	@FindBy(xpath = "//div[@id='root']/div/div[1]/div[1]/span")
	List<WebElement> cols;
	
	@FindBy(xpath = "//div[@id='root']/div[1]/div[1]/div[@class='summary']/span[1]")
	WebElement lblDay;
	
	@FindBy(xpath = "//div[@id='root']/div[1]/div[1]/div[@class='summary']/span[2]")
	WebElement lblNextDay;
	
//	@FindBy(xpath = "//div[@id='root']/div[1]/div[1]/div[2]")
//	List<WebElement> lblDayCell;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div")
	List<WebElement> lblDayCell;
	
	@FindBy(xpath="//div[@class='details']/div[1]/span[1]/span[@data-test='hour-1-1']")
	WebElement lblHour;
	
	public WebElement getTxtCity() {
		return txtCity;
	}

	public void setHit() {
		
		this.txtCity.sendKeys(Keys.ENTER);
		
	}
	public void setTxtCity(String txtCity) {
		System.out.println("driver in settxtCity is : "+driver);
		this.txtCity.clear();
		this.txtCity.sendKeys(txtCity);
		System.out.println(txtCity);
		
	}
	
	public String getErrorMsg() {
		errMsg = errorMsg.getText();
		return errMsg;
		
	}
	
	public int getRows() {
		return rows.size();
				
	}
	
	public int getCols() {
		return cols.size();
				
	}
	
	public void setlblDay() {
		
		this.lblDay.click();
		System.out.println(lblDay);
		
	}
	
public String getLblNextDay() {
	
	System.out.println("next day is : " +this.lblDay.getText());
		return this.lblDay.getText();
		
		
	}
	
	public int getLblDayCell() {
		System.out.println("cell count is :"+ lblDayCell.size());
		return lblDayCell.size();
				
	}
	
	public String getlblHour() {
		System.out.println("hour is as : " + lblHour.getText());
		return lblHour.getText();
		
		
	}
	
	

}
