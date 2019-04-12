import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Security check- landing on correct URL
		System.out.println(driver.getCurrentUrl());
		
		//navigate to another page.
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		
		//1.a Handling dynamic DropDown boxes using indexes.
		driver.findElement(By .id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By .xpath("//a[@value='BLR']")).click();
	
		driver.findElement(By .xpath("(//a[@value='MAA'])[2]")).click();
		
		
		//1.b Handling dynamic DropDown box using Parent-child relationship
		// driver.findElement(By .xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTXT\'] //a[@value='MAA']")).click();
		
		
		//2. Calendar form handling - selecting current date for one way trip
		driver.findElement(By .cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//2. Handling Static DropDown boxes in two ways- using select and also by regular clicks.
		driver.findElement(By .xpath("//div[@id='divpaxinfo']")).click();
		
		for(int i=1;i<3;i++) {
			driver.findElement(By .id("hrefIncAdt")).click();
		}
		driver.findElement(By .id("btnclosepaxoption")).click();
		
		Select s= new Select(driver.findElement(By .id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		driver.close();
	}

}
