package testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.Driver;
import driver.Sleep;

public class Button {
	public static void main(String[] args) {
		WebDriver driver = Driver.getDriver("chrome");
		driver.get("http://testleaf.herokuapp.com/home.html");
		Sleep.sleep(1);
		driver.findElement(By.linkText("Button")).click();
		String aHeader = driver.findElement(By.xpath("//h1")).getText();
		String eHeader = "Bond with Buttons";
		if(aHeader.equals(eHeader)) {
			System.out.println("Header validation: Pass");
		}else {
			System.out.println("Error");
		}
		System.out.println(aHeader);
		Sleep.sleep(1);
		driver.findElement(By.id("home")).click();
		Sleep.sleep(1);
		driver.navigate().back();
		
		Sleep.sleep(1);
		int x = driver.findElement(By.id("position")).getLocation().getX();
		int y = driver.findElement(By.id("position")).getLocation().getY();
		
		System.out.println("X=" + x + ", Y=" + y);	
		Sleep.sleep(1);
		String color = driver.findElement(By.id("color")).getAttribute("style");
		String color2 = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);
		System.out.println(color2);
		int height = driver.findElement(By.id("size")).getSize().getHeight();
		int width = driver.findElement(By.id("size")).getSize().getWidth();
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		Sleep.sleep(3);
		driver.close();
	}
	
	
	

}
