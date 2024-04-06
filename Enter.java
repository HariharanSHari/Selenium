package navigation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Enter {

	public static void main(String[] args) throws AWTException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Keys
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
		
		//Submit()
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		searchBox.submit();
		
		//\n
	    driver.findElement(By.name("q")).sendKeys("selenium \n");
	    
		//Robot
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			

	}

}
