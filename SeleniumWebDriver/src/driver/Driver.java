package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver {
	
	public static WebDriver getDriver(String browserType) {
		WebDriver driver = null;
		switch (browserType) {
		case "chrome":
			driver = getChromeDriver();
			break;
		case "firefox":
			driver = getFirefoxDriver();
			break;
		default:
			System.out.println("Browser type " + browserType + " is invalid");
		}
		return driver;
	}
	
	public static ChromeDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Tokhirov\\webDrivers\\chromedriver.exe");
		return new ChromeDriver();
	}
	
	public static FirefoxDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aziz Tokhirov\\webDrivers\\chromedriver.exe");
		return new  FirefoxDriver();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static WebDriver getDriver(String browserType) {
//		WebDriver driver = null;
//		switch (browserType) {
//		case "chrome":
//			driver =  getChromeDriver();
//			break;
//		case "firefox":
//			driver = getFirefoxDriver();
//			break;
//		default:
//			System.out.println("Browser type " + browserType + " is invalid");
//			break;
//		}
//		
//		return driver;
//	}
//	
//	private static ChromeDriver getChromeDriver() {
//	
////		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Aziz Tokhirov\\webDrivers\\chromedriver.exe");
//		
//		return new ChromeDriver();
//	}
//	
//	private static FirefoxDriver getFirefoxDriver() {
////		WebDriverManager.firefoxdriver().setup();
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Aziz Tokhirov\\webDrivers\\geckodriver.exe");
//		
//		return new FirefoxDriver();
//	}

}
