package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tests {
    public static void main(String[] args) {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\IdeaProjects\\WebTestAutomation\\src\\test\\resources\\webDrivers\\msedgedriver.exe");
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google website
            driver.get("https://www.google.co.in/");
            // Wait for some seconds to load the page
            Thread.sleep(15000);

            // Find the About hyperlink
            WebElement About = driver.findElement(By.linkText("About"));

            // Clicking the About hyperlink
            About.click();
            Thread.sleep(10000);
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
