package com.pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.businessutils.BaseUtil;

public class LoginPage extends BaseUtil {
	    
	    static WebElement txtUsername=driver.findElement(By.name("usernameOrEmail"));
		static WebElement btnContinue=driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
		
		//pass value to the textbooks user name
		   public static void enterUserName(String username) {
		   txtUsername.sendKeys(username);
		   
		    }
		  
		   //button click function for continue function
		  public static void clickContinue() {
			
			btnContinue.click();

		
		
}
}
