package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import PageObject.loginPage;
import io.cucumber.java.en.*;

public class Steps {
	
	public WebDriver driver;
	public loginPage lp;
	
		
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(co);
		lp=new loginPage(driver);
	    
	}

	@When("User Opens url {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("User Enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException, IOException {
	    lp.ClickLogin();
	    Thread.sleep(3000);
	    String Acval ="https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
	    String Exval = driver.getCurrentUrl();
	    if(Exval.equalsIgnoreCase(Acval)) {
	    	lp.Screenshot();
	    	
	    }
	    else {
	    	System.out.println("Sucessful login");
	    }
	}


	@When("User click on LogOut link")
	public void user_click_on_log_out_link() throws InterruptedException {
	    lp.ClickLogOut();
	    Thread.sleep(2000);
	}

	@When("close browser")
	public void close_browser() {
	    driver.close();
	    }
	

}
