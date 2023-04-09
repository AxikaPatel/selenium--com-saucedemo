package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultipleBrowser_SauceDemo
{
    static String browser = "Edge";
    static WebDriver driver;


    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("FireFox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name ");
        }

        //Open the URl into Browser
        driver.get("https://www.saucedemo.com");

        //Minimise Browser
        driver.manage().window().maximize();

        //Get implicit wait Time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the page
        System.out.println("Title of the page \t\t :" + driver.getTitle());

        //Get the current URL
        System.out.println("Current URL  \t\t\t : " + driver.getCurrentUrl());

        //Get the page URL
        String pageUrl = driver.getPageSource();
        System.out.println("Page URL :  \t\t\t :" + pageUrl);

        //Find the email field
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("problem_user");

        //Find the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //Close Browser
        driver.close();

    }
}
