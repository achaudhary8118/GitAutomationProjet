package javaSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		//Creating web Element reference 
		 WebElement Electronics = driver.findElement(By.xpath("//*[@id = 'container']/div/div[2]/div/ul/li[1]/span"));
		 WebElement Men = driver.findElement(By.xpath("//*[@id = 'container']/div/div[2]/div/ul/li[3]/span"));
		 
		 //Mouse Simulation using Actions class
		 Actions act = new Actions(driver);
		 
		 //Mouse hover to electronics Web element
		 Thread.sleep(3000);
		 act.moveToElement(Electronics).build().perform();
		 
		 //Right Click on Web Element Electronics
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();
		
		//Release control from Web Element Electronics
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		//Performing Key Events
		
		//Press enter button from keyboard to disabled right clicked context
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("ENTERED");
		
		//Press enter button to Men web Element
		Thread.sleep(3000);
		act.sendKeys(Men, Keys.ENTER).build().perform();
		System.out.println("Successfully Executed"); 
		
		
		 
		 
		 
	}

}
