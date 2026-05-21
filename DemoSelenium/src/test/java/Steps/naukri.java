package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class naukri 
{
	 WebDriver driver;
	 
	 
	@Given("user is Naukri log in page")
	public void user_is_naukri_log_in_page() 
	{
		driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	    
	}
	

	@Then("user should see {string}")
	public void user_should_see(String string)
	{
	    driver.findElement(By.id("//*[@id='login_Layer']")).click();
	}




}
