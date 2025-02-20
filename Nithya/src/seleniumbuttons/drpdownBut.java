package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdownBut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.navigate().to("https://www.letskodeit.com/practice");
		
		//create an obj for select class
		//pass dropdown box as input
		//index/value/visible text 
		
		WebElement ele = ob.findElementById("carselect");
		Select s = new Select(ele);
		//s.selectByValue("honda");
		//s.selectByIndex(2);
		s.selectByVisibleText("Benz");
		
		

	}

}
