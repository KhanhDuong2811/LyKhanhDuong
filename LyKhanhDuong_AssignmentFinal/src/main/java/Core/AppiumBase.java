package Core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

public class AppiumBase {
    public static WebDriver driver;
    public static AndroidDriver drive;
    public static WebDriverWait wait;

    @BeforeTest
    public void setup() throws MalformedURLException {

        System.out.println("this is step: open app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "9.0");
//        capabilities.setCapability(APP, "C:\\Users\\PC\\AppData\\Local\\Android\\Sdk\\platform-tools\\Tiki.apk");
        capabilities.setCapability("appPackage", "com.nct.shopiness");
        capabilities.setCapability("appActivity", ".ui.activities.intro.SplashActivity");
        drive = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(drive, Duration.ofSeconds(30));

    }
    public void teardown(){
        System.out.println("this is step: teardown");
        drive.closeApp();
    }
}
