package testNGBasics;

import org.testng.annotations.Test;

public class BasictestNGCommand {
  @Test(enabled=false)
  public void test01() {
	  System.out.println("Test01");
  }
  @Test(priority=1)
  public void test02() {
	  System.out.println("Test02");
  }
  @Test(priority=2)
  public void test03() {
	  System.out.println("Test03");
  }
  @Test
  public void test04() {
	  System.out.println("Test04");
  }
  @Test
  public void test05() {
	  System.out.println("Test05");
  }
}
