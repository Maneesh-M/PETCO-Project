package Search;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel_utility.excel_read;
import launch.browser_lanuch;


public class Search extends  browser_lanuch {

	

	@BeforeMethod
	public void driverlaunch() throws Exception
	{
		
		driversetup();
	
	
	}	@Test
		public void loc_search() throws Exception
		{
			
			WebElement pet =driver.findElement(By.xpath("//*[@id=\'shop-by-pet\']/a"));
			
			Actions act = new Actions (driver);
			
			Thread.sleep(2000);
			
			act.moveToElement(pet).click().build().perform();
			
			Thread.sleep(2000);
	
			WebElement fish = driver.findElement(By.xpath("//*[@id=\"shop-by-pet-fish\"]/a"));
			 act.moveToElement(fish).build().perform();
			 
			 Thread.sleep(2000);
			WebElement ShopBy = driver.findElement(By.xpath("//*[@id=\'shop-by-pet\'/div/div/div[3]/div/div[1]/ul[1]/li[1]/a"));
			
			Thread.sleep(2000);
			
			act.moveToElement(ShopBy).click().build().perform();
			 
			 
			 Select sort = new Select(driver.findElement(By.xpath("//*[@id=\'product-listing-sort-by_4_3074457345618259661_4099276460824412685\']")));
			 
			 sort.selectByVisibleText("Name A-Z");
			 
			 String item = driver.findElement(By.xpath("//*[@id=\'product_tile_val_1467501\']/span")).getText();
			 
			 System.out.print("item name:"+item);
			 
			 driver.findElement(By.xpath("//*[@id=\'facetDiv12095115111114116951121141059910195801011169911183116111114101958583685840123505332534812532534841\']/label/i")).click();
			 
			 
			 String  itemName = driver.findElement(By.xpath("//*[@id=\'product_tile_val_98016\']/span/span")).getText();
			 
			 excel_read.putvalue(itemName);
			 
			 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			 FileUtils.copyFile(f, new File("C:\\Users\\845123\\eclipse-workspace\\PETCO(845123)Nithinkumar\\Screenshot\\Petco_item.png"));
			 
		} 
			 @AfterMethod
			 public void close()
			 {
				 driver.quit();
			 }
			 
			 	 
			
	 }
	


