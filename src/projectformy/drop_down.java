package projectformy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")); 
		Dropdown.click();
		
		WebElement pagescroll = driver.findElement(By.xpath("/html/body/div/div/div/a[12]"));
		
		pagescroll.click();
		
		

	}

}
