package Seleniumexecutablecmd;

import org.openqa.selenium.chrome.ChromeDriver;

public class execCmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://www.google.com");
		
		//getting title and URL another way 
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.URL"));
		ob.quit();

	}

}
