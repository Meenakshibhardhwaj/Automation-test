import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Copy_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Thread.sleep(1000);
		driver.quit();

	}

}
