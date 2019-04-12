import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class im_not_a_robot_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spotify.com/ca-en/signup/");
		//driver.manage().window().maximize();
		
		int number = findFramenumber(driver, By .xpath("//*[@id=\'recaptcha-anchor\']/div[5]") );
		driver.switchTo().frame(number);
		driver.findElement(By .xpath("//*[@id=\'recaptcha-anchor\']/div[5]")).click();
		driver.switchTo().defaultContent();
		System.out.println("~~~~~~~~~~~~~~~");
		int number1 = findFramenumber(driver, By .xpath("//*[@id='recaptcha-verify-button']") );
		driver.switchTo().frame(number1);
		driver.findElement(By .xpath("//*[@id='recaptcha-verify-button']")).click();
	
	}
	
	public static int findFramenumber(WebDriver driver, By by) {
		int i;
		int frameCount = driver.findElements(By .tagName("iframe")).size();
		for(i=0; i< frameCount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if(count>0) {
				break;
			}
			else {
				System.out.println("Continue Looping");
			}
			driver.switchTo().defaultContent();
		}
		driver.switchTo().defaultContent();
		return i;
	}
}
