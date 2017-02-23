package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ecommerce {

	public static void main (String arg[])
	{
	
		String chromepath= "D:\\Data\\yugandhar\\My Public folder(cambium)\\Automation - New\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver yug= new ChromeDriver();
		yug.get("http://toolsqa.com");
		Actions mouse_action=new Actions(yug);
		mouse_action.moveToElement(yug.findElement(By.xpath("//span[contains(text(),'DEMO SITES')]")));
		yug.findElement(By.xpath("//span[contains(text(),'E-Commerce Demo Site')]")).click();
		yug.close();
	}
	
		
	
	
	
	
	
}
