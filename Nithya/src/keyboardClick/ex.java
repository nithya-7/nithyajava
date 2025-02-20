package keyboardClick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.get("https://www.google.com");
		ob.navigate().to("https://jqueryui.com/datepicker/");
		
		
		ob.switchTo().frame(0);
		WebElement ele = ob.findElementById("datepicker");
		Actions ac = new Actions(ob);
		ac.click(ele).build().perform();
		
		for (int i=0;i<2;i++)
		{
			ob.findElementByXPath("/html/body/div/div/a[2]/span").click();
		}

		ob.findElementByXPath("/html/body/div/table/tbody/tr[2]/td[7]/a").click();
	}

}
