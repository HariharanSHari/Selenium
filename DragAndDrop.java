package navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);	
		
		//DragAndDrop
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //new syntax for implicit, but it won't work.
		
		driver.switchTo().frame(0); 
		WebElement source = driver.findElement(By.id("draggable")); 
		WebElement target = driver.findElement(By.id("droppable")); 
		Actions builder = new Actions(driver); 
		builder.dragAndDrop(source, target).perform();
		
		//DragAndDropBy
		driver.switchTo().newWindow(WindowType.TAB);    //To open a new tab
		driver.navigate().to("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0); 
		WebElement source1 = driver.findElement(By.id("draggable")); 
		//WebElement target = driver.findElement(By.id("droppable"));  NO NEED SINCE WE ARE DOING DRAGANDDROPBY
		Actions builder1 = new Actions(driver); 
		int x = source1.getLocation().getX();
		int y = source1.getLocation().getY();
		builder1.dragAndDropBy(source1, x+100, y+100).perform();
		
		//driver.quit();



	}

}
