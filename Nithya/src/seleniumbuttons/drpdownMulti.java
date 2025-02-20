package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdownMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.navigate().to("https://www.letskodeit.com/practice");
		ob.navigate().to("https://demo.automationtesting.in/Register.html");
		
		//create an obj for select class
		//pass list box as input
		//index/value/visible text 
		
		//multiple options can be selected 
		//desection is possible 
		//ob.findElementById("yearbox").click();
		WebElement ele = ob.findElementById("yearbox");
		Select s = new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(2);
		
		
		Thread.sleep(3000);
s.selectByValue("1916");
Thread.sleep(3000);
		s.selectByVisibleText("year");
		//s.deselectByIndex(2);
		//Thread.sleep(3000);

	}

}
