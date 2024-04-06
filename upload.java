package navigation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class upload {
		
		public static void main(String[] args) throws InterruptedException {
			
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
	
			System.setProperty("webdriver.edge.driver", "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver(options);
			driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0163w6ocs18t3gfv23uu1750tc235179.node0");
			driver.manage().window().maximize();
			
			//First Type  (input tag, so sendkeys)
			WebElement upload1 = driver.findElement(By.id("j_idt88:j_idt89_input"));
			upload1.sendKeys("C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\nothing.txt");
			Thread.sleep(2000);
			
			//upload the file within the project folder
			String path = System.getProperty("user.dir");    //To get the current project path
			WebElement upload2 = driver.findElement(By.id("j_idt88:j_idt89_input"));
			upload2.sendKeys(path+"//snaps//img.png");
			Thread.sleep(2000);
			
			//Second type
			String path1 = "C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\nothing.txt";
			StringSelection selection = new StringSelection(path1);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			/*Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);*/
			
			
			WebElement upload3 = driver.findElement(By.id("j_idt97:j_idt98_input"));
			upload3.sendKeys("C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\nothing.txt");
			WebElement error = driver.findElement(By.xpath("//*[@class='ui-messages-error ui-corner-all']"));
			System.out.println(error.getText());
		}
}



