package config;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import constants.PropertyConstants;

public class TestBaseStatic {

	public static WebDriver driver; //
	
	public static WebDriver getInstance() 
	{
		//String browser="chrome";
		String key;
		String value;
		
		if(PropertyConstants.browser.equalsIgnoreCase("chrome")) {
			key="webdriver.chrome.driver";
			value="./drivers/chromedriver.exe";
			System.setProperty(key, value);
			//DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setCapability(" --disable-infobars", true);
			//ChromeOptions option = new ChromeOptions();
			//option.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			//System.out.println(option.getBrowserName());
			//option.merge(cap);
			 driver = new ChromeDriver(); //chrome browser
		}else if(PropertyConstants.browser.equalsIgnoreCase("firefox")) {
			 key="webdriver.gecko.driver";
			 value="./drivers/geckodriver.exe";
			 System.setProperty(key, value);
			 FirefoxOptions opt= new FirefoxOptions();
			 driver = new FirefoxDriver(); //firefox browser
		}else {
			System.out.println("Driver not initialized to any browser");
		}
		return driver;
	}
	
}
