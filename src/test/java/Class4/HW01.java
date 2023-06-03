package Class4;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW01 extends CommonMethods {
    /*
    HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one

     */
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver=new ChromeDriver();
       // driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
     //  WebElement select= driver.findElement(By.xpath("//select[@class='form-control']"));
      // select.click();
String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
String browser="chrome";
openBrowserAndLaunchApplication(url,browser);

WebElement weekDays=driver.findElement(By.xpath("/]/select[@class='form-control'"));
Select sel=new Select(weekDays);

sel.selectByVisibleText("Tuesday");
Thread.sleep(2000);

        sel.selectByIndex(5);
Thread.sleep(2000);

        sel.selectByValue("Friday");

    }
}
