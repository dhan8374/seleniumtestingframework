package com.commonutils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtil {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		XSSFWorkbook workbook=null;
		try {
		    workbook=new XSSFWorkbook("C:\\Users\\Dhanya\\Desktop\\Internship\\Framework\\automate\\TestData\\Testdata.xlsx");
		    } catch (IOException e) {
		   		   e.printStackTrace();
		  }
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int columncount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columncount);
		
		
}
}
