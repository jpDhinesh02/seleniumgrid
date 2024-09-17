package Test;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Utility.seleniumGrid;

public class launchBrowser {

	@Test
	public void launchChrome() throws MalformedURLException, InterruptedException {
		WebDriver driver = seleniumGrid.gridDriver("chrome");
		System.out.println("Chrome browser Start");
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println("Chrome browser Quit");
		driver.quit();
	}

	@Test
	public void launchFireFox() throws MalformedURLException {
		WebDriver driver = seleniumGrid.gridDriver("firefox");
		System.out.println("Firefox browser Start");
		driver.get("https://www.google.com/");
		System.out.println("Firefox browser Quit");
		driver.quit();
	}
}
