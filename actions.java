package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4aixbc67ji_b&adgrpid=57687748743&hvpone=&hvptwo=&hvadid=617721285511&hvpos=&hvnetw=g&hvrand=9970915347949709503&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007769&hvtargid=kwd-297849179688&hydadcr=5844_2362049");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();

	}

}
