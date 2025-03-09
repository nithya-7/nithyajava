package seleniumBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class res {
	// 02 12(2) - rec date 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		
		
		//create a obj for Dimension class
		//pass desired height and width in it 
		//apply it on the window
		
		Dimension d = new Dimension(400,500);
		ob.manage().window().setSize(d);
		ob.quit();
		
		
	}

}
