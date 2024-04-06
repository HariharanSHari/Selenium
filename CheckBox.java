package navigation;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import graphql.Assert;

public class CheckBox {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01qjnaza3zozkn1x50exsw8l4va326359.node0");
		driver.manage().window().maximize();		
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[contains(@id,'j_idt87:')]"));  
		
		for (WebElement chbox : checkboxes) {
			chbox.click();        //but won't work
		}
		/*
		for(int i=0;i<9;i++) {
			checkboxes.get(i).click();
		}
		*/
		
	}

}

