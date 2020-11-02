package newtours;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Aziz Tokhirov
 *New Tours Automation Demo
 */
public class NewTours {
	

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first name");
		String name = sc.next();
		System.out.println("Please enter last name");
		String lName = sc.next();
		System.out.println("Please enter phone number");
		String phoneN = sc.next();
		String email = generateEmail(name, lName);
		System.out.println("Please enter address");
		String address = sc.next();
		System.out.println("Please enter city");
		String city = sc.next();
		System.out.println("Please enter province");
		String province = sc.next();
		System.out.println("Please enter postal code");
		String postalCode = sc.next();
		String country = "Germany";
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Tokhirov\\webDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys(name);
		driver.findElement(By.name("lastName")).sendKeys(lName);
		driver.findElement(By.name("phone")).sendKeys(phoneN);
		driver.findElement(By.id("userName")).sendKeys(email);
		driver.findElement(By.name("address1")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(province);
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		
		WebElement element = driver.findElement(By.name("country"));
		
		Select s = new Select(element);
		s.selectByValue(country.toUpperCase());
		
		driver.findElement(By.id("email")).sendKeys(generateUsername(name, lName));
		driver.findElement(By.name("password")).sendKeys(generatePassword(name, lName));
		driver.findElement(By.name("confirmPassword")).sendKeys(generatePassword(name, lName));
		
		String actualText = driver.findElement(By.xpath("(//b)[10]")).getText();
		String expectedText = "City:";
		System.out.println(actualText);
		
		if(actualText.equals(expectedText)) {// equals ---> comparing content/value of two objects of String
			System.out.println("Go right");
		} else {
			System.out.println("Go wrong");
		}
		
//		driver.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.name("password")).sendKeys("password");
//		Thread.sleep(1000);
//		driver.findElement(By.name("submit")).click();
		
		
		
		Thread.sleep(5000);
		
//		driver.quit();
		sc.close();

	}
	
	private static String generateEmail(String name, String lName) {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(".").append(lName).append("@gmail.com");
		return sb.toString().toLowerCase();
	}
	
	private static String generateUsername(String name, String lName) {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(".").append(lName);
		return sb.toString().toLowerCase();
	}
	
	private static String generatePassword(String name, String lName) {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(".").append(lName).append("wwss");
		return sb.toString();
	}

}
