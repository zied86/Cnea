import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ficheEnseignant {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zss\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");

		driver.get("http://192.168.26.145:96/#/auth/login?redirectUrl=%2Fhome%2Fsettings%2Fcours");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);

		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[1]/input")).sendKeys("raissi.zied0108@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[2]/input")).sendKeys("Admin@2020");

		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[4]/button")).click();

		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/mat-card/form/div[4]/button")).click();

        WebElement gestionUtilisatteur =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/div[1]/div[1]/mat-icon")));
        gestionUtilisatteur.click();
        WebElement editFicheEnseignant = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-list-users/div/div[3]/div[2]/div[1]/div[2]/div/div[1]")));
        editFicheEnseignant.click();
        
        
        
        
	}



}
