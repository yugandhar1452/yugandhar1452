package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SampleWebDriver {
	
	
	private static  WebDriver driver;

	public static void setup()
	{
		driver = new FirefoxDriver();	
		driver.get("https://qa.elibrary.voyagersopris.com");
	
		
		}
	
	public static void close()
	{
	driver.quit();	
	}
	
	
	public static void main (String[] args)
	{
		setup();
		close();
	}

}
