package findElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Get_Attributes {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
WebElement searchButton = driver.findElement(By.name("btnK"));
System.out.println("Name of the button is:"+searchButton.getAttribute("name"));
System.out.println("Id of the button is:"+searchButton.getAttribute("id"));
System.out.println("Class of the button is:"+searchButton.getAttribute("class"));
System.out.println("Label of the button is:"+searchButton.getAttribute("aria-  label"));
	}

}
