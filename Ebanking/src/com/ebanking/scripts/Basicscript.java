package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException 
	{
	   //Opening Browser
		String Expval="Ranford Bank";
		WebDriver driver=new FirefoxDriver();
	   //Maximise Browser
	   driver.manage().window().maximize();
	   //Opening Path
	   
	   driver.get("http://183.82.100.55/ranford2/");
	   String Actval=driver.findElement(By.xpath("//*[@id=\"Form1\"]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	   if(Expval.equalsIgnoreCase(Actval))
	   {
		   System.out.println("Welcome to Ranford Bank");
	   }
	   else
	   {
		   System.out.println("Ranford Bank page not opened");
	   }
	   
	   
	   //Admin Login
	   Expval="Welcome to Admin";
	   driver.findElement(By.id("txtuId")).sendKeys("Admin");
	   driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
	   driver.findElement(By.id("login")).click();
	   Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	   if(Expval.equalsIgnoreCase(Actval))
	   {
		   System.out.println("Welcome to Admin Page");
	   }
	   else
	   {
		   System.out.println("Admin Page not opened");
	   }
	   
	   //Click Branch and New Branch Button along Branch Creation
	   Expval="Sucessfully";
	   driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
	   driver.findElement(By.xpath("//input[contains(@id,'BtnNewBR')]")).click();
	   
	   driver.findElement(By.xpath("//input[contains(@id,'txtbName')]")).sendKeys("HBCBRANCH");
	   driver.findElement(By.xpath("//input[contains(@id,'txtAdd1')]")).sendKeys("DNO1111");
	   driver.findElement(By.xpath("//input[contains(@id,'Txtadd2')]")).sendKeys("MMTC BUSSTOP");
	   driver.findElement(By.xpath("//input[contains(@id,'txtadd3')]")).sendKeys("OPP LIC APARTMENTS");
	   driver.findElement(By.xpath("//input[contains(@id,'txtArea')]")).sendKeys("NEAR DRIDGING CORP BUILDING");
	   driver.findElement(By.xpath("//input[contains(@id,'txtZip')]")).sendKeys("53008");
	   
	   WebElement drop1=driver.findElement(By.id("lst_counrtyU"));
	   Select s=new Select(drop1);
	   s.selectByVisibleText("INDIA");
	   
	   WebElement drop2=driver.findElement(By.id("lst_stateI"));
	   Select s1=new Select(drop2);
	   s1.selectByVisibleText("Delhi");
	   
	   WebElement drop3=driver.findElement(By.xpath("//select[contains(@id,'lst_cityI')]"));
	   Select s3=new Select(drop3);
	   s3.selectByVisibleText("Delhi");
	   
	   driver.findElement(By.name("btn_insert")).click();
	   Actval=driver.switchTo().alert().getText();
	   if(Actval.contains(Expval))
	   {
		   System.out.println("Branch created Sucessfully");
	   }
	   else
	   {
		   System.out.println("Branch already Exists");
	   }
	   Thread.sleep(5000);
	   
	   driver.switchTo().alert().accept();
	   
	   driver.findElement(By.xpath("//img[@src='images/admin_but_01.jpg']")).click();
	   //Role creation
	   Expval="Sucessfully";
	   driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
	   
	   driver.findElement(By.xpath("//input[contains(@id,'btnRoles')]")).click();
	   
	   driver.findElement(By.xpath("//input[contains(@id,'txtRname')]")).sendKeys("MANAGER");
	   driver.findElement(By.xpath("//input[contains(@id,'txtRDesc')]")).sendKeys("CASA");
	   
	   WebElement drop4=driver.findElement(By.xpath("//select[contains(@id,'lstRtypeN')]")); 
	   Select s4=new Select(drop4);
	   s4.selectByVisibleText("C");
	   
	   
	   driver.findElement(By.xpath("//input[contains(@id,'btninsert')]")).click();
	   Actval=driver.switchTo().alert().getText();
	   if(Actval.contains(Expval))
	   {
		   System.out.println("Role created Sucessfully ");
	   }
	   else
	   {
		   System.out.println("Already Role Exists");
	   }
	   driver.switchTo().alert().accept();
	   
	   
	   driver.findElement(By.xpath("//img[@src='images/admin_but_01.jpg']")).click();
	   //Emp Creation
	   Expval="Sucessfully";
	   driver.findElement(By.xpath("//img[@src='images/emp_btn.jpg']")).click();
	   driver.findElement(By.xpath("//input[contains(@id,'BtnNew')]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[contains(@id,'txtUname')]")).sendKeys("ABDUL");
	   driver.findElement(By.xpath("//input[contains(@id,'txtLpwd')]")).sendKeys("Basha");
	   WebElement drop5=driver.findElement(By.xpath("//select[contains(@id,'lst_Roles')]"));
	   Select s5=new Select(drop5);
	   s5.selectByVisibleText("Manager");
	   WebElement drop6=driver.findElement(By.xpath("//select[contains(@id,'lst_Branch')]"));
	   Select s6=new Select(drop6);
	   s6.selectByVisibleText("MMTCBRANCH");
	   driver.findElement(By.xpath("//input[contains(@id,'BtnSubmit')]")).click();
	   Thread.sleep(5000);
	   Actval=driver.switchTo().alert().getText();
	   if(Actval.contains(Expval))
	   {
		   System.out.println("Employer created Sucessfully");
	   }
	   else
	   {
		   System.out.println("Already employer data exists");
	   }
	   driver.switchTo().alert().accept();
	   driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	   //driver.findElement(By.xpath("//img[@src='images/mainlinks_02.jpg']")).click();
	   //close
	   driver.close();
	  
	   
	   
	   
	   
	  
	}

}
