package com.businessutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.configutil.Config;

public class BaseUtil {
	//So in other classes we can use this
	static public WebDriver driver=null;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhanya\\Desktop\\Internship\\Framework\\automate\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(Config.get("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    		
	}
	public static void quitDriver() {
		driver.close();
		driver.quit();
	}

}
