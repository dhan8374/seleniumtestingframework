package com.tests;

import java.util.concurrent.TimeUnit;

import com.businessutils.BaseUtil;
import com.businessutils.UtilLoginPage;
import com.excelutil.ExcelUtil;
import com.pagerepository.HomePage;

public class LoginTest extends BaseUtil {
	
public static void main(String args[]) {
	
	int rowCount=ExcelUtil.getRowCount();
	
	for(int i=1;i<=rowCount;i++) {
		String userName=ExcelUtil.getData(i, 0);
		System.out.println(userName);
		BaseUtil.openBrowser();
		HomePage.clickSignInLink();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		UtilLoginPage.login(userName);
		BaseUtil.quitDriver();
				
	}
	
	
}
	

}
