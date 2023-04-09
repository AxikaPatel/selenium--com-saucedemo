package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_Saucedemo
{
    public static void main(String[] args)
    {
        //Launch the chrome driver
        WebDriver driver = new ChromeDriver();

        //Open URL
        String baseUrl = "https://www.saucedemo.com";
        driver.get(baseUrl);

        //Maximize the browser
        driver.manage().window().maximize();

        //Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title page
        System.out.println("Title of page \t\t :" + driver.getTitle());

        //Get the current page
        String currentPage = driver.getCurrentUrl();
        System.out.println("Current page \t\t : " + currentPage);

        //Get the pageURL
        System.out.println("Page URL  \t\t :" + driver.getPageSource());

        //Find the email field
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("locked_out_user");

        //Find the password field
        driver.findElement(By.name("password")).sendKeys("A123bc@");


        //close browser
        driver.close();


    }
}
