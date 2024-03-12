package testNGBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3 }, {5, 7}, {8,7}};
	}
	@DataProvider (name = "data-providerstring")
	public Object[][] dpMethod1(){
	return new Object[][] {{"Rose",3}, {"abc",4}, {"bcd",14}};
	}
  @Test(dataProvider="data-provider")
  public void testcase01(int a,int b) {
	  System.out.println(a+b);
  }
  @Test(dataProvider="data-providerstring")
  public void testcase02(String s,int b) {
	  System.out.println(s);
	  System.out.println(b);
  }
  @Test(dataProvider="data-provider-anotherclass",dataProviderClass=GroupingTest.class)
  public void testcase02(String a,String b) {
	  System.out.println(a);
	  System.out.println(b);
  }
}
