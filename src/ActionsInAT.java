import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInAT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.ca");
		driver.manage().window().maximize();
		
		//MouseOver is an user action- Initialize an action, then build and perform that action to make it automated.
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By .id("nav-link-yourAccount"))).build().perform();
		Thread.sleep(1000);
		
		//Building Composite Actions - Typing hello in Capital format in Search box and then selecting the text.
		a.moveToElement(driver.findElement(By .id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(1000);
		
		//Hover over your store and then right click
		a.moveToElement(driver.findElement(By .id("nav-your-amazon"))).contextClick().build().perform();
	
	}
}
