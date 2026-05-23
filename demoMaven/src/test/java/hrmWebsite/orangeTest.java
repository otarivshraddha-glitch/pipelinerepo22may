package hrmWebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orangeTest 
{   
	
	@Test
	public void openGoogle() 
	{

		   WebDriver driver = new ChromeDriver();
		   
		// ImpliciteWait
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

     driver.manage().window().maximize();
		

		// login process
		// to locate username text box ---by name locator
		WebElement un=driver.findElement(By.name("username"));

		// to locate password text box ---by name locator
	    WebElement pw=driver.findElement(By.name("password"));

		Actions act = new Actions(driver);
		
		un.sendKeys("asdrl");
	    
	   // Thread.sleep(5000);
	   // un.sendKeys(Keys.TAB); //downward
	    act.sendKeys(Keys.DOWN).build().perform();
	    
	    
	    //Thread.sleep(5000);
	    pw.sendKeys("admin123");
	    
	    //Thread.sleep(5000);
		   // pw.sendKeys(Keys.chord(Keys.SHIFT ,Keys.TAB)); //upward
		    act.sendKeys(Keys.UP).build().perform();
		    
		   // Thread.sleep(5000);
		    //un.sendKeys(Keys.CLEAR);
		    un.sendKeys(Keys.chord(Keys.CONTROL ,"a" , Keys.DELETE));
		    
		    //Thread.sleep(5000);
		    un.sendKeys("Admin");
			
			
			// to locate login button---by className locator
			driver.findElement(By.className("oxd-button")).click();
		
     
     
     
     
     System.out.println(driver.getTitle());

     driver.quit();
 } 

}
