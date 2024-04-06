package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class timsheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
		driver.navigate().to("https://onecognizant.cognizant.com/Home");
		
		WebElement searchicon = driver.findElement(By.className("searchTopBar"));
		searchicon.click();
		WebElement box = driver.findElement(By.id("oneCSearchTop"));
		//box.sendKeys("Submit timesheet"); 
		//box.sendKeys(Keys.ENTER);
	
		box.sendKeys("Submit timesheet"); 
		box.sendKeys(Keys.ENTER);
		WebElement timesheet = driver.findElement(By.className("quickActionsResultText"));
		timesheet.click();
		
		/*
		 * WebElement summary = driver.findElement(By.linkText("03-FEB-2024 To 09-FEB-2024"));
		 * summary.click();
		 */

	}

}
