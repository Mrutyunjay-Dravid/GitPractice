package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm;
public class BroweserLaunch {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\Executables\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.
		WebDriver driver = new ChromeDriver();
		driver.get("http:/way2automation.com");
		
	
	}
}
