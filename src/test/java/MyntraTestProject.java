import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyntraTestProject {


    @Test

    public void OpenBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

       // Thread.sleep(5000);

    }

    @Test

    public void searchProductAndAddToCart() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

        Thread.sleep(5000);

        WebElement searchtab = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
        searchtab.sendKeys("sneakers", Keys.ENTER);
        Thread.sleep(6000);

        WebElement womenRadioButton = driver.findElement(By.xpath("//label[contains(text(),\"Women\")]"));
        womenRadioButton.click();

        Thread.sleep(5000);

        WebElement shoesSneaker = driver.findElement(By.xpath("//ul[@class='results-base']/li[1]/a"));
        shoesSneaker.click();

        Thread.sleep(5000);

        Select sizeDropdown = new Select(driver.findElement(
                By.xpath("//div[@class='size-buttons-size-buttons']/button[contains(text(),'Select Size')]")));
        sizeDropdown.selectByVisibleText("9");

        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'ADD TO BAG')]"));
        addToCartButton.click();

    }

}
