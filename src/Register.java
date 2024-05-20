import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","Test Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:3000/");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create account']")));
        button.click();
        WebElement fill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[1]/div[1]/input")));
        fill.sendKeys("testuser1231@gmail.com");
        fill = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[1]/div[2]/input"));
        fill.sendKeys("Test User 1231");
        fill = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[1]/div[3]/input"));
        fill.sendKeys("password");
        button = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/button"));
        button.click();
        URL = driver.getCurrentUrl();

        //check register success
        if(!URL.equals("http://127.0.0.1:3000/signup")){
            System.out.println("Register failed");
            System.out.println("Current URL:"+URL);
        }
    }
}
