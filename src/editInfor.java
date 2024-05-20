import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class editInfor {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","Test Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:3000/");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/nav/div[3]/span/span/button")));
        button.click();
        WebElement fill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[1]/input")));
        fill.sendKeys("dat46004@gmail.com");
        fill = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[2]/input"));
        fill.sendKeys("password");
        button = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/button"));
        button.click();
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/span[3]/button")));
        profileButton.click();
        button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/button")));
        button.click();
        WebElement fillInfor = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/textarea"));
        fillInfor.sendKeys("anything");
        WebElement saveButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/button[1]"));
        saveButton.click();
        // logout
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/span[2]/button"));
        button.click();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

    }
}
