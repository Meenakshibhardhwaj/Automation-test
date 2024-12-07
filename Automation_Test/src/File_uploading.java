import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_uploading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		//input[@name='my-file']
		driver.findElement(By.xpath("//input[@name='my-file']")).sendKeys("C:\\Users\\Microsoft\\Downloads\\CV Mayank Verma.pdf");
		
		
		Thread.sleep(1000);
		driver.quit();


	}

}
