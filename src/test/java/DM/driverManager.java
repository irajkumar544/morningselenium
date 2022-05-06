package DM;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class driverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();

        WebDriverManager.chromedriver().setup();        
        WebDriver driver = new ChromeDriver();
        


       
       
      // driver.get("https://courses.letskodeit.com/practice");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));


       driver.manage().window().maximize();
          driver.findElement(By.id("benzradio")).click();
          Select drpCar=new Select(driver.findElement(By.id("carselect")));
          drpCar.selectByVisibleText("Benz");
          
      	
			  String originalWindow = driver.getWindowHandle();
			  System.out.println(originalWindow); 
			  assert driver.getWindowHandles().size() == 1;
			  driver.findElement(By.id("openwindow")).click(); 
			
			  
			  for (String 	windowHandle : driver.getWindowHandles())
			  {
			  if(!originalWindow.contentEquals(windowHandle)) 
			  
			  {
			  driver.switchTo().window(windowHandle);
			  driver.findElement(By.linkText("HOME")).click();
			  driver.findElement(By.linkText("ALL COURSES")).click();
			  driver.switchTo().window(originalWindow); 		 
			  
			  
			  
			  } 
			  
			  }
			  
			  
			  
			   // driver.findElement(By.id("disabled-button")).click();
			    
			    WebElement element=driver.findElement(By.id("enabled-example-input"));
				System.out.println(element.isEnabled());
				
				
			  
				
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,650)");
				  
				  
				  int size = driver.findElements(By.tagName("iframe")).size(); 
				   System.out.println(size);
				  
				  driver.switchTo().frame("courses-iframe");
				  
				  System.out.println("switch to frame");
				  
				  
				  Actions act= new Actions(driver);
				  act.moveToElement(driver.findElement(By.xpath(
				  "//img[@src='https://s3.amazonaws.com/contents.newzenler.com/3072/courses/11131/data/thumb/s-2.jpg']"
				  ))) .click().build().perform();
				 
			  
			  
			  driver.quit();
			  driver.close();
			  
		
	}

}
