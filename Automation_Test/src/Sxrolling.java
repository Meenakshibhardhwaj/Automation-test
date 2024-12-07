import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sxrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		/*driver.get("https://www.javatpoint.com/postman");
		Actions action=new Actions(driver);
		//For time allocation 
		Thread.sleep(2000);// Time in miliseconds
		action.scrollByAmount(0,1000).perform();// y-axis give estimate value which is in pixel form  
		Thread.sleep(2000);
		action.scrollByAmount(0,2000).perform();
		Thread.sleep(2000);
		//To scroll upwards
		action.scrollByAmount(0,-1000).perform();
		*/
		
		driver.get("https://www.thehorizontalway.com/");
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.scrollByAmount(1000,0).perform();// x-axis give estimate value which is in pixel form
		

	}

}
