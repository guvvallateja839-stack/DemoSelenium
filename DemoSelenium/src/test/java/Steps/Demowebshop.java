package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demowebshop 
{
	WebDriver driver ;

	@Given("user is on registration page")
	public void user_is_on_registration_page() 
	{
		driver = new FirefoxDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	}
	@When("click Register  button")
	public void click_register_button() 
	{
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@When("user selects gender as {string}")
	public void user_selects_gender_as(String string) throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.id("gender-male")).click();  
	}

	@When("user enters first name {string}")
	public void user_enters_first_name(String string)
	{
		
		driver.findElement(By.id("FirstName")).sendKeys("guvvalla");
	}

	@When("user enters last name {string}")
	public void user_enters_last_name(String string)
	{
		driver.findElement(By.id("LastName")).sendKeys("teja");
	}

	@When("user enters email {string}")
	public void user_enters_email(String string) 
	{
		driver.findElement(By.id("Email")).sendKeys("thejakumar8123@gmail.com");
	
	}

	
	@When("user enters password {string}")
	public void user_enters_password(String string) 
	{
		driver.findElement(By.id("Password")).sendKeys("teja@1234");
		
	}

	@When("confirm password {string}")
	public void confirm_password(String string) 
	{
		driver.findElement(By.id("ConfirmPassword")).sendKeys("teja@1234");
		
	}

	@When("user clicks on Register buutton")
	public void user_clicks_on_register_buutton() 
	{
		driver.findElement(By.id("register-button")).click();
	}

	@Then("user should be registered successfully")
	public void user_should_be_registered_successfully() 
	{
	    

	
}
}
