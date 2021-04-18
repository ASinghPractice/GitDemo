import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		Set<String> wind=driver.getWindowHandles();
		Iterator <String> itr=wind.iterator();
		String parentId= itr.next();
		String childId=itr.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		

	}

}
