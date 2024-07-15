package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	
	public static void click(WebElement wb)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.click();
		}
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		if((wb.isDisplayed()) && (wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	
	
	public static void screenshot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat  date = new SimpleDateFormat("ddMMyyyy--HHmmss");
		String ndate = date.format(new Date());
		File dest = new File (System.getProperty("user.dir")+"//Screenshots//" +ndate+ ".png");
		FileUtils.copyFile(src, dest);	
	}

}
