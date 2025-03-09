package Seleniumexecutablecmd;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.letskodeit.com/practice");
		
		
		//scroll down and up
		
		
		// x-> 0
		
		ob.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //down +
		Thread.sleep(3000);
		
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); // up -
		Thread.sleep(3000);
		
		// we can give the scrolling value 
		ob.executeScript("window.scrollBy(0,400)"); //down +pos
		Thread.sleep(3000);
		
		ob.executeScript("window.scrollBy(0,-400)"); // up -ve
		Thread.sleep(3000);
		ob.quit();

	}

}
