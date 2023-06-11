package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void getdriver(String browserType) {

		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notofications");
			driver= new ChromeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		case "ie":
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();

		default:
			break;
		}

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void maximizewindow() {

		driver.manage().window().maximize();

	}

	public void elementsendkeys(WebElement element, String data) {

		element.sendKeys(data);
	}
	
	public byte[] takeScreenShortByte() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}

	public void elementclick(WebElement element) {
		element.click();

	}
public void javascriptscrolldown(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);

}
	public WebElement findlocatorbylinktext(String attributevalue) {
		WebElement element = driver.findElement(By.linkText(attributevalue));
		return element;
	}
	public WebElement findlocatorbyid(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}

	public WebElement findlocatorbyname(String attributevalue) {
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}

	public WebElement findlocatorbyclassname(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}

	public WebElement findlocatorbyxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}

	public String gettitle() {
		String title = driver.getTitle();
		return title;

	}

	public void quitwindow() {
		driver.quit();
	}
	
	public String elementgettext(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public String elementgetattributevalue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public String elementgetattributevalue2(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;

	}

	public String getapplnurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public void selectoptionbytext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	
	public static File Screenshot(String location) throws IOException {
		TakesScreenshot screenshot =(TakesScreenshot) driver;
     File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
         File f = new File(location);
         FileUtils.copyFile(screenshotAs, f);
		return f;
	}
	
	
public static String getProjectLoc() {
		
		String path = System.getProperty("user.dir");
		return path;
		

	}
	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream(getProjectLoc()+"\\Config\\Config.properties"));
		
		return (String)properties.get(key);
		
	}

	
	
	
	
	
	
	
	
	
	

}
