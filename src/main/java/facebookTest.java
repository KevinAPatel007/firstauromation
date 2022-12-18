import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class facebookTest {
            public static void main(String[] args) throws InterruptedException {
                WebDriver driver;
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/");
                Thread.sleep(4000);
                driver.quit();
            }
        }

