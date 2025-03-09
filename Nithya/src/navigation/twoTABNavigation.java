package navigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class twoTABNavigation {
//16 - 3 ( 2 )
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
	    ob.get("http:\\www.google.com");
	    ob.manage().window().maximize();

	   //open ,ycontactform.com in new tab 
	 ob.executeScript("window.open('https://www.mycontactform.com','_blank');");
	 
	//get the control of first tab: driver.getwindowhandle()=> String => parent 
	 //get the control of both tabs: driver.getwindowhandles() s1={google, mycontactform.com} 

	String parent=ob.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle 
	  Set<String> s1 = ob.getWindowHandles();// 2(both the tabs = collected) 

	  //step3: iteration 

	// iterate through the elements present in set

	  Iterator<String> I1 = s1.iterator();  // hasNext , next() 

	  while(I1.hasNext())// whether any content is there 

	    {

	      String child_window=I1.next();

	      if(!parent.equals(child_window))

	    	  { // control is moved to child window 

	        ob.switchTo().window(child_window);

	        System.out.println(ob.getTitle());

	        Thread.sleep(4000);

	        ob.findElementByLinkText("Help").click();

	        Thread.sleep(4000);

	        ob.close();

	      } 

	    }

	  

	 /*parent: google

	  * s1={google.com, mycontactform.com}
	  * I1=> hasnext, next
	  
	  * iteration1:
	  * I1 points to first element in s1  . it points to google.com
	  * I1.hasnext=> content
	  *      I1.next reads google.com and store in child_window
	  *      child_window=google
	  *         if parent!=child
	  *            google!=google

	  *  second iteariton:  
	  *  I1 points to second element in s1; mycontactform.com
	  *  I.next reads mycontact   
	  *   child_Window= mycontactform
	  *       if parent!=child
	  *          google!=mycontactform
	  *             switching control to mycontactform.com
	  *             title
	  *             4 seconds
	  *             Help
	  *             4 seconds 
	  *             close ; closes mycontactform.com 
	  *             
	  *  third iteration: no content 
	  *  while loop terminates 
	  * */



	  ob.switchTo().window(parent);//google 

	  System.out.println(ob.getTitle());// google

	  //driver.findElement(By.linkText("Images")).click();

	  Thread.sleep(5000);

	  ob.findElementByLinkText("Images").click();

	  Thread.sleep(5000);

	  ob.quit();

	}

}
