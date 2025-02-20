package Seleniumexecutablecmd;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		//100 ; normal 
		//greater than 100 = zoom in
		//less than 100 = zoom out
		ob.executeScript("document.body.style.zoom='200'");
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='100'");
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='20'");
		Thread.sleep(3000);
		ob.quit();
		

	}

}
