package navigation;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, AWTException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver","C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver(options);	//otherwise getScreenshotAs won't work		  
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/buttons");
		
		
		//Using ScreenshotAs()
		File src = driver.getScreenshotAs(OutputType.FILE);   //it'll just take the screenshot
		File dest = new File("./snaps/img1.png");     //where we want to save the screenshot
		FileHandler.copy(src, dest);           //it'll save the file
		
		//Refresh & check the snap folder
		
		//Using TakesScreenshot Interface
		TakesScreenshot ss = (TakesScreenshot)driver;
		//ss.getScreenshotAs(OutputType.FILE);
		File Src1 = driver.getScreenshotAs(OutputType.FILE);   
		File dest1 = new File("./snaps/img2.png");     
		FileHandler.copy(Src1, dest1);       //we can use FileUtils also but need to download one jar (apache.common.io - package)        
		
		//To take the screenshot of a particular element
		WebElement element = driver.findElement(By.id("home"));
		File elementsrc = element.getScreenshotAs(OutputType.FILE);
		File eledest = new File("./snaps/img3.png");
		FileHandler.copy(elementsrc, eledest);
		
		//To take the screenshot of a particular section
		WebElement info = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/div"));
		elementsrc = info.getScreenshotAs(OutputType.FILE);   //Re-initialization..that's y no class declaration
		eledest = new File("./snaps/img4.png");
		FileHandler.copy(elementsrc, eledest);
		
		//Using Robot class
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rect);
		
		File destfile = new File("./snaps/img5.png");
		ImageIO.write(source, "png", destfile);
		
		//driver.quit();
		
	}
	
}
