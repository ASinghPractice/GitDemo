import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000);

		String[] items = { "Carrot", "Mango", "Onion", "Pista" };
		addItems(driver,items);


	}

	public static void addItems(WebDriver driver, String[] items) 
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int size = products.size();
		for (int i = 0; i <= size; i++) {
			String[] prod = products.get(i).getText().split("-");
			String veggie = prod[0].trim();
			List a = Arrays.asList(items);
			if (a.contains(veggie)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == items.length) {
					break;
				}
			}

		}
	}

}
