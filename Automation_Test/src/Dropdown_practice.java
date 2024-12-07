import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webDriver.driver.chrome", "C:\\Users\\Microsoft\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
		//Drop down
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
				
		
		//a[normalize-space()='Amrit'sar (ATQ)']
		driver.findElement(By.xpath("//a[normalize-space()='Amritsar (ATQ)']")).click();
		Thread.sleep(2000);
		
		//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]
		driver.findElement(By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		
		//To select calender using xpath
		//input[@id='ctl00_mainContent_view_date1']
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		Thread.sleep(2000);
		
		//To select date can not be selct without Xpath bcz needs uniqueness to automate and possible with xpath only.
		//a[normalize-space()='23']
		driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		////a[normalize-space()='24']
		driver.findElement(By.xpath("//a[normalize-space()='24']")).click();
		
		//Static dropdown
		//Needs to use different syntax whose ag name is select.
		// Locate the dropdown element using an appropriate locator (e.g., By.id, By.name, By.xpath)
		// id: ctl00_mainContent_DropDownListCurrency
		WebElement dropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// Create an instance of the Select class
        Select dropdown = new Select(dropdownElement); //Import select.
        
        // Select by value
     //   dropdown.selectByValue("USD");
        
        // Select by Index
       // dropdown.selectByIndex(2);
        
        // Select by Visible text
        dropdown.selectByVisibleText("INR");
		
				

		
		Thread.sleep(1000);
		driver.quit();

	}

}
