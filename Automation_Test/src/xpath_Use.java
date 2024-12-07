import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.netflix.com/login");
		
		//To drive xpath selector
		// Xpath
		// //input[@id=':r0:']
		
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("test@gmail.com");
		
		// //input[@id=':r3:']
		driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys("123456");
		
		// Sign in button
		//button[normalize-space()='Sign In']
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		//To show error message in console
		//div[@role='alert']
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		
		//button[normalize-space()='Use a sign-in code']
		//To sign in button
		driver.findElement(By.xpath("//button[normalize-space()='Use a sign-in code']")).click();
		
		//button[normalize-space()='Send sign-in code']
		//Next screen button click
		driver.findElement(By.xpath("//button[normalize-space()='Send sign-in code']")).click();
		
		

	}

}
