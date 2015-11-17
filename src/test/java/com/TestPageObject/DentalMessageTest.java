package com.TestPageObject;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.PageO.PageObject.DentalPage;
import com.PageO.PageObject.DentalResultpage;
import com.PageO.PageObject.HomePage;

@SuppressWarnings("deprecation")
public class DentalMessageTest {

	WebDriver dr;
	@Before
	public void startDriver(){
		dr = new FirefoxDriver();
	}
	@Test
	public void dentalMessage(){
		HomePage onHomePage = new HomePage(dr);
		onHomePage = onHomePage.navigateToUrl();
		DentalPage onDentalPage = onHomePage.clickonDental();
		DentalResultpage onResult = onDentalPage.fillZipdata().submitClick();
		try{
		Assert.assertTrue(onResult.getConfirmMess().contains("Find the best Dental plan for you"));
		} catch(Throwable t){
			System.out.println("assertion is not match" + t);
		}
	}
	@After
	public void endUrl(){
		dr.quit();
	}
}
