package mouseClicking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {
	
	//15 -2 ( 1st half)

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://jqueryui.com/droppable/");
		
		// drag and drop
		/* web elements : inside the frames 
		 * switch our control to the frame 
		 * id , name , index 
*/
		ob.switchTo().frame(0);
		Actions ac = new Actions(ob);
WebElement ele = ob.findElementById("draggable");
WebElement ele1 = ob.findElementById("droppable");
Thread.sleep(3000);
ac.dragAndDrop(ele, ele1).build().perform();
	}

}
