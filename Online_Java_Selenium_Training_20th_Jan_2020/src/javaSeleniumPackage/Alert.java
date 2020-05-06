package javaSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//handling Alert
		System.out.println(driver.switchTo().alert().getText());
		String ExceptionAlertText = "Please Enter Valid User Name";
		if (driver.switchTo().alert().getText().equalsIgnoreCase(ExceptionAlertText))
		{
			System.out.println("Alert Gets verified");
		}
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();// To Access the alert
		//driver.switchTo().alert().dismiss();// To Dismiss the Alert
		
	}

}
