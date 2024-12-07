import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Thread.sleep(2000);
		WebElement drag=driver.findElement(By.id("column-a"));
		WebElement drop=driver.findElement(By.id("column-b"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		
		Thread.sleep(1000);
		//driver.quit();

	}

}
