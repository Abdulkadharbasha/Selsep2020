package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PomnewRolinser 
{
  //Element properties
	@FindBy(xpath="//input[contains(@id,'txtRname')]")
	WebElement Rname;
	@FindBy(xpath="//input[contains(@id,'txtRDesc')]")
	WebElement Rdes;
	@FindBy(xpath="//select[contains(@id,'lstRtypeN')]")
	WebElement Rtype;
	@FindBy(xpath="//input[contains(@id,'btninsert')]")
	WebElement Sbtn;
	
	//Element method
	public void Rinsertion()
	{
		Rname.sendKeys("ManagerMM");
		Rdes.sendKeys("casa123");
		Select s=new Select(Rtype);
		s.selectByVisibleText("E");
		Sbtn.click();
		
	}
	
	
}
