import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortUsingJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// Click on Column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all webElements in a List
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of all WebElements into new (original) list
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// sort on the original list-> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// compare original list and sorted list
		Assert.assertTrue(originalList.equals(sortedList));

		// scan the name column with getText--> Rice--> print the price of the vegetable
		// (Rice)
		List<String> price;
		do {List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
