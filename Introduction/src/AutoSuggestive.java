import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		Thread.sleep(10000);
		WebElement origin=driver.findElement(By.id("BE_flight_origin_city"));
	//	origin.click();
		origin.clear();
		//Thread.sleep(2000);
		origin.sendKeys("MAA");
	//	origin.sendKeys(Keys.ARROW_DOWN);
		origin.sendKeys(Keys.ENTER);
		WebElement dest=driver.findElement(By.id("BE_flight_arrival_city"));
		
		Thread.sleep(2000);
	//	dest.click();
		dest.clear();
		dest.sendKeys("DEL");
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);

	}

}
