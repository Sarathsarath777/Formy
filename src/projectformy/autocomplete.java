package projectformy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		address.sendKeys("sarath");
		
		WebElement streetaddress = driver.findElement(By.xpath("//*[@id=\"street_number\"]"));
		streetaddress.sendKeys("mnrnagar");
		
		WebElement streetaddress2 = driver.findElement(By.xpath("//*[@id=\"route\"]"));
		streetaddress2.sendKeys("edappally");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"locality\"]"));
		city.sendKeys("kochi");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"administrative_area_level_1\"]"));
		state.sendKeys("kerala");
		
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"postal_code\"]"));
		zipcode.sendKeys("682024");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		country.sendKeys("india");

	}

}
