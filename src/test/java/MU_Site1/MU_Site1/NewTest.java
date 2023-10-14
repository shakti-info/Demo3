package MU_Site1.MU_Site1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest 
{
  @Test
  public void test1() 
  {
	  System.out.println("This is my Test Area");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("This the my Pre Conditiond Area");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("This my Post conditioned Area");
  }

}
