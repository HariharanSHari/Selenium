package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
	
		driver.get("https://letcode.in/buttons");
		String url = driver.getCurrentUrl();
		System.out.println("Button page URL " + url);
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		String homeURL = driver.getCurrentUrl();
		System.out.println("Homepage URL : " + homeURL);
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("returns to button page "+ driver.getCurrentUrl());
		
		driver.navigate().refresh();
		driver.navigate().forward();
		
		driver.quit();
		
	}

}
