package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject.Loginpageobject;

public class test {
	WebDriver driver;
  @Test
  public void f() {
      driver = new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
	  
	  PageFactory.initElements(driver, Loginpageobject.class);
	  Loginpageobject.user.sendKeys("demouser");
	  Loginpageobject.pswd.sendKeys("pass123");
	  Loginpageobject.submit.sendKeys("submit");
	  
	  /*
	  Loginpageobject.user(driver).sendKeys("demo");
	  Loginpageobject.pswd(driver).sendKeys("pass123");
	  Loginpageobject.submit(driver).click();
	  */
	  /*
	  driver.findElement(By.name("userNwme")).sendKeys("");
	  driver.findElement(By.name("password")).sendKeys("");
	  driver.findElement(By.name("submit")).click();
	  */
  }
}
