package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;


public class Excel 
{
    
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	  Library LB=new Library();
	  LB.openApp("http://183.82.100.55/ranford2/");
	  LB.AdminLogin("Admin","M1ndq");
	  
	  //To get Test Data Excel file
	  
	  FileInputStream Fis=new FileInputStream("E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.xlsx");
	  
	  //WorkBook
	  XSSFWorkbook WB=new XSSFWorkbook(Fis);
	  //Sheet
	  XSSFSheet WS=WB.getSheet("BDATA");
	  //Row Count
	  int RC=WS.getLastRowNum();
	  System.out.println(RC);
	  //Multiple iterations between the loop
	  for(int i=1;i<=RC;i++)
	  {
		  //Row
		  XSSFRow WR=WS.getRow(i);
		  //Cell
		  XSSFCell WC=WR.getCell(0);
		  XSSFCell WC1=WR.getCell(1);
		  XSSFCell WC2=WR.getCell(2);
		  XSSFCell WC3=WR.getCell(3);
		  XSSFCell WC4=WR.getCell(4);
		  XSSFCell WC5=WR.getCell(5);
		  XSSFCell WC6=WR.getCell(6);
		  XSSFCell WC7=WR.getCell(7);
		  XSSFCell WC8=WR.getCell(8);
		  XSSFCell WC9=WR.createCell(9);
		  
		  //Cell Value
		  String Bname1=WC.getStringCellValue();
		  String Add111=WC1.getStringCellValue();
		  String Add121=WC2.getStringCellValue();
		  String Add131=WC3.getStringCellValue();
		  String Area1=WC4.getStringCellValue();
		  String Zpc1=WC5.getStringCellValue();
		  String Country=WC6.getStringCellValue();
	      String State=WC7.getStringCellValue();
		  String City=WC8.getStringCellValue();
		 String res=LB.Branchcre(Bname1, Add111, Add121, Add131, Area1, Zpc1,Country,State,City);
		 WC9.setCellValue(res);
		 
		  
	  }
	  FileOutputStream Fos=new FileOutputStream("E:\\project automation\\Ebanking\\src\\com\\ebanking\\results\\Branch.xlsx");
      WB.write(Fos);
      WB.close();
	}

	
}
