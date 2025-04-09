import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstagramSearch {
    @Test
    void testSearch() throws InterruptedException {
    System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.instagram.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);

    WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input"));
    username.sendKeys("newmanc3gen@gmail.com");
    Thread.sleep(2000);

    WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input"));
    password.sendKeys("ArianaDevin2020@?");
    Thread.sleep(2000);

    WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button"));
    login.click();
    Thread.sleep(15000);

    WebElement notNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div"));
    notNow.click();
    Thread.sleep(5000);

    WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div/div[2]/div/div/span/span"));
    search.click();
    Thread.sleep(2000);

    WebElement searchInput = driver.findElement(By.cssSelector(".x1lugfcp"));
    searchInput.sendKeys("gordongram");
    Thread.sleep(2000);

    WebElement firstResult = driver.findElement(By.cssSelector("a[href='/gordongram/']"));
    firstResult.click();
    Thread.sleep(2000);

    driver.quit();
    }

    @Test
    void clearSearch() throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input"));
        username.sendKeys("newmanc3gen@gmail.com");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input"));
        password.sendKeys("ArianaDevin2020@?");
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button"));
        login.click();
        Thread.sleep(15000);

        WebElement notNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div"));
        notNow.click();
        Thread.sleep(5000);

        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div/div[2]/div/div/span/span"));
        search.click();
        Thread.sleep(2000);

        WebElement clearSearch = driver.findElement(By.cssSelector(".x16n37ib > div:nth-child(1) > div:nth-child(1) > svg:nth-child(1)"));
        clearSearch.click();
        Thread.sleep(2000);
    }

    @Test
    void searchAndScroll() throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input"));
        username.sendKeys("newmanc3gen@gmail.com");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input"));
        password.sendKeys("ArianaDevin2020@?");
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button"));
        login.click();
        Thread.sleep(15000);

        WebElement notNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div"));
        notNow.click();
        Thread.sleep(5000);

        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div/div[2]/div/div/span/span"));
        search.click();
        Thread.sleep(2000);

        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/div/input"));
        searchInput.sendKeys("lamborghini");
        Thread.sleep(2000);

        WebElement searchResult = driver.findElement(By.cssSelector("a[href='/explore/search/keyword/?q=lamborghini']"));
        searchResult.click();
        Thread.sleep(5000);

        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scrollBy(0, 300)");
        Thread.sleep(2000);

        driver.quit();
    }
}
