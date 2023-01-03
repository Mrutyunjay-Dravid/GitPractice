package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fineelement {
	
	static WebDriver driver = new ChromeDriver();
	
	public static void waits(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();
	}
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver = fineelement.driver;
	driver.get("https://www.policybazaar.com/");
	
	driver.manage().window().maximize();
	
	waits("//input[@id = 'submitButton']");

	driver.findElement(By.xpath("//input[@id = 'submitButton']")).click();
	
//	waits("//select[@id = 'Self']");
//	WebElement AgeDropdown = driver.findElement(By.xpath("//select[@id = 'Self']"));
//	Select s = new Select(AgeDropdown);
//	s.selectByIndex(12);
//	
//	waits("//input[@id = 'submitButton']");
//	driver.findElement(By.xpath("//input[@id = 'submitButton']")).click();
//	
//	driver.findElement(By.xpath("//span[text() = 'Pune']")).click();
//	
//	driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Mrutyunjay Dravid");
//	
//	driver.findElement(By.xpath("//input[@name = 'number']")).sendKeys("9168249239");
//
//	driver.findElement(By.xpath("//span[text() = 'Continue']")).click();


	
		
}
}
