import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		/*
		//To open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		*/
		//To switch to new tab we have created object 2 i.e. new tab
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");

	}

}
