package com.PageO.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver dr){
		super(dr);
	}
	
	public DentalPage clickonDental(){
		dr.findElement(By.xpath("//li[@id='ifp-dental']/a")).click();
		
		return new DentalPage(dr);
	}
}
