package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[12]/td/select"));
		Dimension s=country.getSize();
		System.out.println("country:"+ s);
		for(int i=0;i<s;i++) {
		
		System.out.println(country.get(i).getText());


	}

}
}