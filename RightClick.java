package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/buttons");
		
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		Actions action = new Actions(driver);
		action.contextClick(rightClickBtn).perform();
		WebElement textarea = driver.findElement(By.id("rightClickMessage"));
		String text = textarea.getText();
		System.out.println(text);
	}

}
