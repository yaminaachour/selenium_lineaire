package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		// Go back
		driver.navigate().back();

		// Go forward
		driver.navigate().forward();

		// Refresh
		driver.navigate().refresh();
        driver.quit();
	}

}
