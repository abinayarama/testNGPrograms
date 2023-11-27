package testNGTestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GooglePageTest {
	WebDriver driver ;
	//@Parameter("browser")
	@BeforeMethod
	public void setUp(String strBrowser)
	{
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	}
	@BeforeTest
	public void lauchurl()
	{
//		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	
	}
	//priority..all the test will execute in alphabetical order.
	//to order this..give priority
  @Test (priority=1)
  public void searchpage() {
	  
	  
		driver.get("https://www.google.co.in/");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(),"Google Page");
		
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.tagName("text area"));
		searchbox.sendKeys("java tutorial");
		searchbox.submit();
		
		
 //WebElement searchbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchbox.sendKeys("java tutorial");
  }
  @AfterTest
  public void closepage()
  {
	  driver.close();
  }
  
}
