package navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PrintSuggestion {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//To Print all the suggestion
		driver.findElement(By.name("q")).sendKeys("Selenium ");
		Thread.sleep(5000);      //Otherwise won't work
		
		List<WebElement> ele = driver.findElements
				(By.xpath("//ul[@role='listbox']//following::li"));
		
		for (WebElement sugg : ele) {
			System.out.println(sugg.getText());
		}

		System.out.println("-------------");
		Thread.sleep(5000);
		
		//To click the particular suggestion
		int position =0;     //index
		for (WebElement sugg : ele) {
			position++;     //a=a+1, a++ are not same
			if(position==3) {
				System.out.println(sugg.getText());
				//use break statement here, if you need to click the sugg. Otherwise - StaleElementReferenceException
			}
		}
		Thread.sleep(5000);
		
		//To click the suggestion using text
		for (WebElement sugg : ele) {
			String text = sugg.getText();
			if(text.contains("webdriver")) {
				sugg.click();
				break;      //To stop the for loop
				
			}
		}
		
	}

}
