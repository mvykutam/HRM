package com.hrm.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase1 {

	public static WebDriver driver;
	public static Properties prop;
	public static Actions act;
	public static Alert alerts;

	public TestBase1() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\HRM Project\\HRM Selenium Project\\src\\com\\hrm\\config\\config.propeties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\HRM Project\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\HRM Project\\SeleniumDump\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("url"));

//		driver.switchTo().frame("");
//		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));

	}
	//switching to frame
	public void switchFrame(String frameName)
	{
		driver.switchTo().frame(frameName);
		
		
	}
	//default frame: swiching to original frame
	public void defaultFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	//start actions
	public void StartAction()
	{
		act=new Actions(driver);
	}
	//mouseover 
	public void mouseOver(WebElement Element)
	{
		act.moveToElement(Element).perform();
	}
	
	
	//Alerts handling 
	
	public void alerts()
	{
		alerts=driver.switchTo().alert();
		String alttxt=alerts.getText();
		System.out.println(alttxt);
		
	}
	
	public void alertAccept()
	{
		alerts.accept();
	}
	
	
	public void alertDimiss()
	{
		alerts.dismiss();
	}
	
	
	public void waitForElement(WebDriver driver, int timeOutInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//method to verify driver text with assertion
	public void gettext(WebElement drivertext,String expectedtext)
	{
		String acttext=drivertext.getText();
		if(acttext.equals(expectedtext))
		{
			System.out.println("displayed text true "+acttext);
		}
		else
		{
			System.out.println("displayed text Flase"+acttext);
		}
	}
	
	}
