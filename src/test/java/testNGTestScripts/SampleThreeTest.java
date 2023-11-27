package testNGTestScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test
  public void testOne() {
	  System.out.println("Test 01 in samplethree");
  }
  
  @Test
  public void testTwo() {
	  System.out.println("Test 02 in samplethree");
  }
  
  @Test(groups="featureOne")
  public void testThree()
  {
	  System.out.println("Test 03 in samplethree");
  }
  
  @Test
  public void testFour() {
	  System.out.println("Test 04 in samplethree");
  }
}
