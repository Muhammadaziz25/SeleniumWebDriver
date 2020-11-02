package newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static driver.Driver.*;

//import driver.Driver;

public class WarmUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = getDriver("chrome");
		driver.get("http://demo.guru99.com/test/newtours/");
		sleep(1);

		driver.findElement(By.xpath("(//a)[42]")).click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Welcome: Mercury Tours";
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/index.php";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title check: Pass");
		}else {
			System.out.println("Title check: Fail");
		}
		System.out.println(actualTitle);
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Check URL: Pass");
		}else {
			System.out.println("Check URL: Fail");
		}
		System.out.println(actualUrl);

		sleep(3);
		driver.close();
	}

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
