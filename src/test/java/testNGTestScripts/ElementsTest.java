package testNGTestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ElementsTest {
	WebDriver driver= new ChromeDriver();
	@BeforeTest
	public void url()
	{
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
	}
  @Test
  public void getList() throws InterruptedException {
	  List <WebElement> names=driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
		Thread.sleep(1000);
		System.out.println("Associates who works in San Francisco:");
		for (WebElement items:names)
		System.out.println(items.getText());
		System.out.println("Total number of associates:"+names.size());
  }
  @Test
  public void getSize() throws InterruptedException
  {
	  List <WebElement> engineerlist = driver.findElements(By.xpath("//table[@id='example']//td[contains(text(),'Software Engineer')]//preceding::td[1]"));
	  Thread.sleep(5000);
	  
	  System.out.println(engineerlist.size());
	  for (int i=0;i<engineerlist.size();i++)
	  {
		  if(engineerlist.get(i).getText().equalsIgnoreCase("B. Wagner"))
		  {
			  System.out.println(engineerlist.get(i).getAccessibleName());
		  }
			  
	  }
  }
  
  @AfterTest
  public void close() {
	  driver.close();
  }
}
