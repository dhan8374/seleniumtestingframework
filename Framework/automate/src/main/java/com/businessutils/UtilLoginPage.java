package com.businessutils;

import java.util.concurrent.TimeUnit;

import com.configutil.Config;
import com.pagerepository.HomePage;
import com.pagerepository.LoginPage;

public class UtilLoginPage extends BaseUtil {
	
	public static void login(String userName) {
		
		//HomePage.clickSignInLink();
		
		//Passing data from the excel sheet
		LoginPage.enterUserName(userName);
		
		LoginPage.clickContinue();
		
	}

}
