import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_boxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanghavi Kartigayan\\Desktop\\Selenium\\Selenium\\src\\resources\\chromedriver.exe");
		
		//Then create an object for the WebDriver in-order to access it anywhere on the program.
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Selecting Depart on
		driver.findElement(By .id("DepartDate")).click();
		
		//Choosing current date
		driver.findElement(By .cssSelector(".ui-state-default.ui-state-highlight ")).click();
		
		
		//Choosing no of people Traveling based on different categories
		Select s= new Select(driver.findElement(By .id("Adults")));
		s.selectByVisibleText("3");
		Select s1 = new Select(driver.findElement(By .id("Childrens")));
		s1.selectByValue("2");
		
	
		//Clicking on More Options link
		driver.findElement(By .id("MoreOptionsLink")).click();
		
		
		//Entering Airline name inside the TextBoxes
		driver.findElement(By .id("AirlineAutocomplete")).sendKeys("indigo");
		
		
		//Clicking on Search button
		driver.findElement(By .id("SearchBtn")).click();
		
		//Printing Error message on console
		System.out.println(driver.findElement(By .id("homeErrorMessage")).getText());
		
		driver.close();
	
	}

}
