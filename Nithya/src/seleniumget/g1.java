package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		
	// title 
		System.out.println(ob.getTitle());
		//url
		System.out.println(ob.getCurrentUrl());
		//size 
		// height and width of the window 
		System.out.println(ob.manage().window().getSize());
		// position : x and y value of the window
		System.out.println(ob.manage().window().getPosition());
		//getting brwoser details 
		System.out.println(ob.getCapabilities());
		ob.quit();

	}

}
