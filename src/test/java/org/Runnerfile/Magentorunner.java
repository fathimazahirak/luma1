package org.Runnerfile;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Magfeature\\Magentofile.feature",glue="org.Stepdefn", publish=true , monochrome=true)
public class Magentorunner {
	public static WebDriver driver ;
	
	 @BeforeClass
     public static void Run() {
		driver = new ChromeDriver();
}
}