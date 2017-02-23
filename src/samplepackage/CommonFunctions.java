package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CommonFunctions {
	
	public static WebDriver driver;

	@BeforeClass
	@Parameters({"browserName","url"})
	public void setUp(String browserName, String url) {
		
		if (browserName.equals("IExplore")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer32Bit.exe");
			driver = new InternetExplorerDriver();
			Reporter.log("Script execting on " + browserName + "browser", true);			
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
			Reporter.log("Script execting on " + browserName + "browser", true);
		} else if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			Reporter.log("Script execting on " + browserName + "browser", true);
		} else {
			driver = new FirefoxDriver();
			Reporter.log("Script execting on default firefox browser", true);
		}
		
		driver.get(url);
		driver.manage().window().maximize();
	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
