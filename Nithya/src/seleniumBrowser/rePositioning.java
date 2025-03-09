package seleniumBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class rePositioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		
		//create an obj for point class 
		//pass x and y value in it 
		//apply it on the window 
		
		Point p = new Point(234,456);
		ob.manage().window().setPosition(p);
		ob.quit();

	}

}
