import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Spicejet {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	//	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(9500);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='TRV']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//System.out.println("Calendar is Enabled:"+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Disabled");
			Assert.assertFalse(false);
		}
		
//		driver.findElement(By.id("divpaxinfo")).click();
//		   Thread.sleep(4000);
//		int i=1;
//		while(i<5)
//		{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		i++;
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Thread.sleep(2000);

		WebElement senior=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		System.out.println(senior.isSelected());
		Assert.assertFalse(senior.isSelected());
		senior.click();
		System.out.println(senior.isSelected());
		Assert.assertTrue(senior.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		

	}

}
