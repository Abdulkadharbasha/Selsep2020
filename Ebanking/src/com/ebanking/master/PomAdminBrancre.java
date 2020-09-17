package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomAdminBrancre 
{
	// Element properties for AdminBranch creation
    @FindBy(xpath="//input[contains(@id,'BtnNewBR')]")
    WebElement Bcre;
    
    //For Home Button
    @FindBy(xpath="//img[@src='images/admin_but_01.jpg']")
    WebElement Hbtn;
    
    //Element method
    public void Bcre()
    {
    	Bcre.click();
    }
    public void Hbtn() 
    {
        Hbtn.click();	
    }

}
