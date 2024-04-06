package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EditBox {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		WebElement editBox = driver.findElement(By.className("card-footer-item"));
		editBox.click();
		WebElement userName = driver.findElement(By.id("fullName"));
		userName.sendKeys("Hari");
		
		WebElement append = driver.findElement(By.id("join"));
		append.sendKeys(" person",Keys.TAB);
		
		String text = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(text);
		
		WebElement clearBox = driver.findElement(By.id("clearMe"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By.id("noEdit"));
		boolean isEnabled = disabledBox.isEnabled();
		System.out.println(isEnabled);
		
		WebElement read = driver.findElement(By.id("dontwrite"));
		String isReadonly = read.getAttribute("readonly");
		System.out.println(isReadonly);     //readonly tag(no value) will be there if textbox is readonly
				
		//driver.quit();
	}

}
