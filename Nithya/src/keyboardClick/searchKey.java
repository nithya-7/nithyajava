package keyboardClick;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class searchKey {
	// 15 - 2 ( 2nd)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com");
		
	WebElement ele = ob.findElementByName("q");
	Actions ac = new Actions(ob);
	ac.click(ele).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();

	}

}
