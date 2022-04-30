package seleniumframeworkJava;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class browserTest {
	
	

	public static void main(String[] args)
	{
		  String projectPath=System.getProperty("user.dir");
		  System.out.println(projectPath);
		  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
		  ChromeDriver driver  = new ChromeDriver(); 	
		 
	 	 driver.get("https://courses.letskodeit.com/practice");	 
	 	 driver.manage().window().maximize();
	 	 
	 	// driver.findElement(By.id("benzradio")).click();
	 	 driver.findElement(By.xpath("//input[@id='benzradio']")).click();
	 	 driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
	 	 driver.findElement(By.id("benzradio")).click();
	 	 driver.findElement(By.id("bmwradio")).click();
	 	 
	 	 
	      
//		  System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromeDriver/chromedriver.exe"); 
//		  ChromeDriver driver  = new ChromeDriver();
		  
		  
		  
		  // for mac commond+SIft+O
			/*
			 * Select SE=new Select(driver.findElement(By.id("multiple-select-example")));
			 * // List<WebElement> list = SE.getOptions(); SE.selectByIndex(0);
			 * SE.selectByIndex(1); SE.selectByIndex(2); SE.deselectByIndex(2);
			 * driver.findElement(By.id("bmwcheck")).click();
			 * driver.findElement(By.id("hondacheck")).click();
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
		  
		

	 	 
	 	 
	 	 
			/*
			 * driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(
			 * "seleniumClasses"); driver.findElement(By.id("alertbtn")).click();
			 * System.out.println(driver.switchTo().alert().getText());
			 * driver.switchTo().alert().accept(); //driver.switchTo().alert().dismiss();
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,350)");
			 * driver.findElement(By.id("mousehover")); Actions act= new Actions(driver);
			 * act.moveToElement(driver.findElement(By.id("mousehover"))).perform();
			 */
	
	}

}
