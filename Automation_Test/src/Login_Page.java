import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		/*
		//Implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.netflix.com/login");
		
		
		//Email field
		driver.findElement(By.id(":r0:")).sendKeys("test@gmail.com");
		// Here Find element neds singular bcz we are using single element at a time
		// Here id is the locator we are finding from HTML of site, 
		// Send keys are used to fill values in selected element.
		
		//id=":r0:";

		//Password field
		//id=":r3:"
		driver.findElement(By.id(":r3:")).sendKeys("1234567890");
		
		
		//In case of buttons it shows class name where different classes are there with space and we needs to use 1st class to perform action.
		//class="e1ax5wel2 
		driver.findElement(By.className("e1ax5wel2")).click();
		
		// For css selector
		//Error from signin page-> Inspect-> check class name our css selector is: div.e191g6e31
		//id= tagname#id
		//name= tagname.name
		//div.e191g6e31
		//class="default-ltr-cache-mkkf9p e191g6e31"
		
		System.out.println( driver.findElement(By.cssSelector("div.e191g6e31")).getText());
		
		*/
		
		
		
		
		
		
		
		
		//Implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Username
		//id="inputUsername"
		driver.findElement(By.id("inputUsername")).sendKeys("Abc");
		
		//name="inputPassword"
		//Password
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		
		//Checkbox selection
		//id="chkboxOne"
		driver.findElement(By.id("chkboxOne")).click();
		
		//id="chkboxTwo"
		driver.findElement(By.id("chkboxTwo")).click();
		
		//Button selection
		//class="submit signInBtn"
		driver.findElement(By.className("submit")).click();
		
		//Css selector: tagname.classname
		//tag name=p
		//class="error"
		//p.error
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
	}

}
