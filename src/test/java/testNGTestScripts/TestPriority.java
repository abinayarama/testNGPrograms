package testNGTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPriority {
	WebDriver driver = new ChromeDriver();
//	  @Test(priority=2)
//	  public void google() {
//		  driver.get("https://www.google.co.in/");
//	  }
	  @Test (alwaysRun=true, dependsOnMethods="seleniumeasy")
	  public void googlesearch() {
		  driver.get("https://www.google.co.in/");
	  }
	  @Test (enabled=false)
	  public void seleniumeasy()
	  {
		  driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	  }
	  
	  @Test 
	  public void opencart()
	  {
		  driver.get("https://www.opencart.com/index.php?route=cms/demo");
	  }
	}


