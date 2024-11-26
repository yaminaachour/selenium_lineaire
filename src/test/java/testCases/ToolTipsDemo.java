package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");

		WebElement btnHoverMeToSee = driver.findElement(By.id("toolTipButton"));
		String tooltipText = btnHoverMeToSee.getText();

		if (tooltipText.equals("Hover me to see")) {
			System.out.println("Pass : tooltip matching expected value");

		} else {
			System.out.println("Fail : tooltip is not matching expected value");

		}
		driver.quit();
	}

}
