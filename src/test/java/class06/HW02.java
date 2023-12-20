package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW02 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
          /*
    goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web a
     */

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement newUser=driver.findElement(By.xpath("//button[@type='button']"));
        newUser.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement firstName=driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        String result = firstName.getText();
        System.out.println(result);

        String[] var = result.split(":");
        System.out.println(var[1]);



    }
}
