package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrm 
{
	WebDriver driver;
	@Given("user is Orange HRM")
	public void user_is_orange_hrm() 
	{
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@When("user Enter User name and password")
	public void user_enter_user_name_and_password()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement username = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))
	    );

	    username.sendKeys("Admin");

	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	    


	@Then("click Login button")
	public void click_login_button()
	{
		 driver.findElement(By.xpath("//button[contains(@class,'login-button')]")).click();
	}

	@Then("user is on the Orange HRM page")
	public void user_is_on_the_orange_hrm_page() 
	{
	    
		String actualUrl = driver.getCurrentUrl();
	    
	    if(actualUrl.contains("dashboard")) {
	        System.out.println("User is on OrangeHRM Dashboard");
	    } else {
	        System.out.println("User is NOT on Dashboard");
	    }
	
}
	@Then("select Recructment button")
	    public void select_recructment_button() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//h6[text()='Dashboard']")
		));
		
	    }

	    @Then("click on the Automation Tester")
	    public void click_on_the_automation_tester() 
	    {
	    	
	    }

	    @Then("select the logout button")
	    public void select_the_logout_button() 
	    {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    	WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    	        By.xpath("//a[text()='Logout']")
	    	));

	    	logout.click();
	    }



	}
	



	
	

