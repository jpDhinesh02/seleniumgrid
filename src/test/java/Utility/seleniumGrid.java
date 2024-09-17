package Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumGrid {

    public static WebDriver gridDriver(String browserName) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("platformName", Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL(" http://172.25.10.171:4444/wd/hub"), capabilities);
        return driver;
    }
}
