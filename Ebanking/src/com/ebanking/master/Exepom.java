package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom 
{
@Test	
public void Admin() throws InterruptedException 
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.100.55/ranford2/");
	
	//Passing the driver from one class to another class
	//Admin Login
	Ranfordhp RHP=PageFactory.initElements(driver, Ranfordhp.class);
	RHP.Login();
	
	PomAdminhp AHP=PageFactory.initElements(driver, PomAdminhp.class);
	AHP.Bbtn();
	//Branch Creation
	PomAdminBrancre BCRE=PageFactory.initElements(driver, PomAdminBrancre.class);
	BCRE.Bcre();
	
	PomnewBrEntry BETD=PageFactory.initElements(driver, PomnewBrEntry.class);
	BETD.BranEnt();
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	
	PomAdminBrancre Hom=PageFactory.initElements(driver, PomAdminBrancre.class);
	Hom.Hbtn();
	//Role Creation
	PomAdminhp Rol=PageFactory.initElements(driver, PomAdminhp.class);
	Rol.Rbtn();
	
	PomAdminhp  NewR=PageFactory.initElements(driver, PomAdminhp .class);
	NewR.NewRol();
	
	PomnewRolinser Rinser=PageFactory.initElements(driver, PomnewRolinser.class);
	Rinser.Rinsertion();
	driver.switchTo().alert().accept();
	PomAdminBrancre Hom1=PageFactory.initElements(driver, PomAdminBrancre.class);
	Hom1.Hbtn();
	Thread.sleep(5000);
	//Emp Button click
	PomAdminhp EmpBtn=PageFactory.initElements(driver,PomAdminhp.class);
	EmpBtn.Ebtn();
	PomAdminhp NewEmp=PageFactory.initElements(driver,PomAdminhp.class);
	NewEmp.NewEmp1();
	
	//Emp Creation
	PomEmpCreat  EName=PageFactory.initElements(driver,PomEmpCreat .class);
	EName.Empcre1();
	driver.switchTo().alert().accept();
	
	PomAdminBrancre Hom2=PageFactory.initElements(driver, PomAdminBrancre.class);
	Hom2.Hbtn();
	
	PomAdminhp Lout2=PageFactory.initElements(driver, PomAdminhp.class);
	Lout2.Lout();
}
}
