package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/i";
        String browser="url";
        openBrowserAndLaunchApplication(url, browser);

        //
       WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
       userName.sendKeys("Admin");
       WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
       password.sendKeys("Hum@nhrm123");
       WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
loginBtn.click();


WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
pim.click();
        WebElement addEmployee=driver.findElement(By.xpath("//a[text()='Add Employee']"));
addEmployee.click();

WebElement addName=driver.findElement(By.xpath("//input[@id='firstName']"));
addName.sendKeys("Yass");

Thread.sleep(5000);
        WebElement id=driver.findElement(By.xpath("//input[@id='employeeId']"));
        id.sendKeys("456456");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Tanha");



    }
}
