package Class4;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW02 extends CommonMethods {

/*
HW02
goto https://www.facebook.com
 click on create account
and select the your  date of birth using select class
*/
public static void main(String[] args) throws InterruptedException {

    String url="https://www.facebook.com";
String browser="chrome";
openBrowserAndLaunchApplication(url,browser);

driver.manage().window().maximize();
WebElement DoB=driver.findElement(By.xpath( " //a[text()='Create new account']"));
DoB.click();

Thread.sleep(2000);
WebElement month=driver.findElement(By.cssSelector("select#month"));
  Select selMonth=new Select(month);
    selMonth.selectByVisibleText("Feb");

    // selwct method with css to select day
  WebElement day=driver.findElement(By.cssSelector("select#day"));
  Select Day=new Select(day);
  Day.selectByValue("3");

  //select  method css for year

  WebElement year=driver.findElement(By.cssSelector("select#year"));
Select Year=new Select(year);
  Year.selectByVisibleText("1993");

 // driver.quit();








}
}
