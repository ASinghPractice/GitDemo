import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());

		// check each link in a column
		for (int i = 1; i < col.findElements(By.tagName("a")).size(); i++) {
			String newClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			col.findElements(By.tagName("a")).get(i).sendKeys(newClick);

			Thread.sleep(5000);

		}
// to get the title of all open tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> itr = abc.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
	}

}
