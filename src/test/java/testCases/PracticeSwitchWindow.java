package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		// Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println("The first window name is : " + handle);
		
		WebElement btnNewWindowMessage = driver.findElement(By.id("messageWindowButton"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", btnNewWindowMessage); 
		
		btnNewWindowMessage.click();
		
		// Store and print the names of the windows

		Set<String> handles = driver.getWindowHandles();
		System.out.println("The windows names are : " + handles);
		
		// Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}
		
		driver.close();
		
	}

}
