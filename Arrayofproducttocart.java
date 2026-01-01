package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayofproducttocart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		List<WebElement> products = (List<WebElement>) driver.findElement(By.cssSelector("h4.product-name"));
		
	for(int i=0;i<products.size();i++) {
		String name = products.get(i).getText();
		
		if(name.contains("Cucumber")) {
			driver.findElements(By.xpath("//button[test()='ADD TO CART']")).get(i).click();
			break;
		}
	}

	}

}
