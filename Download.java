package navigation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Download {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();

		driver.findElement(By.id("j_idt93:j_idt95")).click();
		
		File fileLocation = new File("C:\\Users\\2119865\\Downloads");
		
		File[] totalFiles = fileLocation.listFiles();
		
		for (File tempfile : totalFiles) {
			System.out.println(tempfile.getName());
			if(tempfile.exists()) {
				System.out.println("File is present");
			}
			else
				System.out.println("File is not present");
			/*if(tempfile.getName().equals("TestLeaf Logo")) {
				System.out.println("File is3 Downloaded");
			}
			break;
			*/
		}
		System.out.println("End");
	}

}
