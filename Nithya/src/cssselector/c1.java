package cssselector;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		//ob.navigate().to("https://www.mycontactform.com");
		ob.navigate().to("https://www.facebook.com");
		//casecade style sheet 
		//manual : 7 ways 
		// shrtcut => copy copy selector 
		
		//1.tag name and id       syntax : tagname#id
		//ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2.tagname and classname      syntax : tagname.classname
		//ob.findElementByCssSelector("input.txt_log").sendKeys("li");
		
		//3.tagname and attribute     syntax : tagname[attribute='value'];
		//ob.findElementByCssSelector("input[type='text']").sendKeys("li");
		
		//4.tagname , classname and attribute     syntax : tagname.classname[attribute='value'];
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("li");
		
		//5.tagname and prefx attr   syntax : tagname[attri^='pfefx value']
		//ob.findElementByCssSelector("input[type^='te']");
		
		////6.tagname and sufx attr   syntax : tagname[attri$='sufx value']
		//ob.findElementByCssSelector("input[type$='xt']");
		
	//6.tagname and sufx attr   syntax : tagname[attri$='sufx value']
			//ob.findElementByCssSelector("input[type$='xt']");
			
			//7. shrtcut => copy copy selector 
			//ob.findElementByCssSelector("#user").sendKeys("ji");
		
		//4.tagname , classname and attribute     syntax : tagname.classname[attribute='value'];
		//ob.findElementByCssSelector("input.inputtext _55r1 _6luy[type='text']").sendKeys("abcdef");
		ob.findElementByCssSelector("#email").sendKeys("abcdef");
		
			

	}

}
