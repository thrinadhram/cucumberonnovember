package PageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public WebDriver driver;
	
	public loginPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[.='Log in']")
	@CacheLookup
	WebElement txtbtn;
	
	@FindBy(xpath = "//*[.='Logout']")
	@CacheLookup
	WebElement txtlogout;
	
	
	public void setUserName(String uName)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uName);
	}
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickLogin()
	{
		txtbtn.click();
	}
	
	public void ClickLogOut()
	{
		txtlogout.click();
	}
	public void Screenshot() throws IOException 
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot\\scshot.jpg");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");
	}

}
