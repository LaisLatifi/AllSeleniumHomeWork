package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW02 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
         /*
   HW2:
goto https://chercher.tech/practice/frames

click on check box
then select bay cat from drop down
then enter text in text box
     */

String url="https://chercher.tech/practice/frames";
String browser="chrome";
openBrowserAndLaunchApplication(url,browser);

        //switch to iframe
        driver.switchTo().frame("frame1"); //?
        driver.switchTo().frame("frame3");

//find the element of checkBox and click
        WebElement checkBx=driver.findElement(By.xpath("//input[@id='a']"));
        checkBx.click();

// focus to main
        driver.switchTo().defaultContent();

        // select babe cat from dropdown
        driver.switchTo().frame(1); //?
        WebElement bb=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(bb);
        sel.selectByVisibleText("Baby Cat");

        // focus to main
        driver.switchTo().defaultContent();

// switch to the focus to text box
        driver.switchTo().frame("frame1");
WebElement textBox=driver.findElement(By.xpath("//input"));
textBox.sendKeys("Hello");
        Thread.sleep(2000);







    }
}
