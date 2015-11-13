package com.PageO.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DentalResultpage extends AbstractPage{

	public DentalResultpage(WebDriver dr){
		super(dr);
	}
	public String getConfirmMess(){
		return dr.findElement(By.xpath("//h2")).getText();
	}
}
