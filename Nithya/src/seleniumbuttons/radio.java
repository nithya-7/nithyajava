package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
	
	// 14 -2 ( 2nd)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.navigate().to("https://www.mycontactform.com");
		//ob.navigate().to("https://www.letskodeit.com/practice");
		ob.navigate().to("https://demo.automationtesting.in/Register.html");
		
		//radio
		//ob.findElementById("bmwradio").click();
		//ob.findElementById("benzradio").click();
		//ob.findElementById("hondaradio").click();
		
		//check box
		//ob.findElementById("bmwcheck").click();
		
		//ob.findElementById("checkbox1").click();
		ob.findElementByXPath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input").click();

	}

}
