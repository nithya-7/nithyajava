package mouseClicking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://jqueryui.com/slider/");
		
		//drag and drop by
		//slider :x, y
		// horizontal slider : move along y axis , x value will be 0
		// horizontal slider : move along x axis , y value will be 0
		
		//web elements : inside the frame 
		// switch our control to that frame 
		//id, name ,index 
		
		
		ob.switchTo().frame(0);
		WebElement ele = ob.findElementById("slider");
		Actions ac = new Actions(ob);
		ac.dragAndDropBy(ele, 50, 0).build().perform();
		

	}

}
