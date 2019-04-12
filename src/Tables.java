import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22460/rajasthan-vs-chennai-25th-match-indian-premier-league-2019");
		driver.manage().window().maximize();
		
		WebElement table= driver.findElement(By .cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount= table.findElements(By .cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count = table.findElements(By .cssSelector("cb-col cb-col-100 cb-scrd-itms div:nth-child(3)")).size();
	}

}
