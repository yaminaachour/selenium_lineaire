package testCases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(new File("src\\test\\extensions\\EPCNNFBJFCGPHGDMGGKAMKMGOJDAGDNN_25_1_0_0.crx"));
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		
		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		
		btnClickMe.click();
		
		// Accept Alert
		driver.switchTo().alert().accept();
		
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		//driver.quit();
	}

}
