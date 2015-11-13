package com.PageO.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DentalPage extends AbstractPage {

	public DentalPage(WebDriver dr){
		super(dr);
	}
	public DentalPage fillZipdata(){
		dr.findElement(By.id("zipCode")).sendKeys("07152");
		return new DentalPage(dr);
	}
	public DentalResultpage submitClick(){
		dr.findElement(By.id("goBtn")).click(); 
		return new DentalResultpage(dr);
	}
}
