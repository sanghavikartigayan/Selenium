import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_QAClickWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		//1.Select anyone CheckBox
		driver.findElement(By .xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		
		//2. Grab the label of the selected option.
		String text= driver.findElement(By .xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		//3.Selecting the DropDown option based on the CheckBox label selected.
		Select s= new Select(driver.findElement(By .id("dropdown-class-example")));
		s.selectByVisibleText(text);
		
		//4.Entering the value into the text box.
		driver.findElement(By .id("name")).sendKeys(text);
		Thread.sleep(2000);
		
		//5.Click on Alert
		driver.findElement(By .id("alertbtn")).click();
		Thread.sleep(2000);
		if(driver.switchTo().alert().getText().contains(text))
			System.out.println("Success");
			driver.switchTo().alert().accept();
		}
	}

