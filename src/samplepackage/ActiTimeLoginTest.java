package samplepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import samplepackage.CommonFunctions;

public class ActiTimeLoginTest extends CommonFunctions{	
	
	@Test
	@Parameters({"userName","password"})
	public void loginTest(String userName, String password) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement objUserName = driver.findElement(By.name("username"));
		if (objUserName.isDisplayed()) {
			Reporter.log("Username element found in Application and Script executing ....",true);
			if (objUserName.isEnabled()) {
				Reporter.log("Username element is enable for typing");
				objUserName.sendKeys(userName);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
				driver.findElement(By.linkText("Logout")).click();
			} else {
				Reporter.log("Username element is disable for typing");
			}
		}

		else {
			Reporter.log("Username element not found in Application");
		}
	}

	

}



