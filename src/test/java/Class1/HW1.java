package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

         /*
        HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
[19:18]
Note: use name or id as locators
         */

        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Lais M");
        driver.findElement(By.id("customer.lastName")).sendKeys("latifi");
        driver.findElement(By.id("customer.address.street")).sendKeys("4451 Gate Way park");
        driver.findElement(By.id("customer.address.city")).sendKeys("Bay Area");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("95959");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-4567-34");
        driver.findElement(By.id("customer.username")).sendKeys("LaisM");
        driver.findElement(By.id("customer.password")).sendKeys("itIsPassword");
        driver.findElement(By.id("repeatedPassword")).sendKeys("confirmPassword");
        Thread.sleep(10000);
        driver.quit();



    }
    }

