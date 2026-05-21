package Basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercuryTours {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		/*Register*/
		
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("teja");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("guvvalla");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9845134271");
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("guvvallateja@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("tapovanam");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("ananatapur");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("ananatapur");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Andrapradesh");
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("515001");  
		WebElement dropdown =driver.findElement(By.xpath("//*[@name='country']"));
		Select select = new Select(dropdown);
        select.selectByIndex(2);
       /* User Information*/
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("guvvallateja@gmail.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("teja@1234");
        driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("teja@1234");
        driver.findElement(By.xpath("//*[@name='submit']")).click();
	    /*Sign in*/
        driver.findElement(By.xpath("//*[text()=' sign-in ']")).click();
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("guvvallateja@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("teja@1234");
		driver.findElement(By.xpath("//*[@name='submit']")).click(); 
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
		driver.findElement(By.xpath("//input[@name='tripType' and @value='roundtrip']")).click();
		
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
		/*Preferences*/
		
		
		WebElement  Airline=driver.findElement(By.xpath("//*[@name='airline']"));
		Select select6 = new Select(Airline);
		select6.selectByIndex(3);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Select Business class
		WebElement business = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//input[@name='servClass' and @value='Business']")
		    )
		);

		business.click();
		
		driver.findElement(By.xpath("//*[@name='findFlights']")).click();
		driver.close();
		
		/*JavascriptExecutor*/
		/*click on the button*/
		WebElement btn = driver.findElement(By.id("login"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("args[0].click();",btn);
		/*Text box*/
		WebElement input = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='test@gmail.com';", input);
		/*scroll button*/
		js.executeScript("window.scrollBy(0,500);");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		// Save file
		File dest = new File("C:\\Users\\tejag\\Desktop\\screenshot.png");
		FileUtils.copyFile(src, dest);
		
	}

}
