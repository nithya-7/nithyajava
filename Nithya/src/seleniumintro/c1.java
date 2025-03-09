package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
// 02 12(1) - rec date 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// add selenium server stand alone
		
		// project - ryt click - properties - java build path - add external jar- browser
		// selenium jar => apply and close 
		
		//step 1 - configuting the chrome driver 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		// creatig obj for chrome driver class
		ChromeDriver ob = new ChromeDriver();
		// get will maintain cookies and it will wait till the whole page loading fully 
		//ob.get("https://www.google.com");
		
		// navigate will not maintain the cookies 
		ob.navigate().to("https://www.google.com");
		
		// to maximize 
		//ob.manage().window().maximize();
		
		// to full screen
		ob.manage().window().fullscreen();
		//to refersh 3 times 
		for ( int i = 0; i<3; i++) {
			ob.navigate().refresh();
		}
		
		
		// to hold the screen for sec ( milli sec)
		Thread.sleep(3000);
		
		ob.quit();
			
		
		

	}

}
