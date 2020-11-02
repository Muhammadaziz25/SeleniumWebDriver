package testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.Driver;
import driver.Sleep;

public class HyperLink {
	public static void main(String[] args) {
		WebDriver driver = Driver.getDriver("chrome");
		//(//a[text()='Go to Home Page'])[2]
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		Sleep.sleep(1);
		driver.navigate().back();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String actualText = driver.findElement(By.xpath("//h1")).getText();
		String expectedText = "Not Found";
		if(actualText.equals(expectedText)) {
			System.out.println("Text validation: Pass");
		}else {
			System.out.println("Error");
		}
		Sleep.sleep(1);
		driver.navigate().back();
		Sleep.sleep(1);
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		Sleep.sleep(1);
		driver.navigate().back();
		
		Sleep.sleep(2);
		driver.quit();
		
		
	}

}
