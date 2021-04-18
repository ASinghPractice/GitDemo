import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait=WebDriverWait(driver,40);
		//Thread.sleep(8000);
		WebElement from=driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.clear();
		from.click();
		from.sendKeys("MAA");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		WebElement to=driver.findElement(By.xpath("//input[@id='toCity']"));
		to.clear();
		to.click();
		to.sendKeys("DEL");
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);

	}

	private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
