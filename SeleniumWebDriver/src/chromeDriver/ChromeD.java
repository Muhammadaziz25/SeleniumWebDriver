package chromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeD {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Tokhirov\\drivers\\chromedriver.exe");
		ChromeDriver ch = new ChromeDriver();
		ch.get("https://www.google.com/");
		ch.findElement(By.name("q")).sendKeys("dell computer");
		ch.findElement(By.linkText("Google Search")).click();
		
		
		
//		ch.get();
	}
	
	
	
	

}
