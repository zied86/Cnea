/**import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScollPage {
	
	public void scrol () throws Throwable
	{


		WebDriver driver = new ChromeDriver(); 
 

 // maximize browser
  driver.manage().window().maximize();
 

  // Open Application
  driver.get("http://192.168.26.145:96/#/home/users/create");
  

  // Wait for 5 second
  Thread.sleep(5000);

 // This  will scroll page 400 pixel vertical
  ((JavascriptExecutor)driver).executeScript("scrol(0,400)");
  
     
 }


}

**/

