package com.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.businessutils.BaseUtil;
import com.businessutils.UtilLoginPage;
import com.excelutil.ExcelUtil;
import com.pagerepository.HomePage;


public class TestLoginTestNG {
	@BeforeTest
	public void beforeTest() {
		BaseUtil.openBrowser();
		}
	
	@AfterTest
	public void afterTest() {
		BaseUtil.quitDriver();
		}
	
  @Test
  public void loginTest() {
	  
	  HomePage.clickSignInLink();
	  
		int rowCount=ExcelUtil.getRowCount();
		for(int i=1;i<=rowCount;i++) {
			String userName=ExcelUtil.getData(i, 0);
			System.out.println(userName);
			//HomePage.clickSignInLink();
			UtilLoginPage.login(userName);
			
			 }
}
}
