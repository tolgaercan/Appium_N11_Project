package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initialize_Driver(String platform) {
        properties = ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();

        if (platform.equalsIgnoreCase("Android")) {
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformVersion", "14.0");
            capabilities.setCapability("appPackage", "com.dmall.mfandroid");
            capabilities.setCapability("appActivity", "com.dmall.mfandroid.activity.base.SplashActivity");
            capabilities.setCapability("platformName", "Android");

            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

        } else if (platform.equalsIgnoreCase("iOS")) {
            capabilities.setCapability("deviceName", "iPhone Simulator");
            capabilities.setCapability("platformVersion", "14.0");
            capabilities.setCapability("bundleId", "com.dmall.mfandroid");
            capabilities.setCapability("platformName", "iOS");

            try {
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }

        int impWait = Integer.parseInt(properties.getProperty("implicityWait", "10"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        return driver;
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
