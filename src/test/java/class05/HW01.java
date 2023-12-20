package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



/*
   http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: don't worry if the text u send doesn't appear up in the textbox
    */
public class HW01 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url=" http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //find element of the button and click
WebElement alertBtn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
alertBtn.click();

// slow down
        Thread.sleep(4000);

// change focus and send keys in alert Box
 Alert confirmationAlert=driver.switchTo().alert();
 confirmationAlert.sendKeys("I love learning");
 confirmationAlert.accept();
 // close
        driver.quit();
    }
}
