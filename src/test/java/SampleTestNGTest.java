
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleTestNGTest {

    @Test // 1 TS

    public void sampleMethod() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/");

        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("enterimg")).click();

        System.out.println("first testscript");
        driver.close();
    }

    
    @Test // TS 4

    public void registerUserOnDemoQa() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // Navigate to the demo website
        driver.get("https://demoqa.com/automation-practice-form");

        // Find the elements and fill in the form
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Reshma");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Chavan");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("johndoe@example.com");

        WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        gender.click();

        WebElement mobile = driver.findElement(By.id("userNumber"));
        mobile.sendKeys("1234567890");

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.sendKeys("01 Apr 2000");

         WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Computer Science");
        subjects.click();
        Thread.sleep(300);

        WebElement hobbies = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
        hobbies.click();

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("123 Main St, Anytown, USA");

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println("user register successfully");

        // Close the browser
        driver.quit();
    }

    @Test // TS 2
    public void m2() {
        System.out.println("second testScript");

    }

    @Test // TS3

    public void openGoogleBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("open google URL");
        driver.close();
    }

    @Test
    public void handlingAlert(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

         
    //    WebElement clickOnAlertBtn=driver.findElement(By.xpath("//div[contains(text(), 'Alerts, Frames & Windows')]"));
    //    clickOnAlertBtn.click();



    }

}
