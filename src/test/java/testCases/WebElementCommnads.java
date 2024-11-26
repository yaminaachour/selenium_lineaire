package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommnads {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();
		String url = "https://www.saucedemo.com/";
		driver.get(url);

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));

		username.clear();
		username.sendKeys("standard_user");

		password.clear();
		password.sendKeys("secret_sauce");

		String addValue = username.getAttribute("name");
		System.out.println(addValue);

		// Size of element
		Dimension dimention = btnLogin.getSize();
		System.out.println("Height: " + dimention.height);
		System.out.println("Width: " + dimention.width);

		// Localization of element
		Point point = username.getLocation();
		System.out.println("X coordinate: " + point.x);
		System.out.println("Y coordinate: " + point.y);

		// Vérifier un élément affiché
		boolean result1 = btnLogin.isDisplayed();
		System.out.println(result1);

		// Vérifier un élément activé
		boolean result2 = btnLogin.isEnabled();
		System.out.println(result2);

		// Vérifier un élément existe
		List<WebElement> loginBtn = driver.findElements(By.id("login-button"));
		if (loginBtn.size() != 0) {
			System.out.println("The element exist");

		} else {
			System.out.println("The element does not exist");
		}

		btnLogin.click();

	}

}
