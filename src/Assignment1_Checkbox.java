
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		driver.findElement(By .cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By .cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		driver.findElement(By .cssSelector("input[id='checkBoxOption1']")).click();;
		Assert.assertFalse(driver.findElement(By .cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By .cssSelector("input[type='checkbox']")).size());
		driver.close();
	}

}