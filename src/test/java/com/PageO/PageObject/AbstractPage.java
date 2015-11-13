package com.PageO.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class AbstractPage  {
	protected WebDriver dr;
	
	public AbstractPage(WebDriver dr){
		this.dr = dr;
	}

	public WebDriver getDriver(){
		return dr;
	}
	public HomePage navigateToUrl(){
		dr.get("https://www.ehealthinsurance.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return new HomePage(dr);
	}
}
