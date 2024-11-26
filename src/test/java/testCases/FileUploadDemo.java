package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");

		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));

		uploadFile.sendKeys("C:\\Users\\melme\\Desktop\\Formation Selenium\\plage.jpg");
		driver.quit();
	}

}
