package Jenkin.TestngJenkienExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class TestGoogle {
	
	@Test
	void googleSearch()
	{
		//1. connecting driver with script
				WebDriverManager.chromedriver().setup();
				
				//2. Create Webdriver object for accessing browser element
				// It will open browser
				WebDriver driver = new ChromeDriver();
				/*
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				*/
				//3. Go to URL
				driver.get("https://www.google.com/");
				
				WebElement textbox=driver.findElement(By.id("APjFqb"));
				textbox.sendKeys("selenium");
				//textbox.click();
				//textbox.sendKeys(Keys.ARROW_DOWN);
				//textbox.sendKeys(Keys.ARROW_DOWN);
				//textbox.sendKeys(Keys.ARROW_DOWN);
				
				driver.findElement(By.name("btnK")).submit();
				//driver.findElement(By.id("APjFqb")).click();
	}

}
