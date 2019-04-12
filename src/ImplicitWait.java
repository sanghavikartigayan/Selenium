import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Implicit wait - declaring global wait time to allow the page to load and fetch information- before it throws an exception.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.hotwire.com/hotels/");
		driver.findElement(By .xpath("//input[@name='farefinder-hotel-destination']")).sendKeys("nyc");
		driver.findElement(By .xpath("//input[@name='farefinder-hotel-destination']")).sendKeys(Keys.ENTER);
		
		//The below statement will be executed only after 3 or 5 seconds, so implicit wait is used here. - Avoids exception and the script continues.
		driver.findElement(By .cssSelector(".opaque-hotel-card__photo.results-room-photos.hw-caption-1.results-room-photo__star-3-5_1.rooms-photos-module")).click();
	}
}
	