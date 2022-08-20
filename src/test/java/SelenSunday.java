import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenSunday {

// add hlkjljlk
    public static void main(String[] args)throws InterruptedException {
        String url = "https://google.com/";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\15712\\Desktop\\B7-Selenium\\chromedriver.exe");

        // step 2 creat webDriver reference pointing to ChromeDriver OBJ :create on obj
        // of webDrriver
        WebDriver driver = new ChromeDriver();


        driver.get(url);
        Thread.sleep(3000);
        driver.quit();












    }
















}
