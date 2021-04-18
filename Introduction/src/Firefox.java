import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Driver object for Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();  //Returns true if there are more number of elements.
		String parentId=itr.next();
		String childId=itr.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
