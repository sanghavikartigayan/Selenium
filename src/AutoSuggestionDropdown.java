import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Enter the letters BENG
//Verify if Airport option is displayed in the suggestive box
//Perform Auto Suggestion DropBox as well as JavaScript Executor.
public class AutoSuggestionDropdown {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println("~~~~ Leaving From ~~~~~~");
		//Handling Auto Suggestion DropDown buttons.
		WebElement source= driver.findElement(By .id("fromPlaceName"));
		source.sendKeys("ben");
		Thread.sleep(2000);
		source.sendKeys(Keys.DOWN);
		
		// below command wont be printed onto the console- has SElenium cannot identify hidden text. (Ajax iplementation)
		// System.out.println(source.getText());
		// JavaScript DOM can extract hidden elements
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String sourcescript = "return document.getElementById(\'fromPlaceName\').value;";
		String text= (String) js.executeScript(sourcescript);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU AIRPORT")) {
			i++;
			source.sendKeys(Keys.DOWN);
			System.out.println(text);
			if(i>10) {
				break;
			}
		}
			if(i>10) {
				System.out.println("Element not found");
			}
			else {
				System.out.println("Element found");
		}
		
		//source.sendKeys(Keys.ENTER);
		
		System.out.println("~~~~ Going To ~~~~~");
		//Handling Auto Suggestion DropDown buttons.
		WebElement destination= driver.findElement(By .id("toPlaceName"));
		destination.clear();
		destination.sendKeys("chen");
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		// below command wont be printed onto the console- has SElenium cannot identify hidden text. (Ajax iplementation)
		//System.out.println(destination.getText());
		//JavaScript DOM can extract hidden elements
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		String destinationscript =" return document.getElementById(\'toPlaceName\').value;";
		String text1= (String) js1.executeScript(destinationscript);
		System.out.println(text1);
	}
}
