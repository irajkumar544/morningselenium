package seleniumframeworkJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	
	
	public void setUP()
	{
		
		  String projectPath=System.getProperty("user.dir");
		  System.out.println(projectPath);
		  System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromeDriver\\chromedriver.exe"); 
		  WebDriver driver  = new ChromeDriver(); 	
		 
		 driver.get("https://courses.letskodeit.com/practice");	// it will open application
		 
		 driver.manage().window().maximize(); // Will maximize the browser window 
	}

}
