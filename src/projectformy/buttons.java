package projectformy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")); 
		Dropdown.click();
		
		WebElement Dropdownlink1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]"));
		
		Dropdownlink1.click();

	}

}
