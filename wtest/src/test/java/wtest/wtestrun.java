package wtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wtestrun {

	public static void main(String[] args) throws Exception {
		
		Browser1();

	}
	
	@Test
	public static void Browser1() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		options.addArguments("--headless", "--disable-gpu", "--window-size=1580,12800","--ignore-certificate-errors",
                "--disable-extensions","--no-sandbox","--disable-dev-shm-usage", "--disable-crash-reporter");
		//options.addArguments("disable-infobars");
		//options.addArguments("disable-gpu");
		options.merge(caps);
		//URL url = new URL("http://3.95.161.130:49154/wd/hub");
		driver = new ChromeDriver(options);
		//driver.get("http://3.95.161.130:49154/wd/hub");
		driver.get("http://webapp");
		//driver.get("http://18.233.10.79");
		Thread.sleep(6000);
		System.out.print("Title of the page is: " + driver.getTitle() + "\n");
		Assert.assertTrue(driver.getTitle().equals("Intellipaat"),"Page title is not correct");
		Thread.sleep(2000);
		driver.quit();
	}

}
