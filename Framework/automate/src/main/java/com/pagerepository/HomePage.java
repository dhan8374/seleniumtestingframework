package com.pagerepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.businessutils.BaseUtil;


public class HomePage extends BaseUtil {
	    
	static WebElement linkLogin=driver.findElement(By.linkText("Log In"));
    
	    //Login click function 
		public static void clickSignInLink() {
			linkLogin.click();
		}
		
	   
	  }
	
	


