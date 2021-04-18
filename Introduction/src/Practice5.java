import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt=driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getAttribute("value");
		System.out.println(opt);
		Select dropdown=new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue(opt);
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		if(driver.switchTo().alert().getText().contains(opt))
		{
			System.out.println("Pass");
			driver.switchTo().alert().dismiss();
		}
		else
		{
			System.out.println("Fail");
		}
	
	}

}
