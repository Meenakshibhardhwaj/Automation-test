import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame_DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement Frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		

	}

}
