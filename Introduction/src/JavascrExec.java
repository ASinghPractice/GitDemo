import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascrExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://ksrtc.in/oprs-web/");
				driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
				
				
				System.out.println(driver.findElement(By.id("fromPlaceName")).getText());//it will not work
				//Javascript DOM can extract hidden elements
				//because selenium cannot identify hidden elements (Ajax implementation)
				//investigate the properties of object if it have any hidden text
				JavascriptExecutor js=(JavascriptExecutor)driver;
				String value="return document.getElementById(\"fromPlaceName\").value;";
				String txt=(String) js.executeScript(value);
				System.out.println(txt);
				int i=0;   
			
				while(!txt.equalsIgnoreCase("BENGALURU AIRPORT"))
				{
					i++;
					driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
					txt=(String) js.executeScript(value);
					System.out.println(txt);
					if(i>10)
					{
						break;
					}
				}
				if(i>10)
				{
					System.out.println("Element not found");
				}

	}

}
