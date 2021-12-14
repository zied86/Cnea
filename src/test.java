import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.Timeouts;

public class test {
	//SeleniumUtil seleniumUtil = new SeleniumUtil();
	//seleniumUtil.getDriver().get("http://192.168.26.145:96/#/auth/login");
	//seleniumUtil.getDriver().manage().window().maximize(); //Maximiser la fenêtre du navigateur

	//seleniumUtil.LoginPage("raissi.zied0108+217@gmail.com","Admin@2020");

	//seleniumUtil.clickButton("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/div[1]/div[1]");
	public static void main(String[] args ) throws InterruptedException {	
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
		Thread.sleep(3000);
		Ajoutuser.click();

		WebElement name  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		WebElement prenom  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='name'])[2]")));
		WebElement cin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='name'])[3]")));
		WebElement mail  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='email']")));
		WebElement soumettre   = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[4]/div[2]")));
		WebElement Phone  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='phone']")));
		WebElement identifiantcnea  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='identifiantCnea']")));
		name.sendKeys("zied");
		prenom.sendKeys("raissi");
		cin.sendKeys("09020112");
		Thread.sleep(3000);
		mail.sendKeys("raissi.zied0108+218@gmail.com");
		Phone.sendKeys("85333655");	
		Thread.sleep(3000);
		identifiantcnea.sendKeys("00501");
		WebElement catenseignant = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[2]/button")));
		Thread.sleep(3000);
		catenseignant.click();

		WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[3]/button")));
		test.click();

		WebElement Nature = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[3]/div/div/button[1]")));
		Nature.click();


		WebElement Niv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" /html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[4]/button")));
		Niv.click();
		WebElement Niv1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[4]/div/div/button[1]")));
		Niv1.click();

		WebElement Grade = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[5]/button")));
		Thread.sleep(3000);
		Grade.click();
		WebElement Enseigant1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[5]/div/div/button[1]")));
		Enseigant1.click();

		WebElement RegimeH = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[7]/button")));
		RegimeH.click();
		WebElement Regime2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[7]/div/div/button[2]")));
		Regime2.click();

		WebElement Centre = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[8]/div/ng-multiselect-dropdown/div/div[1]/span/span[1]")));
		Centre.click();
		WebElement Ariana = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[8]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[2]/div")));
		Ariana.click();
		// Centre.click();
		WebElement Sokra = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[8]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[3]/div")));
		Sokra.click();

		WebElement Ariana1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[8]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[4]/div")));
		Ariana1.click();

		WebElement Date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[6]/input")));
		Date.click();
		WebElement DateA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[6]/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[3]/span")));
		DateA.click();
		WebElement DateAA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[6]/bs-datepicker-container/div/div/div/div/bs-years-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[1]/td[1]/span")));
		DateAA.click();
		WebElement DateM = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[6]/bs-datepicker-container/div/div/div/div/bs-month-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[1]/td[1]/span")));
		DateM.click();	
		WebElement DateJ = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[6]/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[1]/td[3]/span")));
		DateJ.click();

		WebElement SelGovernorat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[3]/div[2]/div[1]/button")));
		SelGovernorat.click();

		WebElement Governorat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[3]/div[2]/div[1]/div/div/button[18]")));
		System.out.println("hello" + Governorat);
		Governorat.click();
		WebElement Imada = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[3]/div[2]/div[2]/button")));
		Imada.click();
		WebElement ImadaA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[3]/div[2]/div[2]/div/div/button[10]")));
		ImadaA.click();

		Thread.sleep(3000);

		WebElement Caté = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-create-user/div/form/div[2]/div[2]/div[2]/button")));
		Thread.sleep(3000);
		Caté.click();
		WebElement Caté1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-bar-main\"]/app-create-user/div/form/div[2]/div[2]/div[2]/div/div/button[1]")));

		Caté1.click();
		
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"import-button-container\"]/div/div"));
		uploadFile.sendKeys("\"C:\\Users\\zss\\Desktop\\Formation Selenium\\Capture d’écran 2021-10-08 095220.png\"");
		//driver.findElement(By.id("terms")).click();
		//soumettre.click();
	}
}
