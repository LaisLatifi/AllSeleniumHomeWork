package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
                /*
        @here HW:
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM

from the table choose any ID
and print out the row number of that id

please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly
         */

        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement logIn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        logIn.click();

        WebElement pimBtn=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();
        //id=54477A





    }
}


