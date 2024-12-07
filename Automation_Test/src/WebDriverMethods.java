import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		// Install driver from gecko install driver and Open github first site and install and extract copy path and paste as key. 
		System.setProperty("webDriver.river.firefox", "C:\\Users\\Microsoft\\Downloads\\geckodriver-v0.35.0-win-aarch64");
		//method to get URL: get.url
		driver.get("https://www.amazon.com/");
		
		// to maximize screen
		driver.manage().window().maximize();
		
		//to get title: object.get.title
		System.out.println(driver.getTitle());
		
		//To close automate browser
		driver.close();
		
		


	}

}
