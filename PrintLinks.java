package navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PrintLinks {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium", Keys.ENTER);
		
		//To print the total links
		List<WebElement> totallinks = driver.findElements(By.xpath("//a[contains(@href,'')]"));
		System.out.println(totallinks.size());
		Thread.sleep(5000);
		
		for (WebElement link : totallinks) {
			System.err.println(link.getAttribute("href"));     //url will be in href tag
		}
		System.out.println("--------------");
		Thread.sleep(5000);
		
		//To fetch the all the links
		List<WebElement> mainLinks = driver.findElements(By.xpath("//span[@role='text']"));
		System.out.println(mainLinks.size());
		
		for (WebElement weblink : mainLinks) {
			System.out.println(weblink.getText());
		}
		

	}

}
