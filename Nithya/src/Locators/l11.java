package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id
				//name
				//classname
				//link text
				//partial link text
				//tag name
				//xpath
				//css
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				ChromeDriver ob = new ChromeDriver();
				//ob.get("https://www.google.com");
				ob.navigate().to("https://www.google.com");
				// login ( user name : text : id: user )
				ob.findElementById("APjFqb").sendKeys("Books");
				
				

	}

}
