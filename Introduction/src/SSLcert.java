import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SSL Certificates
		
		//Desired Chrome Capabilities
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
//		ch.acceptInsecureCerts(); //can also accept in following ways
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //to accept ssl certifications
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); //to accept inscure certifications
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		
		

	}

}
