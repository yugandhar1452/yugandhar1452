package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Testngsample1 {
	
	WebDriver yug;

	@Parameters("browser")
	@BeforeClass
	public void method1(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		yug = new FirefoxDriver();
		yug.get("https://qa.vport.voyagersopris.com");
			
	}else if (browser.equalsIgnoreCase("chrome"))
	{
		yug = new ChromeDriver();
		yug.get("https://qa.vport.voyagersopris.com");
	}

}

	
	
	
	
}