package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW01 extends CommonMethods {
    /*
   goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console (edited)
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax
    */
    public static void main(String[] args)   {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement start = driver.findElement(By.xpath("//button[@id='startButton']"));
        start.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String result = text.getText();
        System.out.println(result);
        //System.out.println(text.getText());

    }
}