package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		Thread.sleep(2000);
		String txt=driver.switchTo().alert().getText();
		
		String et="This is an Alert box.";
		if(txt.contentEquals(et))
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
		
		Alert simple=driver.switchTo().alert();
		String at=simple.getText();
		simple.accept();
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		Alert prom=driver.switchTo().alert();
		Thread.sleep(2000);
		prom.sendKeys("hello");
		prom.accept();

	}

}
