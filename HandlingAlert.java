package navigation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandlingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/alert");
		
		//Simple Alert
		WebElement simpleAlert = driver.findElement(By.id("accept"));
		simpleAlert.click();
		//System.out.println(driver.getCurrentUrl());   - won't work
		//getcurrent url & screenshot won't work before switching to the Alert
		
		Alert alert = driver.switchTo().alert();    //switching the control to alert and declaring
		String text = alert.getText();
		System.out.println("Simple Alert Text "+text);
		alert.accept();      //dismiss also possible of simple alert
		
		//Prompt Alert
		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		driver.switchTo().alert();
		alert.sendKeys("Hari");   //bcoz at a time there'll be only one alert. so we can use the old one
		System.out.println(alert.getText());   //we can't see typing of text in Alert
		alert.dismiss();
		
		//To get text which we have entered
		WebElement promptTextArea = driver.findElement(By.id("myName")); 
		String text1 = promptTextArea.getText(); 
		System.out.println("Prompt Alert Text "+text1);
		 
		
		//driver.quit();
		
	}

}
