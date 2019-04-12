import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By .linkText("Multiple Windows")).click();
		driver.findElement(By .linkText("Click Here")).click();
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> i = winids.iterator();
		String parentId = i.next();
		String childId = i.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By .xpath("//div/h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By .xpath("//div[@class='example']/h3")).getText());
	}

}
