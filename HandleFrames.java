package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/frame");
		
		//To switch to first frame
		driver.switchTo().frame(0);     //index
		driver.findElement(By.name("fname")).sendKeys("Hari");
		driver.findElement(By.name("lname")).sendKeys("Haran");
		
				
		//WebElement emailbox = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("Haran8958@gmail.com");
		//driver.switchTo().frame("emailbox");
		//emailbox.sendKeys("haran8958@gmail.com");
		
		//driver.quit();
	}

}
