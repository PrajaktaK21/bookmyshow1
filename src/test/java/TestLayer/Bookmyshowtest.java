package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class Bookmyshowtest extends BaseClass{
	
	@BeforeTest
	public void setup()
	{
		BaseClass.launch();
	}
	
	@Test(priority=1)
	public void getstarted() throws InterruptedException
	{
		WebElement city = driver.findElement(By.xpath("//div[@class='bwc__sc-ttnkwg-17 gvzyfS']/child::img[@alt='PUNE']"));
		UtilsClass.click(city);
		Thread.sleep(5000);
		
		WebElement movies= driver.findElement(By.xpath("//div[@class='bwc__sc-1shzs91-1 ehingX']/child::a[text()='Movies']"));
		UtilsClass.click(movies);
		Thread.sleep(5000);
		
		WebElement hindi = driver.findElement(By.xpath("//div[@class='sc-133848s-2 sc-ije77g-1 iwhGDq']/descendant::div[text()='Hindi']"));
		UtilsClass.click(hindi);
		Thread.sleep(5000);
		
		WebElement selmovie= driver.findElement(By.xpath("//div[text()='Mr. & Mrs. Mahi']"));
		UtilsClass.click(selmovie);
		
		WebElement booktickets= driver.findElement(By.xpath("//div[@class='sc-qswwm9-8 goilWl']/descendant::span[text()='Book tickets']"));
		UtilsClass.click(booktickets);
		
		
	}

}
