package projectformy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://formy-project.herokuapp.com/checkbox");
	driver.manage().window().maximize();
	
	WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]"));
	Checkbox.click();
	
		

	}

}
