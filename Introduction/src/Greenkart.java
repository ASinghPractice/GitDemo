
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //ImplicitWait
		WebDriverWait wait=new WebDriverWait(driver,5);//explicitwait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] veggies= {"Beetroot","Onion","Beans"}; //define array
		addItems(driver,veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit Wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}

	public static void addItems(WebDriver driver,String[] veggies)
	{
      List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		int arraySize=veggies.length; //find length of array
		int j=0;
		for (int i = 0; i < products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formatName=name[0].trim();
			//covert array into arrayList during runtime to safe memory
			//check whether name you extracted is present in the arrayList
			List itemsNeededList= Arrays.asList(veggies);
			if (itemsNeededList.contains(formatName)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==arraySize)
				{
					break;
				}
				
			}

		}
	}

}
