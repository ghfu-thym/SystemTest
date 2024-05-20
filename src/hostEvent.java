import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class hostEvent {
    public static void main(String[] args){

        //init
        System.setProperty("webdriver.chrome.driver","Test Tools\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:3000/");

        //login
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

        //host event
        WebElement hostEventButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/span[2]/ul/li[2]/a")));
        hostEventButton.click();
        WebElement eventName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/span/input"));
        eventName.sendKeys("event name");
        WebElement startTime = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[2]/span[1]/input"));
        startTime.click();
        startTime.sendKeys("15/05/202505/05/51/SA");
        WebElement endTime = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[2]/span[2]/input"));
        endTime.click();
        endTime.sendKeys("15/05/202515/05/51/SA");
        WebElement location = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[3]/span[1]/input"));
        location.sendKeys("Hanoi, Vietnam");
        WebElement memberLimit = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[3]/span[2]/input"));
        memberLimit.sendKeys("10");
        WebElement description = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[4]/span/textarea"));
        description.sendKeys("des");
        WebElement create = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[5]/button"));
        create.click();
        WebElement cofirm = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[5]/button[1]"));
        cofirm.click();
    }
}
