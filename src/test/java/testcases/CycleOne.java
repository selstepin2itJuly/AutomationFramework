package testcases;

import org.testng.annotations.Test;

import config.TestBaseStatic;
import constants.PropertyConstants;
import pages.MenuPage;
import pages.WelcomePage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class CycleOne extends TestBaseStatic{
	//WebDriver driver;
	MenuPage menu;
	WelcomePage wel;
	
  @Test(priority=1)
  public void VerifyTypesofTeaOnWecomPage() {
	  wel.clickonWelcome();
	  String ftea=wel.getTextFlavoredTea();
	  assertEquals("Flavored Tea", ftea);
	  String htea=wel.getTextHerbalTea();
	  assertEquals("Hearbal Tea", htea);
	  String ltea=wel.getTextLooseTea();
	  assertEquals("Loose Tea", ltea);
	 // driver.findElement(By.xpath("//a[text()='Menu']")).click();
	  
  }
  @Test(priority=2)
  public void VerifyWelcomPage() {
	  String str=wel.getTextWelcome();
	  assertEquals("Welcome", str);
  }
  @Test(priority=3)
  public void VerfyCheckoutButton() {
       menu.clickOnMenu();
       boolean b = menu.checkoutButton();
       assertTrue(b);
  }
  
  @Test(priority=4)
  public void VerifyCheckoutButtonCount() {
	  menu.clickOnMenu();
	  int i = menu.getCheckOutButtonCount();
	  assertEquals(4,i);
  }
  @Test(priority=5)
  public void verifyTypesOfTeaOnMenuPage() {
	  menu.clickOnMenu();
	  String str=menu.getTextGreenTea();
	  assertEquals("Green Tea", str);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  TestBaseStatic.getInstance();
	  driver.get("http://www.practiceselenium.com");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  menu = new MenuPage(driver);
	  wel = new WelcomePage(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
