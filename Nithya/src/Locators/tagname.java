package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//links : a
		//images : img 
		//elements : div, input, select, li
		//collection purpose
		//
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.navigate().to("https://www.mycontactform.com");
		List<WebElement> l1 = ob.findElementsByTagName("img");
		System.out.println("img count is " + l1.size() );
		List<WebElement> l2 =  ob.findElementsByTagName("input");
		System.out.println("input count is " + l2.size() );
		List<WebElement> l3 = ob.findElementsByTagName("a");
		System.out.println(" a count is " + l3.size() );
		
		
		
		
		
		

	}

}
