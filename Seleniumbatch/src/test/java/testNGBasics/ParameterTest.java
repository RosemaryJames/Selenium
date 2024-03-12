package testNGBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
  @Test
  @Parameters({"ParameterName","ParameterNumber"})
  public void sampleTestCase(String s,int a) {
	 System.out.println(s);
	 System.out.println(a);
  }
}
