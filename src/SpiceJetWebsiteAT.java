import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//This class performs an Automation Test on the Spice Jet WebSite - A site which enables the user to book for their trip.
public class SpiceJetWebsiteAT {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		//In order to perform the Automation test, first we need to choose the Selenium WebDriver. Here I have chosen Google Chrome as I'm going to conduct my test on Google Chrome Browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		
		//Then create an object for the WebDriver in-order to access it anywhere on the program.
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//Conducting Security check- landing on correct URL
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
		// Selecting One way in Radio Buttons
		driver.findElement(By .id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//1.a Handling dynamic DropDown boxes using indexes.
		driver.findElement(By .id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By .xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By .xpath("(//a[@value='MAA'])[2]")).click();
		
		
		//1.b Handling dynamic DropDown box using Parent-child relationship
		// driver.findElement(By .xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTXT\'] //a[@value='MAA']")).click();
		
		
		//2. Calendar form handling - selecting current date for one way trip
		driver.findElement(By .cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		//Checking whether the Return date calendar is disabled for One Way trip.
		if(driver.findElement(By .id("Div1")).getAttribute("Style").contains("0.5"));
		{
			Assert.assertTrue(true);
		}
		
		//Selecting Passenger category from CheckBox
		driver.findElement(By .cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By .cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		//2. Handling Static DropDown boxes in two ways- using select and also by regular clicks.
		driver.findElement(By .id("divpaxinfo")).click();
		
		for(int i=1;i<4;i++) {
			driver.findElement(By .id("hrefIncAdt")).click();
		}
		driver.findElement(By .id("btnclosepaxoption")).click();
		
		Select s= new Select(driver.findElement(By .id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		driver.findElement(By .cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();
		
		driver.close();
	}

}
