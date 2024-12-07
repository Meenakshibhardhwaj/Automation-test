import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Invoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		
		//Install edge driver download and open microsoft official site to install and copy paste path.
		System.setProperty("webDriver.edge.driver", "C:\\Users\\Microsoft\\Downloads\\edgedriver_win64");
		

	}

}
