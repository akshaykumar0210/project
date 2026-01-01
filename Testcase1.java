package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Testcase1 {
	@FindBy(how=How.NAME,using="user-name")
	public static WebElement user;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement pswd;
	
	@FindBy(how=How.NAME,using="login-button")
	public static WebElement login;
	@FindBy(how=How.CLASS_NAME,using="product_sort_container")
	public static WebElement dropdown;
	
	@FindBy(how=How.ID,using="add-to-cart-sauce-labs-backpack")
	public static WebElement addtocart;
	
	@FindBy(how=How.CLASS_NAME,using="shopping_cart_link")
	public static WebElement clickoncart;
	
	@FindBy(how=How.CLASS_NAME,using="title")
	public static WebElement product;
	
	@FindBy(how=How.CLASS_NAME,using="cart_list")
	public static WebElement productframe;
	
	@FindBy(how=How.ID,using="react-burger-menu-btn")
	public static WebElement menu;
	
	@FindBy(how=How.ID,using="logout_sidebar_link")
	public static WebElement logout;


}
