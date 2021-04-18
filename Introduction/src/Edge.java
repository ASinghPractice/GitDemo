import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		WebDriver Driver=new EdgeDriver();
		Driver.get("https:\\www.facebook.com");
		System.out.println(Driver.getTitle());
		
		

	}

}
