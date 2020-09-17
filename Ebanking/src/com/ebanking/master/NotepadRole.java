package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadRole 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Library LB=new Library();
		LB.openApp("http://183.82.100.55/ranford2/");
		LB.AdminLogin("Admin","M1ndq");
		
		String Fpath="E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\Rol.txt";
		
		String Rpath="E:\\project automation\\Ebanking\\src\\com\\ebanking\\results\\ResRole.txt";
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
			System.out.println(SD);
			String SR[]=SD.split("@@@");
			 String RName=SR[0];
			 String RDes=SR[1];
			 String RType=SR[2];
			 String res=LB.Rolecre(RName, RDes, RType);
			 System.out.println(res);
			 BW.write(SD+"$$$$"+res);
			 BW.newLine();
			 }
		BW.close();
		BR.close();
		
		
	}

}
