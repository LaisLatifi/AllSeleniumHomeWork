package Class3;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 extends CommonMethods {
    /*
    HW2:
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       WebElement userName= driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
         WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
         Thread.sleep(2000);
       loginButton.click();
     WebElement error= driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
     if(error.getText().equals("Password cannot be empty")){
         System.out.println("Has error message");
     }else {
         System.out.println("No error message");
     }


    }
}
