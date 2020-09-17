package com.ebanking.master;

public class ExeLib {

	public static void main(String[] args) throws InterruptedException 
	{
	  Library LB=new Library();
	  LB.openApp("http://183.82.100.55/ranford2/");
	  LB.AdminLogin("Admin" ,"M1ndq");
	  LB.Branchcre("AABRANCH","14-23","DURGANAGAR","NEAReLEC","HB COLONY","55001","INDIA","DELHI","DELHI");
	  LB.Rolecre("Cluster","Managerm2","E");
	  LB.Employcre("Kadhar","Resh","Manager","MMTCBRANCH");
	  LB.close();
	  

	}

}
