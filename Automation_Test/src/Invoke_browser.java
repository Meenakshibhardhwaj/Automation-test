import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoke_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		
		/* Webdriver= class( Which will act as master class for selenium)
		 * driver=object
		 * chromedriver= platform driver(particular driver we want to open.)
		 */

	}

}
