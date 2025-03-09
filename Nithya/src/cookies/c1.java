package cookies;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	// 2 12 ( last video)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		
		// temproray info stored by the browser - cookies 
		
		Set s = ob.manage().getCookies();
		System.out.println("No of cookies" + s.size());
		
		// we can only deleet the cookis temporarily or at instance 
		// we can't delete permanently 
		
		ob.manage().deleteAllCookies();
		
		Set s1 = ob.manage().getCookies();
		System.out.println("No of cookies" + s1.size());
		
		
		ob.quit();

	}

}
