package com.project.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass extends DriverLib
{

	private WebDriver initChrome() 
	{
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
		
	}
	
	private WebDriver initHeadlessChrome() 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-gpu","--headless");
		
		return new ChromeDriver(options);
		
	}
	
	private WebDriver initFirefox() 
	{
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
		
	}
	
	private WebDriver initInternetExplorer() 
	{
		WebDriverManager.iedriver().setup();
		return new InternetExplorerDriver();
		
	}
	
	public void launchBrowser(String browser)
	{
		switch(browser)
		{
		 case "Chrome":
			 driver =initChrome();
			 break;
		 case "Firefox":
			 driver =initFirefox();
			 break;
		 case "Headless":
			 driver =initHeadlessChrome();
			 break;
			 
		 case "ie":
		 case "internet Explorer":
		 case "Internet Explorer":
		 case "internetexplorer":
		 case "IE":
			 driver= initInternetExplorer();
			 break;
			 
			 default:
				 driver=initHeadlessChrome();
		}
		
		driver.manage().window().maximize();
		
	
	}
	
	public void closeBrowser() 
	{
		driver.manage().deleteAllCookies();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
