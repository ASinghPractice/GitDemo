import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.testandquiz.com/selenium/testing.html");
//		driver.findElement(By.xpath("//a[text()='This is a link']")).click();
//		driver.navigate().back();
//		driver.findElement(By.cssSelector("#fname")).sendKeys("Testing is going on");
//		driver.findElement(By.xpath("//button[text()='Submit' and @type='button']")).click();
//		driver.findElement(By.xpath("//input[@id='female' and @type='radio']")).click();
//		driver.findElement(By.xpath("//input[@value='Performance']")).click();
//		Select dropdown=new Select(driver.findElement(By.id("testingDropdown")) );
//		dropdown.selectByIndex(3);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int check=driver.findElements(By.cssSelector("[type='checkbox']")).size();
		System.out.println(check);
		WebElement tick=driver.findElement(By.cssSelector("#checkBoxOption1"));
		tick.click();
		Assert.assertTrue(tick.isSelected());
		System.out.println(tick.isSelected());
		tick.click();
		System.out.println(tick.isSelected());
		Assert.assertFalse(tick.isSelected());
		
	}

}
