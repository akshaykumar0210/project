package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement (By.id("inputUsername")).sendKeys("rahul");  //id
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//name
		driver.findElement(By.className("submit")).click();//class
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//css selector
		driver.findElement(By.linkText("Forgot your password?")).click();//link text
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon");//xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jhon@gmail.com");//css selector by index value
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("987654321");//xpath parent tag to child tag
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");//partial text css selector using* in locator
		driver.findElement(By.id("chkboxOne")).click();
		driver .findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	}
	

}
