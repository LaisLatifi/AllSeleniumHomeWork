package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String URL, String browser) {
        //create instance
        driver = new ChromeDriver();
        //navigate to url
        driver.get(URL);
        //maximize the screen
        driver.manage().window().maximize();

    }

    public static void closeBrowser() {

        driver.quit();

    }
}

