package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadEmp {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	  Library LB=new Library();
	  LB.openApp("http://183.82.100.55/ranford2/");
	  LB.AdminLogin("Admin","M1ndq");
	  
	  String Fpath="E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\Emp.txt";
	  String Rpath="E:\\project automation\\Ebanking\\src\\com\\ebanking\\results\\Res_Emp.txt";
	  String SD;
	  FileReader FR=new FileReader(Fpath);
	  BufferedReader BR=new BufferedReader(FR);
	  String Sread=BR.readLine();
	  System.out.println(Sread);
	  
	  FileWriter FW=new FileWriter(Rpath);
	  BufferedWriter BW=new BufferedWriter(FW);
	  BW.write(Sread);
	  BW.newLine();
	  
	  while ((SD=BR.readLine())!=null) 
	  {
		String AR[]=SD.split("%%%");
		String Enm=AR[0];
		String Lp=AR[1];
		String Ro=AR[2];
		String Br=AR[3];
		String Res=LB.Employcre(Enm,Lp,Ro,Br);
		System.out.println(Res);
		BW.write(SD+"@@@"+Res);
		BW.newLine();
	}
      BR.close();
      BW.close();
	}

}
