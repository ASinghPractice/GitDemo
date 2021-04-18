import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Oct"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();	
		}
		List<WebElement> date = driver.findElements(By.cssSelector("[class*='day']"));
		int size = driver.findElements(By.cssSelector("[class*='day']")).size();
		for (int i = 0; i <= size; i++) {
			String txt = driver.findElements(By.cssSelector("[class*='day']")).get(i).getText();
			if (txt.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector("[class*='day']")).get(i).click();
				break;
			}
		}

	}

}
