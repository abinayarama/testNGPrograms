package parallelScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	@Test
	  public void testOne() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test11 in sample two.."+ id);
	  }
	  
	  @Test
	  public void testTwo() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test12 in sample two.."+id);
	  }
	  
	  @Test (invocationCount = 6, threadPoolSize = 3, timeOut = 5000 )
	  public void testThree()
	  {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test13 in sample two.."+id);
	  }
}
