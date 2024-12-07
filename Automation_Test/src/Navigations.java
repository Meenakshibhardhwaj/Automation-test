import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.flipkart.com/");
		// To go to another web page
		driver.navigate().to("https://www.thehorizontalway.com/");
		
		// To go back in previous tab
		driver.navigate().back();
		
		//To go to another 2nd webpage(another)
		driver.navigate().forward();
		
	}

}
