import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testChamp {

	public static void main(String[] args) throws InterruptedException {
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

		WebElement gestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/div[1]/div[2]")));
		WebElement gestionUser = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/div[1]/div[2]"));
		gestionUser.click();
		WebElement Ajoutuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'content-width-button std-primary-btn-style')]")));  
		Ajoutuser.click();
		WebElement Cat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[2]/button")));
		Thread.sleep(3000);
		Cat.click();
		WebElement Cat1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[2]/div/div/button[1]")));
		
		Cat1.click();
		//soumettre.click();

	}

}
