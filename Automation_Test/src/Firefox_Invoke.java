import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Invoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		// Install driver from gecko install driver and Open github first site and install and extract copy path and paste as key. 
		System.setProperty("webDriver.river.firefox", "C:\\Users\\Microsoft\\Downloads\\geckodriver-v0.35.0-win-aarch64");
		

	}

}
