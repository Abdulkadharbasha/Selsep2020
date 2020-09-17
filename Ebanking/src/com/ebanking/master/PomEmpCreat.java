package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PomEmpCreat 
{
  @FindBy(xpath="//input[contains(@id,'txtUname')]")
   WebElement Ename;
  @FindBy(xpath="//input[contains(@id,'txtLpwd')]")
   WebElement Logpas;
  @FindBy(xpath="//select[contains(@id,'lst_Roles')]")
   WebElement role;
  @FindBy(xpath="//select[contains(@id,'lst_Branch')]")
   WebElement Bra;
  @FindBy(xpath="//input[contains(@id,'BtnSubmit')]")
  WebElement Sbtn;
  
  
  public void Empcre1()
  {
	  Ename.sendKeys("Reshma");
	  Logpas.sendKeys("Renaaz");
	  Select s=new Select(role);
	  s.selectByVisibleText("Manager");
	  Select s1=new Select(Bra);
	  s1.selectByVisibleText("MMTCBRANCH");
	  Sbtn.click();
	  
  }
  
}