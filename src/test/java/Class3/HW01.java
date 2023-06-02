package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    /*
    HW1:
    use xPath
Open Chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php
fill in the complete form
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
driver.manage().window().maximize();

        // fill in first name using xpath
        WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Lais");

        // fill in last name using xpath
        WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("latifi");

        //fill in email using xpath
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("mudaser1992@gmail.com");

        //
        WebElement phone=driver.findElement(By.xpath("//input[@data-bv-field='phone']"));
        phone.sendKeys("916-261-2222");

        WebElement address=driver.findElement(By.xpath("//input[@data-bv-field='address']"));
        address.sendKeys("4451 gate way");

        WebElement city=driver.findElement(By.xpath("//input[@placeholder='city']"));
        city.sendKeys("Sacramento");

        WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
        state.sendKeys("California");

        Thread.sleep(2000);

        WebElement zip=driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys("98223");

        WebElement website=driver.findElement(By.xpath("//input[@placeholder='Website or domain name']"));
        website.sendKeys("http://practice.syntaxtechs.net");

        WebElement hosting=driver.findElement(By.xpath("//input[@value='yes']"));
        hosting.click();

        WebElement comment=driver.findElement(By.xpath("//textarea[@name='comment']"));
        comment.sendKeys("Selenium Magic");

        WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        submit.click();
        Thread.sleep(3000);

        driver.quit();










    }
}
