package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
      /*  driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click(); */
        
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href,'leave')]")
        )).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Type for hints...']")))
            .sendKeys("Admin");
      /*  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait1.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[text()='Assign Leave']")))
            .click();       
            
            
            */
        driver.findElement(By.xpath("//*[text()=\"Assign Leave\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Leave List\"]")).click();
        driver.findElement(By.xpath("//p[text()='Apply Leave']")).click();
        driver.findElement(By.xpath("//p[text()='My Leave']")).click();
        driver.findElement(By.xpath("//p[text()='My Timesheet']")).click();
        driver.findElement(By.xpath("//*[text()=\"Logout\"]")).click();
        driver.close();
        
    }}