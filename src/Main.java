import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\Finder\\Test Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:3000/");
        //WebElement checkBtn = driver.findElement(By.xpath("//button[@value='About us']"));
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement checkBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create account']")));
        checkBtn.click();
        WebElement fill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));
        fill.sendKeys("aebfrughoursg");
        fill = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        fill.sendKeys("ersgtdtd");
        fill = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        fill.sendKeys("siebisrgsrg");
        fill = driver.findElement(By.xpath("//input[@placeholder='Confirm password']"));
        fill.sendKeys("siebisrgsrgsrg");
        System.out.println(driver.getTitle());

    }
}