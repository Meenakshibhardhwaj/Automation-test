import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		/*
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//Using Link text to find element and to perform operation 
		driver.findElement(By.linkText("Return to index")).click();
		//WebElement link_text=driver.findElement(By.linkText("Return to index"));
		//link_text.click();
		
		
		Thread.sleep(1000);
		//driver.quit();
		*/
		 driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=9059874769793069957&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301792&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		  List<WebElement>Is = driver.findElements(By.tagName("a"));
		  int ts=Is.size();
		  System.out.println("Total Links Available");
		  for (int i=0;i<ts;i++) {
		   System.out.print(i+1 + " ");
		   System.out.println(Is.get(i).getText());


	}

}
}
