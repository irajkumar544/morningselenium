package seleniumframeworkJava;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class browserTest {
	
	

	// testing comments git commit test testing mmmmmmmmmmmmmmm
	
	// newLine Testing
	
	// API changes 
	// new changes Testing 
	
	// UI changes 
	
	


	public static void main(String[] args)
	{
		  String projectPath=System.getProperty("user.dir");
		  System.out.println(projectPath);
		  
		  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
		  
		  
		  
		  ChromeDriver driver  = new ChromeDriver(); 	
		  
		 
	 	 driver.get("https://courses.letskodeit.com/practice");	// it will open application
	 	 
	 	 
	 	 driver.manage().window().maximize(); // Will maximize the browser window 
	 	 
	 	 
	 	 
	 	 
	 	 driver.findElement(By.id("hondaradio")).click();
	 	 
	 	 //xpath =   //tagne [@attributename='']	 
	 	 
	 	 driver.findElement(By.id("benzradio")).click();	 	 
	 	 
	 	 driver.findElement(By.xpath("//input[@id='benzradio']")).click();
	 	 
	 	 driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
	 	 driver.findElement(By.id("benzradio")).click();
	 	 
   
           Select drpCar=new Select(driver.findElement(By.id("carselect")));
           drpCar.selectByVisibleText("Benz");
           drpCar.selectByIndex(2);
           
           
			
			  Select SE=new Select(driver.findElement(By.id("multiple-select-example")));
			  // List<WebElement> list = SE.getOptions(); 
			  SE.selectByIndex(0);
			  SE.selectByIndex(1); 
			  SE.selectByIndex(2); 
			  SE.deselectByIndex(2);
			  driver.findElement(By.id("bmwcheck")).click();
			  driver.findElement(By.id("hondacheck")).click();
			  
			  
			  
			  // get the original window ID
			  String originalWindow = driver.getWindowHandle();
			  System.out.println(originalWindow);   
			  
			  
			  assert driver.getWindowHandles().size() == 1;
			  
			  
			  driver.findElement(By.id("openwindow")).click(); 
			  
			  
			
			  
			  for (String windowHandle : driver.getWindowHandles())
			  {
			         if(!originalWindow.contentEquals(windowHandle)) 
			  
			  {
			  driver.switchTo().window(windowHandle);
			  
			  driver.findElement(By.linkText("HOME")).click();
			  driver.findElement(By.linkText("ALL COURSES")).click();
			  driver.close();
			  
			  driver.switchTo().window(originalWindow); 		 
			  
			  
			  
			  } 
			  
			  }
			 
			  
			  
			
				/*
				 * driver.get("https://www.google.com/");
				 * driver.findElement(By.name("q")).sendKeys("iphone12");
				 */
				  
			
				 
			/* 
			
			 * System.setProperty("webdriver.gecko.driver",
			 * "C:\\Users\\Rajkumar\\eclipse-workspace\\seleniumframeworkJava\\drivers\\geckodriver\\geckodriver.exe"
			 * ); System.setProperty("webdriver.gecko.driver",
			 * projectPath+"\\drivers\\geckodriver\\geckodriver.exe"); FirefoxDriver driver
			 * = new FirefoxDriver();
			 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		*/	 	 
	 	 
			
			  driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Janki+Disha+Sweetu"); 
			  
			  driver.findElement(By.id("alertbtn")).click();
			  
			  System.out.println(driver.switchTo().alert().getText());
			  
			  driver.switchTo().alert().accept(); 
			  //driver.switchTo().alert().dismiss();
			  
			  
			  
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,350)");
			  
			  driver.findElement(By.id("mousehover")); 
			  Actions act= new Actions(driver);
			  act.moveToElement(driver.findElement(By.id("mousehover"))).perform();
			 
	
	}

}
