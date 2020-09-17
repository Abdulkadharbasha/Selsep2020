package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepdBranch
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Library LB=new Library();
		LB.openApp("http://183.82.100.55/ranford2/");
		LB.AdminLogin("Admin","M1ndq");
		String Fpath="E:\\project automation\\Ebanking\\src\\com\\ebanking\\testdata\\Branch121.txt";
		
		String Rpath="E:\\project automation\\Ebanking\\src\\com\\ebanking\\results\\Res_Branch121.txt";
		String SD;
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();
		
		while((SD=BR.readLine())!=null) 
		{
			//System.out.println(SD);
			String SR[]=SD.split("@@@");
			 String BNam=SR[0];
			 String Ad1=SR[1];
			 String Ad2=SR[2];
			 String Ad3=SR[3];
			 String Are=SR[4];
			 String Zco=SR[5];
			 String Con=SR[6];
			 String Sta=SR[7];
			 String Cit=SR[8];
			String RES=LB.Branchcre(BNam, Ad1, Ad2, Ad3, Are, Zco, Con, Sta, Cit);
			 
			 //String res=LB.Branchcre(BNam,Ad1,Ad2,Ad3,Are,Zco,Con,Sta,Cit);
			 System.out.println(RES);
			 BW.write(SD+"$$$"+RES);
			 BW.newLine();
			 }
		BW.close();
		BR.close();
		
		
	}
}



		 