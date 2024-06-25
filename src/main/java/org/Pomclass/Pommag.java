package org.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pommag {
	
public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	private WebElement login;
	
	@FindBy(xpath="//span[text()='Women'][1]")
	private WebElement women;
	
	@FindBy(xpath="//a[contains(text(),'Jackets')]")
	private WebElement jackets;
	
	@FindBy(xpath="//a[@class='product-item-link'][normalize-space()='Juno Jacket']")
	private WebElement junojack;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-168']")
	private WebElement size;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-57']")
	private WebElement color;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	private WebElement addtocart;
	
		
	@FindBy(xpath="//a[@title='Go to Home Page']")
	private WebElement homepage;
	
	@FindBy(xpath="//a[@id='ui-id-5']//span[contains(text(),'Men')]")
	private WebElement men;
	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement scrollup;
	
	@FindBy(xpath="//a[contains(text(),'Shorts')]")
	private WebElement shorts;
	
	@FindBy(xpath="//a[normalize-space()='Pierce Gym Short']")
	private WebElement pierceshorts ;
	
	@FindBy(xpath="//div[@id='option-label-size-143-item-177']")
	private WebElement size1 ;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-58']")
	private WebElement color1 ;
	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	private WebElement addtocart1 ;
	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement clickcart ;
	
	@FindBy(xpath="//a[@class='action delete']")
	private WebElement removeshorts; 
	
	public WebElement getShorts() {
		return shorts;
	}

	public WebElement getClickcart() {
		return clickcart;
	}

	public WebElement getRemoveshorts() {
		return removeshorts;
	}

	public WebElement getPierceshorts() {
		return pierceshorts;
	}

	public WebElement getSize1() {
		return size1;
	}

	public WebElement getColor1() {
		return color1;
	}

	public WebElement getAddtocart1() {
		return addtocart1;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getHomepage() {
		return homepage;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getWomen() {
		return women;
	}

	public WebElement getJackets() {
		return jackets;
	}

	public WebElement getJunojack() {
		return junojack;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	public WebElement getScrollup() {
		return scrollup;
		
	}

	public Pommag(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
