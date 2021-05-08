package dummy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.Rectangle;

import com.google.common.io.Files;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class Test_dummy {
	
//   private WebDriver driver;
	
//  @BeforeSuite()
//  public void beforeSuite() {
//	  System.setProperty("webdriver.chrome.driver", "D://softwares//seleniumreq//chromedriver_win32//chromedriver.exe");
//
//      ChromeOptions chromeOptions = new ChromeOptions();
//      // in cmd prompt : chrome.exe –remote-debugging-port=9222 –user-data-dir=D:\eclipse-workspace\ws1\testngpro\chromedebugdata
//      //chromeOptions.setExperimentalOption("debuggerAddress","localhost:9222 ");
//      chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//	  driver = new ChromeDriver(chromeOptions);
//  }
  
//  @BeforeClass
//  public void beforeClass() {
//	  print("test case execution started");
//	  driver = DriverClass.driver;
//  }
//  
//  @Test
//  public void method_1_goToApp() throws InterruptedException, IOException {
//	  driver.get("https://selenium.dev");
//	  String urlname = driver.getCurrentUrl();
//	  print(urlname);
//	  print(driver.getTitle());
//	  print(driver.getWindowHandle());	  
//	  assert driver.getWindowHandles().size() == 1;
//	  
//  }
//  
//  @Test
//  public void method_2_swith() {
//	  driver.switchTo().newWindow(WindowType.TAB);
//	  assert driver.getWindowHandles().size() == 2;
//	  driver.navigate().to("http://bing.com");
//  }
//  
//  @Test
//  public void method_3_swith() {
//	  driver.switchTo().newWindow(WindowType.WINDOW);
//	  assert driver.getWindowHandles().size() == 3;
//	  driver.navigate().to("http://yatra.com");
//  }
//  
//  @Test
//  public void method_4_TakeScreenshot() {
//	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  try {
//		  Files.copy(scrFile, new File("./image.png"));
//	  } catch (IOException e) {
//		  // TODO Auto-generated catch block
//		  e.printStackTrace();
//		  print("method_4_takescreenshot : screen shot error");
//	  }
//  }
//  
//  @Test  
//  public void method_5_TakeElementScreenshot() {
//
//	  driver.manage().window().maximize();
//	  WebElement element = driver.findElement(By.cssSelector(".anniversary-banner .anniversaryBannerText .conta"));
//	  File elemFile = element.getScreenshotAs(OutputType.FILE);
//	  try {
//		  Files.copy(elemFile, new File("./elem.png"));
//	  } catch (IOException e) {
//		  // TODO Auto-generated catch block
//		  e.printStackTrace();
//		  print("method_5_takescreenshot : element screen shot error");
//	  }
//  }
//  
//  @Test
//  public void method_6_getRectattributes() {
//
//	  // Get attribute of current active element
//	  WebElement activeE = driver.switchTo().activeElement();
//	  String attr = activeE.getAttribute("class");
//	  print(attr);
//	  print(activeE.getTagName());
//
//	  Rectangle activeR = activeE.getRect();
//	  print(activeR.getX() +"--"+ activeR.getY() +"--"+ activeR.getDimension() );
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  print("Test case Execution completed");
//  }
//    
//  void print(String s){
//	  System.out.println(s);
//  }

}
