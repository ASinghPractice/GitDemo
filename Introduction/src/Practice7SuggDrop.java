import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7SuggDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement sdrop=driver.findElement(By.cssSelector("#autocomplete"));
		sdrop.sendKeys("UNIT");
		Thread.sleep(3000);
		sdrop.sendKeys(Keys.DOWN);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		String txt="return document.getElementById(\"autocomplete\").value;";
		String run=(String) je.executeScript(txt);
		int i=0;
		while(!run.equalsIgnoreCase("United States (USA)"))
		{
			i++;
			sdrop.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			run=(String) je.executeScript(txt);
			System.out.println(run);
			if(i>10)
			{
				
				break;
			}
					
			
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}

	}

}
