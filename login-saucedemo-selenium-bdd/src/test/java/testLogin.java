
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testLogin {
	
	private static WebDriver driver;

        public static void main(String[] arg){
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver-19\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        //navigate to URL Testing
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
}
        
}
