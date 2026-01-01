package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement f1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame("f1");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(drag, drop).build().perform();

		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Resizable")).click();
		driver.switchTo().frame(f1);
		WebElement widget=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		a.clickAndHold(widget).moveByOffset(180, 100).release().build().perform();
		
	}

}
