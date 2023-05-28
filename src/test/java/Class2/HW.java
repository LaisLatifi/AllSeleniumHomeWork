package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     /*
     //only use XPATH //navigate to fb.com
    click on create new account fill up all the textBoxes
    close the popup             AQ
    close the browser
    Note : in order for ur code to work u have to put Thread.sleep(2000) after clicking on
    Create new account what is the reason, will discuss in next lecture
     */
public class HW {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.manage().window().maximize();
            WebElement createAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
            createAccount.click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("Lais");
            driver.findElement(By.xpath("//input[@aria-label= 'Last name']")).sendKeys("Latifi");
            driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("mudaser1992@gmail.com");
            driver.findElement(By.xpath("//input[@aria-label = 'Re-enter email']")).sendKeys("mudaser1992@gmail.com");
            driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("9162619422");
            driver.findElement(By.xpath("//select[@id ='month']")).sendKeys("jan");
            driver.findElement(By.xpath("//select[@title= 'Day']")).sendKeys("03");
            driver.findElement(By.xpath("//select[@aria-label= 'Year']")).sendKeys("1992");
            WebElement gender = driver.findElement(By.xpath("//label[text()= 'Male']"));
            gender.click();
            Thread.sleep(3000);
            WebElement closePopUp = driver.findElement(By.xpath("//img[@class='_8idr img']"));
            closePopUp.click();
            Thread.sleep(1000);
            driver.quit();
        }
        }


