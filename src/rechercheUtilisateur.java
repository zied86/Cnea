import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rechercheUtilisateur {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zss\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");

		driver.get("http://192.168.26.145:96/#/auth/login?redirectUrl=%2Fhome%2Fsettings%2Fcours");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement mailuser =driver.findElement(By.xpath("	/html/body/app-root/app-login/div/div[2]/mat-card/form/div[1]/input"));
		mailuser.sendKeys("raissi.zied0108@gmail.com");
		WebElement pass =driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[2]/input"));
		pass.sendKeys("Admin@2020");

		WebElement Auth = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[4]/button"));
	
		Auth.click();
		
		
		
	}

}
