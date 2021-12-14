/**import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {
	
	private WebDriver driver;
	
	private WebDriverWait wait;
	
	
	SeleniumUtil(){
		this.driver = new ChromeDriver();
		this.wait = new WebDriverWait(this.driver,600);
	}
	
	void clickButton(String xpath) {
		WebElement btn = this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		btn.click();
	}
	
	void inputText(String text,String xpath) {
		WebElement input = this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		input.sendKeys(text);
	}
	
	void selectDropDownItem(String xpathCh, String xpathSel) {
		clickButton(xpathCh);
		clickButton(xpathSel);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}

	

		
	}
	
	

**/