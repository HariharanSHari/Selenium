package navigation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Maximize {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
				
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.navigate().to("https://www.google.com/");
		
		//Using Maximize()
		driver.manage().window().maximize();
		
		//Using Dimension class
		Dimension dim = new Dimension(1920, 1080);
		driver.manage().window().setSize(dim);
		
		
		//Using Chrome Option class - To set the capabiities of chrome
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--start-maximized");     //It will open the maximized browser
		
		//driver.quit();

	}

}
