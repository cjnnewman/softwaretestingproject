import org.openqa.selenium.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InstagramSearch {

    WebDriver driver = new FirefoxDriver();

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        System.out.println("=== BeforeTest: Launching Browser ===");
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

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
    }

    @Test(priority = 1)
    void testSearch() throws InterruptedException {
        //System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div/div[2]/div/div/span/span"));
        search.click();
        Thread.sleep(2000);

        WebElement searchInput = driver.findElement(By.cssSelector(".x1lugfcp"));
        searchInput.sendKeys("gordongram");
        Thread.sleep(2000);

        WebElement firstResult = driver.findElement(By.cssSelector("a[href='/gordongram/']"));
        firstResult.click();
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    void clearSearch() throws InterruptedException {
        //System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/span/div/a/div/div[2]/div/div/span/span"));
        search.click();
        Thread.sleep(2000);

        WebElement clearSearch = driver.findElement(By.cssSelector(".x16n37ib > div:nth-child(1) > div:nth-child(1) > svg:nth-child(1)"));
        clearSearch.click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    void searchAndScroll() throws InterruptedException {
        //System.setProperty("webdriver.firefox.driver", "C:\\Users\\newma\\Documents\\selenium_drivers\\geckodriver-v0.35.0-win32\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

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

    }

    @AfterTest
    public void afterTest() {
        System.out.println("=== AfterTest: Closing Browser ===");
        if (driver != null) {
            driver.quit();
        }
    }
}
