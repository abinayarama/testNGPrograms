package testNGTestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

public class GooglePageTest {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void lauchurl()
	{
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	
	}
	
  @Test
  public void searchpage() {
	  
		
	 WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchbox.sendKeys("java tutorial");
  }
  @AfterTest
  public void closepage()
  {
	  driver.close();
  }
  
}
