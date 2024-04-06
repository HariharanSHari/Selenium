package navigation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Refresh {
	
	public static void main(String[] args) throws AWTException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		//Using navigate()
		driver.navigate().refresh();
		
		//Using getCurrentUrl()
		driver.get(driver.getCurrentUrl());
		
		//Using JavaScriptExecutor Interface
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("location.reload()");
		jse.executeScript("history.go(0)");
		
		//Using Robot Class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		//driver.quit();
		
		}
}
