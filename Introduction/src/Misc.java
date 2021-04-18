import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies(); // to delete all cookies
//		driver.manage().deleteCookieNamed("sessionKey");//to delete specific cookie (here we are deleting session cookie)
		driver.get("https://www.google.com/");
		//to take Screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Amandeep\\Screenshot\\screnshot.png"));

		

	}

}
