import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("text");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("text");
		driver.findElement(By.cssSelector("input[title*='Sign']")).click();
		System.out.println(driver.findElement(By.xpath("//div/div/b")).getText());

	}

}
