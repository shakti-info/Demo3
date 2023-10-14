package MU_Site1.MU_Site1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.bidi.HasBiDi;
import org.openqa.selenium.internal.Debug;

public class MULogin 
{
	ChromeDriver driver=new ChromeDriver();
	RemoteWebDriver chrome = null;
	private String subchieldwindow;
 /* @Test
  public void test1() 
  {
	  driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.findElement(By.xpath("//*[@id=\"later\"]")).click(); 
  }
  @Test
  public void test2() 
  {
	  driver.findElement(By.xpath("//*[@id=\"accept-btn\"]/span")).click(); 
  }
  @Test
  public void test3() 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//*[@id=\"2cc347e1e9b861d50db43c508f7d2b88\"]/div/div/div/button")).click(); 
  }
  @Test
 public void test4() 
  {
	  //Login
	  //driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");
	  driver.findElement(By.id("loginID")).sendKeys("sivaji1.raje@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Kk12@12@12");
	  driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[1]/div[3]/div[4]/input")).click();
  }
  @Test
 public void test5() 
  {
	  //Logout
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("(//a[@aria-label='Log out'])[1]")).click();
	  //driver.findElement(By.xpath("//*[@id=\"2cc347e1e9b861d50db43c508f7d2b88\"]/div/div/div/button")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	  }
  @Test
  public void test6()
  {
	  //Forget Password
	  driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");
	  //driver.findElement(By.xpath("//*[@id=\"later\"]")).click(); 
	  //driver.findElement(By.xpath("//*[@id=\"accept-btn\"]/span")).click();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //driver.findElement(By.xpath("//*[@id=\"2cc347e1e9b861d50db43c508f7d2b88\"]/div/div/div/button")).click(); 
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"gigya-login-form\"]/div[1]/div[3]/div[5]/div[2]/a")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("(//input[@id='loginID'])[1]")).sendKeys("sivaji1.raje@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"gigya-reset-password-form\"]/div[2]/div[1]/input")).click();
  }
  @Test
public void test7() 
  {
	//Registration Module
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");
	  //driver.findElement(By.xpath("//*[@id=\"later\"]")).click(); 
	  //driver.findElement(By.xpath("//*[@id=\"accept-btn\"]/span")).click();
	  //driver.findElement(By.xpath("//*[@id=\"2cc347e1e9b861d50db43c508f7d2b88\"]/div/div/div/button")).click(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//*[@id=\"gigya-login-screen\"]/div/div[2]/label/a")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"gigya-textbox-109721930953108590\"]")).sendKeys("Om");
	  driver.findElement(By.xpath("//*[@id=\"gigya-textbox-87876588695843600\"]")).sendKeys("Narayan");
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("omnarayan.pratham@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ss12@12@12");
	  driver.findElement(By.xpath("//*[@id=\"passwordRetype\"]")).sendKeys("Ss12@12@12");
	  driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-103110153243339230\"]")).sendKeys("India");
	  driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-78676557102405600\"]")).sendKeys("17");
	  driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-93707960692191820\"]")).sendKeys("November");
	  driver.findElement(By.xpath("//*[@id=\"gigya-dropdown-119412947812715380\"]")).sendKeys("1985");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  WebElement radio=driver.findElement(By.xpath("//*[@id=\"register-site-login\"]/div[7]/fieldset/div[2]/div[2]/label"));
	  radio.click();
	  //driver.findElement(By.xpath("//*[@id=\"register-site-login\"]/div[11]/input")).click();
	
  }*/
  @SuppressWarnings("deprecation")
@Test
  public void test8() throws InterruptedException 
  {
	//Clear the cache for the ChromeDriver instance.
	  String url="https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited";
	  driver.get("chrome://settings/clearBrowserData");
	  Thread.sleep(3000);
	  
	  JavascriptExecutor js1 = (JavascriptExecutor)driver;
	  String script1="return document.querySelector('settings-ui').shadowRoot.querySelector('settings-main').shadowRoot.querySelector('settings-basic-page').shadowRoot.querySelector('settings-section > settings-privacy-page').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataDialog').querySelector('#clearFromBasic').shadowRoot.querySelector('#dropdownMenu')";
	  WebElement ddwo=(WebElement)js1.executeScript(script1);
	  ddwo.click();
	  Thread.sleep(7000);
	  Select select=new Select(ddwo);
	  select.selectByVisibleText("All time");
	  Thread.sleep(3000);
	  
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  String script="return document.querySelector('settings-ui').shadowRoot.querySelector('settings-main').shadowRoot.querySelector('settings-basic-page').shadowRoot.querySelector('settings-section>settings-privacy-page').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataDialog').querySelector('#clearBrowsingDataConfirm')";
	  WebElement cleardata=(WebElement)js.executeScript(script);
	  cleardata.click();
	  Thread.sleep(5000);
	  driver.get(url);
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"later\"]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	  driver.findElement(By.xpath("//*[@id=\"accept-btn\"]/span")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  System.out.println("Login By Facebook");
	  driver.findElement(By.xpath("//*[@id=\"Facebook_btn\"]")).click();
	  Thread.sleep(5000);
	  
	  
	  String mainWindowHandle=driver.getWindowHandle();
	  Set<String> allWindowHandles=driver.getWindowHandles();
	  java.util.Iterator<String> iterator= allWindowHandles.iterator();
	  
	  
	  while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);

		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sivaji1.raje@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Was12@12@12");
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		  Thread.sleep(5000);
                }
	  }
			
	  String subchildWindow =driver.getWindowHandle();
	  System.out.println("Subchield:" +subchildWindow);
	  driver.switchTo().window(subchildWindow);
	  driver.findElement(By.xpath("//div[@aria-label='Continue']//div//div//div//span[@dir='auto']//span")).click();
	  Thread.sleep(5000);
	  
	  for(String newWindow : driver.getWindowHandles()) 
	  {
	  driver.switchTo().window(newWindow);
	  driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//a[@aria-label='Log out']")).click();
	  Thread.sleep(5000);
	  }
	  }
      	 
 @Test
  public void test9() throws InterruptedException 
  {
	 System.out.println("Login through Google ID");
	  driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"Google_btn\"]")).click(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  String mainWindowHandle=driver.getWindowHandle();
	  Set<String> allWindowHandles=driver.getWindowHandles();
	  java.util.Iterator<String> iterator= allWindowHandles.iterator();
	  
	  while (iterator.hasNext()) 
	  {
            String ChildWindow1 = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow1)) 
                {
                driver.switchTo().window(ChildWindow1);
                System.out.println("Chield window:"+ChildWindow1);

		  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sivaji1.raje@gmail.com");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		  Thread.sleep(5000);
          }
	  }
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Vallabhi Rana\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() 
  {
	//driver.close();
  }
}

  
