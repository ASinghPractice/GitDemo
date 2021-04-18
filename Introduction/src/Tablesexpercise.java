 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesexpercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aman\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23255/eng-vs-ire-2nd-odi-ireland-tour-of-england-2020");//URL may change in future
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int intValue=Integer.parseInt(value);//to convert string to integer
			sum=sum+intValue;		
			
		}
		String extra=driver.findElement(By.xpath("//div[text()='Extras']//following-sibling::div[1]")).getText();
		System.out.println("Extras:"+" "+extra);
		int intExtra=Integer.parseInt(extra);
		int totalScore=sum+intExtra;
		System.out.println("Total Score:"+" "+ totalScore);
		String total=driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div[1]")).getText();
		int totalValue=Integer.parseInt(total);
		if(totalScore==totalValue)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
