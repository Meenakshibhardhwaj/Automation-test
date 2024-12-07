import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("alertBox")).click();
		
		//Create an object and assign driver object to new object to perform action on alert.
		Alert simpelAlert=driver.switchTo().alert(); // Here Alert is a class & Simplealert is an object and can name anything
		System.out.println(simpelAlert.getText());
		Thread.sleep(1000);
		simpelAlert.accept();//ok=accept(),,, cancel= dismiss();
		
		
		//id: confirmBox
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		Thread.sleep(1000);
		confirmAlert.dismiss();
		
		//id: promptBox
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Hey");
		Thread.sleep(1000);
		promptAlert.accept();
		
		
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
