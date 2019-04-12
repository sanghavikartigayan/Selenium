import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment7_AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		WebElement text= driver.findElement(By .id("autocomplete"));
		text.sendKeys("Can");
		text.sendKeys(Keys.ARROW_DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('autocomplete').value;";
		String country = (String) js.executeScript(script);
		
		int i=0;
		while(!country.equalsIgnoreCase("Canada")){
			text.sendKeys(Keys.DOWN);
			country = (String) js.executeScript(script);
			System.out.println(text);
			i++;
			if(i>5) {
			break;
			}
		}
		if(i>5) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element Found");
		}
		}
	}
