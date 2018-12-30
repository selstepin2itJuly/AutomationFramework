package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	WebDriver driver;
	
	public WelcomePage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Welcome']")
	WebElement welcome;
	
	@FindBy(xpath="//*[text()='Herbal Tea']")
	WebElement herbaltea;
	
	@FindBy(xpath="//*[text()='Loose Tea']")
	WebElement loosetea;
	
	@FindBy(xpath="//*[text()='Flavored Tea']")
	WebElement flavortea;
	
	public String getTextWelcome() {
		return welcome.getText();
	}
	
	public String getTextHerbalTea() {
		return herbaltea.getText();
	}
	public String getTextLooseTea() {
		return loosetea.getText();
	}
	public String getTextFlavoredTea() {
		return flavortea.getText();
	}

	public void clickonWelcome() {
		welcome.click();
	}
}
