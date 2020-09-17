package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library
{
	WebDriver driver;
	String Expval,Actval;
public void openApp(String Url)
{
	Expval="Ranford Bank";
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(Url);
	 String Actval=driver.findElement(By.xpath("//*[@id=\"Form1\"]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	   if(Expval.equalsIgnoreCase(Actval))
	   {
		   System.out.println("Welcome to Ranford Bank");
	   }
	   else
	   {
		   System.out.println("Ranford Bank page not opened");
}
}
public void AdminLogin(String Uid,String Pwd) throws InterruptedException
{
	Expval="Welcome to Admin";
	   driver.findElement(By.id("txtuId")).sendKeys(Uid);
	   driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	   driver.findElement(By.id("login")).click();
	   Thread.sleep(5000);
	   Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	   if(Expval.equalsIgnoreCase(Actval))
	   {
		   System.out.println("Welcome to Admin Page");
	   }
	   else
	   {
		   System.out.println("Admin Page not opened");
	   }
	   }
         
public String Branchcre(String Bname,String Adl1,String Adl2,String Adl3,String Area,String Zpc,String country,String state,String city) throws InterruptedException
{
	 Expval="Sucessfully";
	   driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
	   driver.findElement(By.xpath("//input[contains(@id,'BtnNewBR')]")).click();
	   
	   driver.findElement(By.xpath("//input[contains(@id,'txtbName')]")).sendKeys(Bname);
	   driver.findElement(By.xpath("//input[contains(@id,'txtAdd1')]")).sendKeys(Adl1);
	   driver.findElement(By.xpath("//input[contains(@id,'Txtadd2')]")).sendKeys(Adl2);
	   driver.findElement(By.xpath("//input[contains(@id,'txtadd3')]")).sendKeys(Adl3);
	   driver.findElement(By.xpath("//input[contains(@id,'txtArea')]")).sendKeys(Area);
	   driver.findElement(By.xpath("//input[contains(@id,'txtZip')]")).sendKeys(Zpc);
	   
	   WebElement drop1=driver.findElement(By.id("lst_counrtyU"));
	   Select s=new Select(drop1);
	   s.selectByVisibleText(country);
	   
	   WebElement drop2=driver.findElement(By.id("lst_stateI"));
	   Select s1=new Select(drop2);
	   s1.selectByVisibleText(state);
	   
	   WebElement drop3=driver.findElement(By.xpath("//select[contains(@id,'lst_cityI')]"));
	   Select s3=new Select(drop3);
	   s3.selectByVisibleText(city);
	   
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
	   return Actval;
}
public String Rolecre(String Rolnam,String Roldes,String Rtype)
{
	Expval="Sucessfully";
	   driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
	   
	   driver.findElement(By.xpath("//input[contains(@id,'btnRoles')]")).click();
	   
	   driver.findElement(By.xpath("//input[contains(@id,'txtRname')]")).sendKeys(Rolnam);
	   driver.findElement(By.xpath("//input[contains(@id,'txtRDesc')]")).sendKeys(Roldes);
	   
	   WebElement drop4=driver.findElement(By.xpath("//select[contains(@id,'lstRtypeN')]")); 
	   Select s4=new Select(drop4);
	   s4.selectByVisibleText(Rtype);
	   
	   
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
	return Actval;
}
public String Employcre(String Empnam,String Logpass,String Rol,String Bran) throws InterruptedException
{
	 Expval="Sucessfully";
	   driver.findElement(By.xpath("//img[@src='images/emp_btn.jpg']")).click();
	   driver.findElement(By.xpath("//input[contains(@id,'BtnNew')]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[contains(@id,'txtUname')]")).sendKeys(Empnam);
	   driver.findElement(By.xpath("//input[contains(@id,'txtLpwd')]")).sendKeys(Logpass);
	   WebElement drop5=driver.findElement(By.xpath("//select[contains(@id,'lst_Roles')]"));
	   Select s5=new Select(drop5);
	   s5.selectByVisibleText(Rol);
	   WebElement drop6=driver.findElement(By.xpath("//select[contains(@id,'lst_Branch')]"));
	   Select s6=new Select(drop6);
	   s6.selectByVisibleText(Bran);
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
	  // driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	return Actval;
	   }
public void close()
{
	driver.close();
}
}
