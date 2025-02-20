package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class linkedtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//word : words => new url will be opened
		//substring of linedtext : partial linked text 
		//tagname a
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				ChromeDriver ob = new ChromeDriver();
				//ob.get("https://www.google.com");
				//ob.navigate().to("https://www.google.com");
				// linked text
				//ob.findElementByLinkText("Images").click();
				//partial linked text
				//ob.findElementByPartialLinkText("Imag").click();
				ob.navigate().to("https://www.facebook.com");
				ob.findElementByLinkText("Forgotten password?").click();
				

	}

}
