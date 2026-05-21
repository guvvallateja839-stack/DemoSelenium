package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args)
	
	{


		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

		        // Switch to iframe using XPath
		        driver.switchTo().frame(
		            driver.findElement(By.xpath("//iframe[@id='iframeResult']"))
		        );

		        // Action inside iframe
		        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();

		        // Back to main page
		        driver.switchTo().defaultContent();

		        driver.quit();
		   
	}

}
