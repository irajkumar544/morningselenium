package seleniumframeworkJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class webElement {
	

@Test
	public void radioSelect()
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
	}


@Test
public void dropDwon()
{
	
	String projectPath=System.getProperty("user.dir");
	  System.out.println(projectPath);
	  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
	  ChromeDriver driver  = new ChromeDriver();
	  
	  driver.get("https://courses.letskodeit.com/practice");	// it will open application
	 	 driver.manage().window().maximize(); // Will maximize the browser window
	 
	  // to handle the drop down we have select class
	  WebElement s=driver.findElement(By.id("carselect"));
	  
	  Select drpCar=new Select(s);
      //drpCar.selectByVisibleText("Benz");
	  drpCar.selectByIndex(0);
	  drpCar.selectByVisibleText("Honda");
	  
	  
	  
	
}

@Test
public void multiSelect()
{
	String projectPath=System.getProperty("user.dir");
	  System.out.println(projectPath);
	  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
	  ChromeDriver driver  = new ChromeDriver();
	  
	  driver.get("https://courses.letskodeit.com/practice");	// it will open application
	 	 driver.manage().window().maximize(); // Will maximize the browser window

	  Select SE=new Select(driver.findElement(By.id("multiple-select-example")));
	  // List<WebElement> list = SE.getOptions(); 
	  SE.selectByIndex(0);
	  SE.selectByIndex(1); 
	  SE.selectByIndex(2); 
	  SE.deselectByIndex(2); 

}
@Test
public void checkBox()
{    
	
	String projectPath=System.getProperty("user.dir");
System.out.println(projectPath);
System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
ChromeDriver driver  = new ChromeDriver();

    driver.get("https://courses.letskodeit.com/practice");	// it will open application
    
    
	  driver.findElement(By.id("bmwcheck")).click();
	  driver.findElement(By.id("hondacheck")).click();

}

@Test
public void newWindow()
{
	
	String projectPath=System.getProperty("user.dir");
	  System.out.println(projectPath);
	  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
	  ChromeDriver driver  = new ChromeDriver();
	  
	  driver.get("https://courses.letskodeit.com/practice");	// it will open application
	 	 driver.manage().window().maximize(); // Will maximize the browser window

	
	
	  
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
	  driver.switchTo().window(originalWindow); 		 
	  
	  
	  
	  } 
	  
	  }
	

}
@Test
public void alertBox() {
	String projectPath=System.getProperty("user.dir");
	  System.out.println(projectPath);
	  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
	  ChromeDriver driver  = new ChromeDriver();
	  
	  driver.get("https://courses.letskodeit.com/practice");	// it will open application
	 	 driver.manage().window().maximize(); // Will maximize the browser window

	
	  driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Selenium classs"); 
	  driver.findElement(By.id("alertbtn")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  
	  driver.switchTo().alert().accept(); 
	  driver.switchTo().alert().dismiss();
}

@Test
public void mousehower()
{
	
	
		String projectPath=System.getProperty("user.dir");
		  System.out.println(projectPath);
		  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
		  ChromeDriver driver  = new ChromeDriver();
		  
		  driver.get("https://courses.letskodeit.com/practice");	// it will open application
		 	 driver.manage().window().maximize(); // Will maximize the browser window
	
				
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,350)");
			
	  
	  driver.findElement(By.id("mousehover")); 
	  Actions act= new Actions(driver);
	  act.moveToElement(driver.findElement(By.id("mousehover"))).perform();


}



	

}
