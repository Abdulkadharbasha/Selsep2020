package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomAdminhp 
{
  //Element properties for Branch Button	
  @FindBy(xpath="//img[@src='images/Branches_but.jpg']")
  WebElement Button;
  //Roles Button
  @FindBy(xpath="//img[@src='images/Roles_but.jpg']")
  WebElement Role;
  //Emp Button
  @FindBy(xpath="//img[@src='images/emp_btn.jpg']")
  WebElement Employ;
  //Logout
  @FindBy(xpath="//img[@src='images/admin_but_03.jpg']")
  WebElement Logout;
  @FindBy(xpath="//input[contains(@id,'btnRoles')]")
  WebElement NewR;
  @FindBy(xpath="//input[contains(@id,'BtnNew')]")
  WebElement NewEmp;
  public void Bbtn()
  {
	  Button.click();
  }
  public void Rbtn()
  { 
	  Role.click();
  }
  public void Ebtn()
  {
	  Employ.click();
  }
  public void Lout()
  {
	  Logout.click();
  }
  public void NewRol()
  {
	  NewR.click();
  }
  public void NewEmp1()
  {
	  NewEmp.click();
  }
  
}
