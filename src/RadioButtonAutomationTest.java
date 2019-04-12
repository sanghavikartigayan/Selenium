import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomationTest {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}
}
