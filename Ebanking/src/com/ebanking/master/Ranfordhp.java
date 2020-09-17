package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ranfordhp 
{
	 //Element properties for Admin Login
		@FindBy(id="txtuId")
		WebElement Uname;
		
		@FindBy(id="txtPword")
		WebElement Pwd;
		
		@FindBy(id="login")
		WebElement Log;
		
		//Element Method for Admin Login
		public void Login()
		{
		Uname.sendKeys("Admin");
		Pwd.sendKeys("M1ndq");
		Log.click();
		}	
}
