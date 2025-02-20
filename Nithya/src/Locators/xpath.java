package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.navigate().to("https://www.mycontactform.com");
		ob.navigate().to("https://demo.automationtesting.in/Register.html");
		
		//xpath => xml path language 
		//relative 
		// absolute path 
		// shortcut =>( copy => copy full path)
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		//ob.quit();
		
		//relative xpath
		// start with //
		// copy -> copy xpath
		//ob.findElementByXPath("//*[@id=\"user\"]").sendKeys("ji");
		//ob.quit();
		
		// syntax = //*[@locator / attribute ='value'] or //tagname [@locator / attribute ='value']
		//ob.findElementByXPath("//*[@type='text']").sendKeys("hi");
		//ob.findElementByXPath("//input[@name='pass']").sendKeys("he");
		
		ob.findElementByXPath("//*[@type='text']").sendKeys("Nithya");
		ob.findElementByXPath("//input[@placeholder='Last Name']").sendKeys("Ravi");

	}

}
