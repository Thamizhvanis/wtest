package wtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wtest {
	
    @Test
    public static void Browser2() throws Exception {

            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
            ChromeOptions options = new ChromeOptions();
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setAcceptInsecureCerts(true);
            options.addArguments("--headless", "--disable-gpu", "--window-size=1580,12800","--ignore-certificate-errors",
            "--disable-extensions","--no-sandbox","--disable-dev-shm-usage", "--disable-crash-reporter");
            options.merge(caps);
            driver = new ChromeDriver(options);
            driver.get("http://44.201.79.240");
            Thread.sleep(2000);
            System.out.print("Title of the page is: " + driver.getTitle() + "\n");
            Assert.assertTrue(driver.getTitle().contains("Intellipaat"),"Page title is not correct");
            Thread.sleep(2000);
            driver.quit();
    }
}

