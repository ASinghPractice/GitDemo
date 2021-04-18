import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("product"));
		int rows=table.findElements(By.tagName("tr")).size();
		int columns=table.findElements(By.xpath("//tbody/tr/th")).size();
		System.out.println("Number of Rows:"+" "+rows);
		System.out.println("Number of Columns:"+" "+columns);
		List <WebElement> secRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for(int i=0;i<secRow.size();i++)
		{
			System.out.println(secRow.get(i).getText());
		}

	}

}
