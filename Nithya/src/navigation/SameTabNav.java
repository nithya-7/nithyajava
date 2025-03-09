package navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SameTabNav {
	
	//15 - 2 ( 3rd)

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com"); //step 1
		Thread.sleep(3000);
		
		ob.findElementByLinkText("Images").click(); // step 2
		Thread.sleep(3000);
		// moving back to previous step 
		ob.navigate().back();  // step 1
		Thread.sleep(3000);
		
		ob.navigate().forward();
		Thread.sleep(3000);
		
		ob.navigate().back();
		Thread.sleep(3000);
		ob.quit();
		
		
		
		

	}

}
