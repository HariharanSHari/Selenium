package navigation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Link  {

	public static void main(String[] args) throws IOException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Broken Link
		WebElement link = driver.findElement(By.linkText("Broken Link"));
		String urlLink = link.getAttribute("href");
		
		if(urlLink.isEmpty()||urlLink==null) {
			System.out.println(urlLink+" is broken");
		}
		
		URL u = new URL(urlLink);
		HttpURLConnection huc = (HttpURLConnection)(u.openConnection());
		huc.connect();
		if(huc.getResponseCode()>400) {
			System.out.println(urlLink+" link is broken");
		}
		
		
		

	}

}
