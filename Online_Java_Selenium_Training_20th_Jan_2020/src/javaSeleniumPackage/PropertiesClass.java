package javaSeleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesClass {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of property file
		File src = new File("C:\\Users\\Amit_Laptop\\eclipse-workspace\\Online_Java_Selenium_Training_20th_Jan_2020\\Repository\\Object_Repo.properties");
		
		//Create FiltInputStream Object to load the File
		FileInputStream fis = new FileInputStream(src);
		
		//Create Property Class object to Read Properties file
		Properties pro = new Properties();
		pro.load(fis);
		
		//Introduce Chrome Driver //Maximize window //Implicit wait
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//getproperty is a method which accept key and it return value for the same key
		driver.findElement(By.xpath(pro.getProperty("EmailOrPhone"))).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("12345");
		
	}

}
