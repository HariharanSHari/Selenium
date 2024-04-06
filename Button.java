package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Button {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);			  
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/buttons");
		
		//Goto Home and come back here using driver command
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		driver.navigate().back();
		
		//Get the X & Y co-ordinates
		WebElement location = driver.findElement(By.id("position"));
		Point coOrdinates = location.getLocation();
		int x = coOrdinates.getX();
		int y = coOrdinates.getY();
		System.out.println(coOrdinates);
		System.out.println("x => "+x+" y => "+y);
		
		//Find the color of the button
		WebElement btnColor = driver.findElement(By.id("color"));
		String color = btnColor.getCssValue("background-color");   //value is from dom styles tab
		System.out.println("Color = "+color);      //it'll return in RGBA[Red Green Blue Alpha(transparent)]
		
		//Find the height & width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println(rect.getDimension());       //(width, height)
		System.out.println("Height = " + rect.getHeight());
		System.out.println("Width = " + rect.getWidth());
		System.out.println(rect.getPoint());    //location
		
		//another way of get the dimension by using dim object
		Dimension dim = rect.getDimension();
		System.out.println(dim);
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		
		//Confirm button is disabled
		WebElement disableButton = driver.findElement(By.id("isDisabled"));
		boolean isEnabled = disableButton.isEnabled();
		System.out.println("Is Button enabled ? " + isEnabled);
		
		//Click and Hold Button
		
		driver.quit();
		//driver.close();
		
		
	}

}
