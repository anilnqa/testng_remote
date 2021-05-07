package dummy;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Test_RemoteExecution {

//	@BeforeMethod
//	public void beforeMethod() throws MalformedURLException {
//		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("--no-sandbox");
//		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//		driver = new RemoteWebDriver(new URL("http://35.225.158.172:4444/wd/hub"), chromeOptions);
//	}

	@Test
	public void testremote() throws InterruptedException, IOException {
		RemoteWebDriver driver = DriverClass.getDriver();
		driver.get("https://selenium.dev");
		String urlname = driver.getCurrentUrl();
		print(urlname);
		print(driver.getTitle());
		print(driver.getWindowHandle());
		assert driver.getWindowHandles().size() == 1;
		driver.navigate().to("http://yatra.com");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("./image.png"));
	}

	void print(String s) {
		System.out.println(s);
	}

}
