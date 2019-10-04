import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginAutomated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        String baseUrl = "http://www.facebook.com/";
 
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("Testemail@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Testpass1234");
        driver.findElement(By.id("loginbutton")).click();
        
        String expectedTitle = "Error";
        String actualTitle = "";
        actualTitle = driver.getTitle();
        
        if 	(actualTitle.contentEquals(expectedTitle)) {
        	System.out.println ("Test passed");}
        
        else {System.out.println ("Test Failed");}
        
        driver.close();
        }
        
	}