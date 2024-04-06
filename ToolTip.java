package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ToolTip {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/tooltip/#Forms%20Based");
		driver.manage().window().maximize();

		driver.findElement(By.id("Forms Based")).click();
		//WebElement frame = driver.findElement(By.className("demo-frame lazyloaded"));
		driver.switchTo().frame(2);    //Error 
		
		WebElement tooltip1 = driver.findElement(By.id("firstname"));
		String text1 = tooltip1.getAttribute("title");   //maximum Tooltip text will be in title attribute
		System.out.println(text1);
		
		WebElement tooltip2 = driver.findElement(By.id("lastname"));
		System.out.println(tooltip2.getAttribute("title"));   
	}

}
