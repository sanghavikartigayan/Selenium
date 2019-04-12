import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hotwire.com/hotels/");
		driver.findElement(By .xpath("//input[@name='farefinder-hotel-destination']")).sendKeys("nyc");
		driver.findElement(By .xpath("//input[@name='farefinder-hotel-destination']")).sendKeys(Keys.ENTER);
		
		//The below statement will be executed only after 3 or 5 seconds, so explicit wait can be used here. - Avoids exception and the script continues.
		//Explicit Wait - it is applied to a specific condition and it waits only for that situation at that time.
		
		WebDriverWait d = new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By .cssSelector(".opaque-hotel-card__photo.results-room-photos.hw-caption-1.results-room-photo__star-3-5_1.rooms-photos-module")));
		driver.findElement(By .cssSelector(".opaque-hotel-card__photo.results-room-photos.hw-caption-1.results-room-photo__star-3-5_1.rooms-photos-module")).click();
	}

}
