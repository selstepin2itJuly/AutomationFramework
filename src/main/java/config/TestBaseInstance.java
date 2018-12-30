package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseInstance {
	
	public WebDriver driver; //
	
	public TestBaseInstance(String browser) {
		String key;
		String value;
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) {
			key="webdriver.chrome.driver";
			value="./drivers/chromedriver.exe";
			System.setProperty(key, value);
			 driver = new ChromeDriver(); //chrome browser
		}else if(browser.equalsIgnoreCase("firefox")) {
			 key="webdriver.gecko.driver";
			 value="./drivers/geckodriver.exe";
			 System.setProperty(key, value);
			 driver = new FirefoxDriver(); //firefox browser
		}else {
			System.out.println("Driver not initialized to any browser");
		}
		this.driver=driver;
	}
	public WebDriver getInstance(String browser) 
	{
		//String browser="chrome";
		String key;
		String value;
		
		if(browser.equalsIgnoreCase("chrome")) {
			key="webdriver.chrome.driver";
			value="./drivers/chromedriver.exe";
			System.setProperty(key, value);
			 driver = new ChromeDriver(); //chrome browser
		}else if(browser.equalsIgnoreCase("firefox")) {
			 key="webdriver.gecko.driver";
			 value="./drivers/geckodriver.exe";
			 System.setProperty(key, value);
			 driver = new FirefoxDriver(); //firefox browser
		}else {
			System.out.println("Driver not initialized to any browser");
		}
		return driver;
	}
	

}
