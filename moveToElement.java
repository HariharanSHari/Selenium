package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement tamil = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		Actions action = new Actions(driver);
		String underline = tamil.getCssValue("text-decoration");
		System.out.println("Before Hovering " + underline);
		action.moveToElement(tamil).perform();
		//To check whether it is underlined
		String underline1 = tamil.getCssValue("text-decoration");
		System.out.println("After Hovering " + underline1);

	}

}
