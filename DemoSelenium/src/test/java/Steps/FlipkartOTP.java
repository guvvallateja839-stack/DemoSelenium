package Steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartOTP 
{
 WebDriver driver;
 @Given("user is Flipkart page")
 public void user_is_flipkart_page() 
 {
	 driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
 }

 @Given("click on login button")
 public void click_on_login_button()
 {
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// Wait for login button directly instead of overlay
	WebElement login = wait.until(
	    ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[contains(text(),'Login')]")
	    )
	);
 }
 @When("user Enter Email\\/Mobile number")
 public void user_enter_email_mobile_number() 
 {
	//*[text()='Enter Email/Mobile number']
    driver.findElement(By.xpath("//*[text()='Enter Email/Mobile number']")).sendKeys("9845134271");
 }


   	@Then("click on the Request OTP")
	public void click_on_the_request_otp() 
   	{
	    driver.findElement(By.xpath("//*[text()=\"Request OTP\"]")).click();
	}

	@When("user enters valid OTP")
	public void user_enters_valid_otp() 
	{
	    WebElement otp=driver.findElement(By.xpath("//input[@maxlength='1']"));
	    String code="1234";
	  	     
	}

	@Then("OTP should be verified successfully")
	public void otp_should_be_verified_successfully() 
	{
	  driver.findElement(By.xpath("//*[text()=\"Verify\"]")).click();
	}
	


}
