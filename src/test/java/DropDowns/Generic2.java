package DropDowns;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic2 {

	public static void main(String[]args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		
		WebElement country=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		collection(country, "Google");
		WebElement city= driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		collection(city, "Baby Cat");
		WebElement multiple=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		collection(multiple, "Pizza");
		collection(multiple, "Burger");
		collection(multiple, "Bonda");

		
		
		
	}
	
	public static void collection(WebElement ele,String value) {
		
		Select ss=new Select(ele);
		
		List<WebElement> alloptions=ss.getOptions();
		
		for(WebElement option :alloptions) {
			if(option.getText().equals(value)) {
				
				option.click();
				break;
			}
		}
		//ss.selectByIndex(value);
		
	}
}
