package dummy;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverClass {
	
	//public static WebDriver driver;
	private static RemoteWebDriver driver;
	
	public static RemoteWebDriver getDriver() {
		return driver;
	}
	
//	public static WebDriver getDriver() {
//		return driver;
//	}

//	@BeforeSuite
//	public void launchBrowser() {
//
//		ChromeOptions chromeOptions = new ChromeOptions();
//		System.setProperty("webdriver.chrome.driver", "D://softwares//seleniumreq//chromedriver_win32//chromedriver.exe");
//		// in cmd prompt : chrome.exe –remote-debugging-port=9222 –user-data-dir=D:\eclipse-workspace\ws1\testngpro\chromedebugdata
//		//chromeOptions.setExperimentalOption("debuggerAddress","localhost:9222 ");
//		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//		driver = new ChromeDriver(chromeOptions);
//		print ("Launch browser");
//	}

	  @BeforeSuite
	  public void launchBrowser() throws MalformedURLException {
		  //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		  ChromeOptions chromeOptions = new ChromeOptions();
		  chromeOptions.addArguments("--headless");
		  chromeOptions.addArguments("--no-sandbox");
		  chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		  driver = new RemoteWebDriver(new URL("http://35.225.158.172:4444/wd/hub"), chromeOptions);
	  }

	@AfterSuite
	public void afterSuite() {
		driver.close();
		driver.quit();
		print ("quit browser");
	}
	
	  void print(String s){
		  System.out.println(s);
	  }

}
