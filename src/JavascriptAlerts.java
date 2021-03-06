import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	
	driver.findElement(By .xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
	
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept(); //Positive
	
	// driver.switchTo().alert().dismiss(); - Negative
	// driver.switchTo().alert().sendKeys("feedback"); - enter text on alert screen

	driver.close();
	}
}