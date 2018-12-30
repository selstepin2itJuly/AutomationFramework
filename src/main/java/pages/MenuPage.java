package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

WebDriver driver;
	
	public MenuPage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[text()='Green Tea']")
	WebElement greentea;
	
	@FindBy(xpath="//*[text()='Check Out']")
	List<WebElement> checkout;
	
	@FindBy(xpath="//a[text()='Menu']")
	WebElement menu;
	
	public String getTextGreenTea() {
		return greentea.getText();
	}
	
	public int getCheckOutButtonCount() {
		return checkout.size();
	}
	
	public void clickOnMenu() {
		menu.click();
	}
	
	public boolean checkoutButton() {
		return checkout.get(1).isDisplayed();
	}
}
