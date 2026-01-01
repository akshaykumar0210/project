package projecttestcase;

import org.testng.annotations.Test;

import project.Testcase1;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Testcase3 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
driver = new ChromeDriver();
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  PageFactory.initElements(driver, Testcase1.class);
	  Testcase1.user.sendKeys("");
	  Testcase1.pswd.sendKeys("");
	  Testcase1.login.click();
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret" },
      new Object[] { "locked_out_user", "sauce" },
      new Object[] { "locked", "secret_sauce" },
      new Object[] { "out_user", "sauce" },
    };
  }
}
