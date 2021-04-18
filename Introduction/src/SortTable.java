import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> list1=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList=new ArrayList<String>();
		for(int i=0;i<list1.size();i++)
		{
			originalList.add(list1.get(i).getText());
		}
		
		ArrayList<String> copyorgList=new ArrayList<String>();
		for(int i=0;i<originalList.size();i++)
		{
			copyorgList.add(originalList.get(i));
		}
		Collections.sort(copyorgList);
		for(String s:copyorgList)
		{
			System.out.println(s);
		}
		Assert.assertTrue(originalList.equals(copyorgList));
		if(originalList.equals(copyorgList))
		{
			System.out.println("Pass: List is in ascending order");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	
}
