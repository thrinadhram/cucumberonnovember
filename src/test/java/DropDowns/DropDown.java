package DropDowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();	
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfPQzC67XJxy9eoOzVKf8SBXBCVM3Qp83DeWMSyB5jgyICq0Q/viewform");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("badriprabha007@gmail.com");
		
		driver.findElement(By.xpath("(//span[text()='Choose'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='LOG IN'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Choose'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='MORNING'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Choose'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Abhiram Pera'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Choose'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='MT-0970'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Choose'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='TESTING'])[2]")).click();
		Thread.sleep(2000);
		
		
	}
}
