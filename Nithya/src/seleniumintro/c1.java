package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// add selenium server stand alone
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		// to maximize 
		//ob.manage().window().maximize();
		// to full screen
		ob.manage().window().fullscreen();
		//to refersh 
		for ( int i = 0; i<0; i++) {
			ob.navigate().refresh();
		}
		// to hold the screen for sec ( milli sec)
		Thread.sleep(3000);
		
		ob.quit();
			
		
		

	}

}
