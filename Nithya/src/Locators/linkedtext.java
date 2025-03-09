package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class linkedtext {
	
	//13 02 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a word or group of word when u click on it url will be opened that is link text
		
		//word : words => new url will be opened
		//substring of linedtext : partial linked text 
		//tagname a - it will start with /a when u inspect 
		
		
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
