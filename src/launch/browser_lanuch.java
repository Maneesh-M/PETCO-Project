package launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class browser_lanuch {
	
	protected WebDriver driver;

	public void driversetup() 
	{
		// driver lanuch
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\845123\\eclipse-workspace\\PETCO(845123)Nithinkumar\\src\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		driver.get("https://www.petco.com/");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	

	}

}
