package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQAAutomation {

    public static void main(String[] args) {
        // 1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open URL.
        driver.get("https://courses.ultimateqa.com/");

        // 3. Print the title of the page.
        System.out.println("Title: " + driver.getTitle());

        // 4. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Click on ‘Sign In’ link.
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        // 7. Print the current URL.
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 8. Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("your_email@example.com");

        // 9. Enter the password to the password field.
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("your_password");

        // 10. Click on Login Button.
        WebElement loginButton = driver.findElement(By.name("commit"));
        loginButton.click();

        // 11. Navigate to baseUrl.
        driver.get("https://courses.ultimateqa.com/");

        // 12. Navigate forward to Homepage.
        driver.navigate().forward();

        // 13. Navigate back to baseUrl.
        driver.navigate().back();

        // 14. Refresh the page.
        driver.navigate().refresh();

        // 15. Close the browser.
        driver.quit();
    }
}
