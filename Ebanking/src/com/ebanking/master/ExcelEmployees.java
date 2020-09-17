package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEmployees 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
       	Library LB=new Library();
       	LB.openApp("http://183.82.100.55/ranford2/");
       	LB.AdminLogin("Admin","M1ndq");
       	
       	FileInputStream Fis=new FileInputStream("E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.xlsx");
        XSSFWorkbook WB=new XSSFWorkbook(Fis);
        XSSFSheet WS=WB.getSheet("EMP");
        int R=WS.getLastRowNum();
        System.out.println(R);
        for(int i=1;i<=R;i++) 
        {
		XSSFRow WR=WS.getRow(i);
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.getCell(3);
		XSSFCell WC4=WR.createCell(4);
		
		String Enam=WC.getStringCellValue();
		String Lpa=WC1.getStringCellValue();
		String Rol=WC2.getStringCellValue();
		String Bran=WC3.getStringCellValue();
		String res=LB.Employcre(Enam,Lpa,Rol,Bran);
		WC4.setCellValue(res);
		
		}
        FileOutputStream Fos=new FileOutputStream("E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\EResult.xlsx");
        WB.write(Fos);
        WB.close();
	}

}
