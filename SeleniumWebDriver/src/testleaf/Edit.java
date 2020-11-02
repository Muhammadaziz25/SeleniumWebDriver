package testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.Sleep;

import static driver.Driver.*;

public class Edit {
	public static void main(String[] args) {
		WebDriver driver = getDriver("chrome");
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.findElement(By.linkText("Edit")).click();
		
		String actualHeader = driver.findElement(By.xpath("//h1")).getText();
		String expectedHeader = "Work with Edit Fields";
		if(actualHeader.equals(expectedHeader)) {
			System.out.println("Edit page: Pass");
		}else {
			System.out.println("Edit page: Fail");
		}
		Sleep.sleep(2);
		
		driver.findElement(By.id("email")).sendKeys("asdf@gmail.com");
		Sleep.sleep(2);
		driver.findElement(By.cssSelector("[value='Append ']")).sendKeys("Append text");
		Sleep.sleep(2);
		String getValue = driver.findElement(By.cssSelector("[name='username']")).getAttribute("value");
		System.out.println(getValue);
		Sleep.sleep(2);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		// (//input[@name='username'])[2] relative xpath
		Sleep.sleep(2);
		boolean isDisabled = !driver.findElement(By.cssSelector("[disabled='true']")).isEnabled();
		System.out.println(isDisabled);
	
		Sleep.sleep(3);
		driver.close();
		
	}

}
