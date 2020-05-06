package javaSeleniumPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Shammi_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		//switching Frame
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames Available:" + allframes.size());
		driver.switchTo().frame(0);
		
		//using the Action class dragging the web element using coordinates
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(src, 100, 100).build().perform();
		
	}

}
