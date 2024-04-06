package navigation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2119865\\OneDrive - Cognizant\\Desktop\\Driver\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(options);	
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/select-menu");
		
		//Select by Visible Index
		WebElement color = driver.findElement(By.id("oldSelectMenu"));
		//driver.findElement(By.cssSelector("#oldSelectMenu"));   for css = #id
		Select mycolor = new Select(color);
		mycolor.selectByVisibleText("White"); 
		WebElement selectedcolor = mycolor.getFirstSelectedOption();  //it'll give you the last selected option
		System.out.println(selectedcolor.getText());  
		List<WebElement> allCars = mycolor.getOptions();
		allCars.forEach(i -> System.out.println(i.getText()));     //To get all the options
		
		
		//Select by Value in multiple select dropdown
		WebElement cars = driver.findElement(By.id("cars"));
		Select mycar = new Select(cars);
		boolean isMul = mycar.isMultiple();      //To check it is multiple select dropdown
		System.out.println("Is Multi? "+isMul);
			
		mycar.selectByValue("audi");
		mycar.selectByIndex(0);    //it'll select he volvo car
		
		List<WebElement> selectedcar = mycar.getAllSelectedOptions();  //it'll give you the all selected option
		for (WebElement webElement : selectedcar) {
			System.out.println(webElement.getText());
		}
		
		mycar.deselectByIndex(0);   //To deselect & it'll only work for multiple
		
		//Bootstrap DropDown
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.findElement(By.id("demo_basic-dropdown-selected")).click();   //inspect dropdown
		driver.findElement(By.xpath("//*[@id=\"demo_basic-dropdown\"]/div/div[2]/button[2]")).click();    //inspect the option need to select

	}

}
