import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoSiteDemo {

    public void method1() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("user-name"));

        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));

        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginButton.click();

    }

}
