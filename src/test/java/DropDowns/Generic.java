package DropDowns;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic {

	public static void main(String[]args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		WebElement country=driver.findElement(By.id("country"));
		collection(country, "India");
		WebElement city= driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']"));
		collection(city, "Chennai");
		
		
		
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
