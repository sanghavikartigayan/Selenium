import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {
	public static void main(String[] args){
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.spicejet.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	
	System.out.println(driver.findElements(By .cssSelector("input[type='checkbox']")).size());
	driver.findElement(By .cssSelector("input[id*='friendsandfamily']")).click();
	Assert.assertTrue(driver.findElement(By .cssSelector("input[id*='friendsandfamily']")).isSelected());
	driver.close();
	}
}
