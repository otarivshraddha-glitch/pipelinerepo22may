package hrmWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangeTest 
{   
	
	@Test
	public void openGoogle() 
	{

		   WebDriver driver = new ChromeDriver();

     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

     System.out.println(driver.getTitle());

     driver.quit();
 } 

}
