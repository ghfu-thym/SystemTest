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

        //Main button
        WebElement profileButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/span[3]/button"));
        WebElement findEventButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/span[2]/ul/li[1]/a"));
        WebElement hostEventButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/span[2]/ul/li[2]/a"));
        WebElement myEventButton = driver.findElement(By.xpath("/html/body/div/div/div[1]/span[2]/ul/li[3]/a"));

        // profile page
        profileButton.click();

        URL = driver.getCurrentUrl();
        if(!URL.equals("http://localhost:3000/profile")){
            System.out.println("cannot access profile");
            System.out.println("current URL:"+URL);
        }

        // ****edit profile page
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/button"));
        button.click();

        //save edited profile
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/button[1]"));

        //cancel edit profile
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/button[2]"));

        // fill profile
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/textarea"));
        System.out.println(driver.getTitle());

        // button edit information
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/button"));

        //button save edited information
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/button[1]"));

        //button cancel edit information
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/button[2]"));

        //fill information?

        // button edit contact links
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/button"));

        //fill contact link?

        //logout button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/span[2]/button"));

        // ****find event page

        //startTime button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/nav/div/span[1]/div/input"));

        // End time button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/nav/div/span[2]/span/input"));

        // fill location
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/nav/div/span[3]/span/input"));

        // fill event name
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/nav/div/span[4]/span/input"));

        // search event button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/nav/div/div/button"));

        //join event button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[2]/button"));



        //*** host event page

        //fill event name
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[1]/span/input"));

        // fill start time
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[2]/span[1]/input"));

        //fill end time
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[2]/span[2]/input"));

        //fill location
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[3]/span[1]/input"));

        //fill member limit
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[3]/span[2]/input"));

        // fill event description
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[4]/span/textarea"));

        // create button event
        fill = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[5]/button"));


        //***my event page
        // all event button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));

        //upcoming event button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]"));

        // past event button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]"));

        // ongoing event button
        button = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[4]"));




    }
}