import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// broken URL
		// 1st get all the urls tied up to the links using selenium
		// there are java methods to call the URL and gets its status code
		// if status code is >than400 then url is not working
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li.gf-li a"));
		SoftAssert a=new SoftAssert();
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			// there is predefined URL class in java with openconnection method
			// HttpURLConnection is return type
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responsecode = con.getResponseCode();
			System.out.println(responsecode);
			a.assertTrue(responsecode>400, "Broken Link"+link.getText());//soft assertion
//			if(responsecode>400)
//			{
//				System.out.println("Broken Link"+link.getText());
//				Assert.assertTrue(false);
//			}
//

		}

		a.assertAll();
	}

}
