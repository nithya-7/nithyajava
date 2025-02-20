package Seleniumexecutablecmd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.letskodeit.com/practice");
		
		// alert popup msgbox
		//ob.executeScript ("alert ('time out')");//ok
		
		ob.executeScript("window.confirm('time out')");
		Thread.sleep(3000);
		Alert a1 = ob.switchTo().alert();
		Thread.sleep(3000);
		a1.accept();
		ob.quit();
		
		
		
		

	}

}
