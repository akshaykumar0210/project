package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpageobject {
	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement user;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement pswd;
	
	@FindBy(how=How.NAME,using="submit")
	public static WebElement submit;
	
	
	
	
	/*
	public static WebElement user(WebDriver driver){
		return driver.findElement(By.name("userName"));
		
	}
	public static WebElement pswd(WebDriver driver){
		return driver.findElement(By.name("userName"));
		
	}
	public static WebElement submit(WebDriver driver){
		return driver.findElement(By.name("userName"));
		*/
	}


