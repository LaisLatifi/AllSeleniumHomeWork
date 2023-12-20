package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //enter login
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        //enter password
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        //click login
        WebElement loginbtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginbtn.click();
        //click PIM
        WebElement pimbtn=driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pimbtn.click();

        //find ID 56363A-
        List<WebElement> allids=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        for (int i = 0; i <allids.size() ; i++) {
            String id= allids.get(i).getText();
            if(id.equals("56363A")){
                System.out.println("The id is: " +id + " the row number is : " + (i+1));
            }
        }
    }

    }

