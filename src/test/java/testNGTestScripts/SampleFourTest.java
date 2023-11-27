package testNGTestScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
	@Test(groups="featureOne")
	  public void testOne() {
		  System.out.println("Test 01 in sampleFour");
	  }
	  
	  @Test(groups="featureTwo")
	  public void testTwo() {
		  System.out.println("Test 02 in sampleFour");
	  }
	  
	  @Test (groups="featureThree")
	  public void testThree()
	  {
		  System.out.println("Test 03 in sampleFour");
	  }
	  
	  @Test
	  public void testFour() {
		  System.out.println("Test 04 in sampleFour");
	  }
	}


