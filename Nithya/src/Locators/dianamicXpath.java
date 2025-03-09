package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dianamicXpath {
	
	//16 -2 ( 1)s
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.mycontactform.com/");
		
		//following , preceding 
		
		//username text => login button 
		//ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
		
		//preceding
		//ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hello");
		
		//parent - child 
		//WebElement ele = ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[3]");
		//System.out.println(ele.getText());
		
		//child - parent 
		//WebElement ele = ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[2]//parent::div[1]");
		//System.out.println(ele.getText());
		
		//System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//parent::div").getLocation());
		
		// following -siblings 
		//System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following::p[2]").getText());
		
		// preceding - siblings 
		System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]/a//preceding::p[3]").getText());
		ob.quit();
		
		
		
		
		

	}

}
