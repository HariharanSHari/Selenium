package navigation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Clear()
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		searchBox.clear();
		Thread.sleep(3000);
		
		//BackSpace
		searchBox.sendKeys("Selenium");
		Thread.sleep(3000);
		String value = searchBox.getAttribute("value");
		int length = value.length();
		//if(value!=null){
		for(int i =0; i<length; i++) {
			searchBox.sendKeys(Keys.BACK_SPACE);
		}
		//}
		Thread.sleep(3000);
		
		//JavaScripTxecutor
		searchBox.sendKeys("Selenium");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='';", searchBox);
		

	}

}
