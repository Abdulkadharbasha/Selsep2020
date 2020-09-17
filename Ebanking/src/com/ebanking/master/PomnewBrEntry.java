package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PomnewBrEntry 
{
   //Element creation New Branch Entry
	@FindBy(xpath="//input[contains(@id,'txtbName')]")
	WebElement Bname;
	@FindBy(xpath="//input[contains(@id,'txtAdd1')]")
	WebElement Ad1;
	@FindBy(xpath="//input[contains(@id,'Txtadd2')]")
	WebElement Ad2;
	@FindBy(xpath="//input[contains(@id,'txtadd3')]")
	WebElement Ad3;
	@FindBy(xpath="//input[contains(@id,'txtArea')]")
	WebElement Area;
	@FindBy(xpath="//input[contains(@id,'txtZip')]")
	WebElement Zip;
	@FindBy(xpath="//select[contains(@id,'lst_counrtyU')]")
	WebElement Count;
	@FindBy(xpath="//select[contains(@id,'lst_stateI')]")
	WebElement State;
	@FindBy(xpath="//select[contains(@id,'lst_cityI')]")
	WebElement City;
	@FindBy(xpath="//input[contains(@id,'btn_insert')]")
	WebElement Sbtn;
	
	
	//Element method
	public void BranEnt()
	{
		Bname.sendKeys("Peddapuram");
		Ad1.sendKeys("HB COLONY");
		Ad2.sendKeys("DURGANAGAR");
		Ad3.sendKeys("NEAR ELEC");
		Area.sendKeys("SIMHADRIPURAM");
		Zip.sendKeys("53002");
		Select s=new Select(Count);
		s.selectByVisibleText("INDIA");
		Select s1=new Select(State);
		s1.selectByVisibleText("Andhra Pradesh");
		Select s2=new Select(City);
		s2.selectByVisibleText("Nellore");
		Sbtn.click();
		
		}
	}
