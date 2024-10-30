package projectformy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		
		//WebElement Datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		//Datepicker.click();
		
		//WebElement Monthyear = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/input"));
		//Monthyear.click();
		
		//WebElement Month = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/input"));
		//Month.click();
		
		//WebElement Year = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/input"));
		//Year.click();
		
		//WebElement Day = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/input"));
		//Day.click();
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.click();

        
        datePicker.sendKeys("10/15/2024");
		

	}

}
