package org.Basemag;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basemag {
public static WebDriver driver;
	
	public static void url(WebDriver driver, String m) {
		driver.get(m);
	}
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public static void toClick(WebElement e) {
		e.click();
	}
	public static void tosenduser(WebElement user,String n) {
		   user.sendKeys(n);
	   
	   }
   public static void tosendvalue(WebElement pw, String p) {
		pw.sendKeys(p);

	} 
	
   public static void tologin(WebElement login) {
		login.click();

	}
   public static void toscroll(WebElement g) {
	   WebElement scroll= driver.findElement((By) g);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView",scroll );

}
   
   
 /*  public static void toScroll(WebElement g) {
		WebElement scroll = driver.findElement((By) g);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView",scroll );
	} */
   
   
    
}
