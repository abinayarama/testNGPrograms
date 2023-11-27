package parallelScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void testOne() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test1 in sample one.."+ id);
  }
  
  @Test
  public void testTwo() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test2 in sample one.."+id);
  }
  
  @Test
  public void testThree()
  {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test3 in sample one.."+id);
  }
}
