import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\geckodriver.exe");
		WebDriver firefoxDriver= new FirefoxDriver();
		firefoxDriver.get("https://www.google.com");
		System.out.println(firefoxDriver.getTitle());
	}

}
