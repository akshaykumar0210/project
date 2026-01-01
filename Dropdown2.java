package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[12]/td/select"));
		Select country1=new Select(country);
		List<WebElement>options=country1.getOptions();
		System.out.println("number of dropdowns:"+options.size());
		
		for(int i=0;i<options.size();i++)

		{
			System.out.println(options.get(i).getText());
		}
	}

}
