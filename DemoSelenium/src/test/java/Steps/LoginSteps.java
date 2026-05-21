package Steps;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
	WebDriver driver;
	
	@Given("user is on Mercury Tours login page")
	public void user_is_on_mercury_tours_login_page()
	{
		driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
		driver.findElement(By.name("userName")).sendKeys("guvvallateja@gmail.com");   // ✅ correct
	    driver.findElement(By.name("password")).sendKeys("teja@1234"); 
	    
	}

	@Then("user should click login button")
	public void user_should_click_login_button() 
	{
  driver.findElement(By.xpath("//*[@name='submit']")).click(); 
	}

	@Then("user should click on the Flights")
	public void user_should_click_on_the_flights() 
	{
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
	    
	}
	
	@Then("click on the flight details")
	public void click_on_the_flight_details() 
	{
	   
	}

	@Then("user is on  Flight Finder page")
	public void user_is_on_flight_finder_page() {
	   
	}

	@Then("click on the type Round trip Radio button")
	public void click_on_the_type_round_trip_radio_button()
	{
	    
	}

	@Then("select the all dropdown\\(Passengers,Departing From,On,Arriving In,Returning)")
	public void select_the_all_dropdown_passengers_departing_from_on_arriving_in_returning() 
	{
		WebElement passengers =driver.findElement(By.xpath("//*[@name='passCount']"));
		Select select1 = new Select(passengers);
		select1.selectByIndex(2);
		
		WebElement DepartingFrom =driver.findElement(By.xpath("//*[@name='fromPort']"));
		Select select2 = new Select(DepartingFrom);
		select2.selectByIndex(3);
		
		WebElement fromDay  =driver.findElement(By.xpath("//*[@name='fromDay']"));
		Select select3 = new Select(fromDay);
		select3.selectByIndex(4);
		
		WebElement ArrivingIn  =driver.findElement(By.xpath("//*[@name='toPort']"));
		Select select4 = new Select(ArrivingIn);
		select4.selectByIndex(4);
						
		WebElement Returning =driver.findElement(By.xpath("//*[@name='toMonth']"));
		Select select5 = new Select(ArrivingIn);
		select5.selectByIndex(4);
	}

	@Then("Need to select Preferences radio button of Service Class \\(Economy class)")
	public void need_to_select_preferences_radio_button_of_service_class_economy_class() 
	{
		WebElement  Airline=driver.findElement(By.xpath("//*[@name='airline']"));
		Select select6 = new Select(Airline);
		select6.selectByIndex(3);
	}

	@Then("click the Airline")
	public void click_the_airline() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Select Business class
		WebElement business = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//input[@name='servClass' and @value='Business']")
		    )
		);

		business.click();
	}

	@Then("select the continue button")
	public void select_the_continue_button() 
	{
		driver.findElement(By.xpath("//*[@name='findFlights']")).click();


driver.close();

	}
}
