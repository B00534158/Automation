import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//x driver = new x ();
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        // get the actual value of the title
        //actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
       // if (actualTitle.contentEquals(expectedTitle)){
            //System.out.println("Test Passed!");
        //} else {
          //  System.out.println("Test Failed");
       // }
        
        
       
        //close Fire fox
       // driver.close();
        
	}

}
