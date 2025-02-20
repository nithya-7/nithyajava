package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

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
		ob.navigate().to("https://www.mycontactform.com");
		// login ( user name : text : id: user )
		ob.findElementById("user").sendKeys("NIthyaRavi");
		
		// password 
		ob.findElementByName("pass").sendKeys("1234567890");
		
		// click login button
		ob.findElementByClassName( "btn_log").click();

	}

}
