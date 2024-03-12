package testNGBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupingTest {
  @Test(groups="test")
  public void test01() {
	  System.out.println("Test01");
  }
  @Test(groups="run")
  public void test02() {
	  System.out.println("Test02");
  }
  @Test(groups="test")
  public void test03() {
	  System.out.println("Test03");
  }
  @Test
  public void test04() {
	  System.out.println("Test04");
  }
  @Test(groups={"run","fromanothersuitefile"})
  public void test05() {
	  System.out.println("Test05");
  }
  @DataProvider (name = "data-provider-anotherclass")
	public Object[][] dpMethod1(){
	return new Object[][] {{"Rose","Mary"}, {"abc","James"}, {"bcd","Love"}};
	}
}
