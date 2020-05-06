package javaSeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe")) ;
		System.out.println("Total Frames Available:" + allFrames.size());
		driver.switchTo().frame(0);
		
		//will find draggable and droppable web element
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='droppable']"));

		//use Actions class drag and drop the web element using src and tgt
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
	}

}
