package mouseClicking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {

	//private static final String Actions ac  = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.mycontactform.com/");
		
		/*click
		 * double click 
		 * right click - context click 
		 * mouse hovering
		 * click hold and release 
		 * drag and drop
		 * drag and drop by
		 * 
		 * create an obj for action class 
		 * pass driver instance an input 
		 * 
		 */
		
		WebElement ele = ob.findElementByClassName("txt_log");
		Actions ac = new Actions(ob);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.moveToElement(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		//ob.quit();
		ac.release(ele).build().perform();
		
		
		
	}

}
