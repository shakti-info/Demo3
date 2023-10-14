package MU_Site1.MU_Site1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MUHome 
{
	ChromeDriver driver=new ChromeDriver();
  @Test
  public void Test1() 
  {
	  driver.get("https://www.manutd.com/en");
  }
  
  @Test
  public void Test2() 
  {
	  driver.get("https://www.manutd.com/en");
      driver.get("https://www.manutd.com/en/videos");
      driver.get("https://www.manutd.com/en/videos/first-team");
      driver.get("https://www.manutd.com/en/videos/womens-team");
      driver.get("https://www.manutd.com/en/videos/reserves");
      driver.get("https://www.manutd.com/en/videos/academy");
      driver.get("https://www.manutd.com/en/videos/club");
  }
  @Test
  public void Test3() 
  { 
	  driver.get("https://www.manutd.com/en/news");
      driver.get("https://www.manutd.com/en/news/first-team");
      driver.get("https://www.manutd.com/en/news/women");
      driver.get("https://www.manutd.com/en/news/reserves");
      driver.get("https://www.manutd.com/en/news/academy");
      driver.get("https://www.manutd.com/en/news/club");
  }
  @Test
  public void Test4() 
  {
	  driver.get("https://us.store.manutd.com");
  }
  @Test
  public void Test5() 
  {
	  driver.get("https://www.manutd.com/en/matches/fixtures-results");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/all");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/premier-league");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/fa-cup");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/europa-league");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/league-cup");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/friendly"); 
  }
  @Test
  public void Test6() 
  {
	  driver.get("https://www.manutd.com/en/matches/league-table");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/premier-league/league-table");
      driver.get("https://www.manutd.com/en/matches/first-team/2019-20/europa-league/league-table");
  }
  @Test
  public void Test7() 
  {
	  driver.get("https://www.manutd.com/en/matches/women/2019-20/all");
      driver.get("https://www.manutd.com/en/matches/women/2019-20/fa-womens-super-league");
      driver.get("https://www.manutd.com/en/matches/women/2019-20/fa-womens-continental-league-cup");
      driver.get("https://www.manutd.com/en/matches/women/2019-20/womens-fa-cup");
      driver.get("https://www.manutd.com/en/matches/women/2019-20/friendly");
  }
  @Test
  public void Test8() 
  {
	  driver.get("https://www.manutd.com/en/matches/women/2019-20/all/league-table");
      driver.get("https://www.manutd.com/en/matches/women/2019-20/fa-womens-super-league/league-table");
  }
  @Test
  public void Test9() 
  {
	  driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/all");
      driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/premierleague2-division2");
      driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/efltrophy");
      driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/premierleague-internationalcup");
  }
  @Test
  public void Test10() 
  {
	  driver.get("https://www.manutd.com/en/matches/under-23s/2018-19/all/league-table");
      driver.get("https://www.manutd.com/en/matches/under-23s/2018-19/premierleague2-division2/league-table");
      driver.get("https://www.manutd.com/en/matches/under-23s/2018-19/premierleague-internationalcup/league-table");
  }
  @Test
  public void Test11() 
  {
	  driver.get("https://www.manutd.com/en/matches/under-18s/2019-20/all");
      driver.get("https://www.manutd.com/en/matches/under-18s/2019-20/u18-premierleague-north");
  }
  @Test
  public void Test12() 
  {
	  driver.get("https://www.manutd.com/en/matches/under-18s/2019-20/u18-premierleague-north/league-table");
  }
  @Test
  public void Test13() 
  {
	  driver.get("https://www.manutd.com/en/players-and-staff");
      driver.get("https://www.manutd.com/en/players-and-staff/first-team");
      driver.get("https://www.manutd.com/en/players-and-staff/manager");
      driver.get("https://www.manutd.com/en/players-and-staff/women");
      driver.get("https://www.manutd.com/en/players-and-staff/reserves");
      driver.get("https://www.manutd.com/en/players-and-staff/the-academy");
      driver.get("https://www.manutd.com/en/players-and-staff/legends");
  }
  @Test
  public void Test14() 
  {
	  driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");
  }
  @Test
  public void Test15() 
  {
	  driver.get("https://www.manutd.com/en/visit-old-trafford");
  }
  @Test
  public void Test16() 
  {
	  driver.get("https://www.manutd.com/en/mutv-international");
      driver.get("https://mutv.manutd.com/home?utm_campaign=mutv&utm_content=watchmutv&utm_medium=menu&utm_source=muwebsite");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Vallabhi Rana\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      //ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
