 package Seleniumexecutablecmd;

import org.openqa.selenium.chrome.ChromeDriver;

public class execCmd {
	// 2 -12 (2) rec

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		
		//getting title and URL (another way ) without using get method 
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.URL"));
		ob.quit();

	}

}
