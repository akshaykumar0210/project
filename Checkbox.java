package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//if index should be avoided another method to write xpath using parent-child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		
		driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	       /*int i = 1;
	    //while(i<5)
	    {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    	i++;
	    }*/
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i = 1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();	
	}
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	    WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
}
	
	}

