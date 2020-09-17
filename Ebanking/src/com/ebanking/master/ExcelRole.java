package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRole {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Library LB=new Library();
		LB.openApp("http://183.82.100.55/ranford2/");
		LB.AdminLogin("Admin","M1ndq");
		
		FileInputStream Fis=new FileInputStream("E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		 XSSFSheet WS=WB.getSheet("Role");
		 int R=WS.getLastRowNum();
		 System.out.println(R);
		 for (int i =1; i<=R; i++) 
		 {
			XSSFRow WR=WS.getRow(i);
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			XSSFCell WC2=WR.getCell(2);
			XSSFCell WC3=WR.createCell(3);
			
			String Ron=WC.getStringCellValue();
			String Rod=WC1.getStringCellValue();
			String Rot=WC2.getStringCellValue();
			String res=LB.Rolecre(Ron,Rod,Rot);
			WC3.setCellValue(res);
			
		 }	
			FileOutputStream Fos=new FileOutputStream("E:\\project automation\\Ebanking\\src\\com\\ebanking\\results\\Role.xlsx");
			WB.write(Fos);
			WB.close();
		}

	}
