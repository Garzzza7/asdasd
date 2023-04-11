package tqs.homework.airquality.controller.web;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.seljup.BrowserType.CHROME;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.seljup.DockerBrowser;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CacheMetricsUITest {

    private WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }
    WebDriver drover;


    @Test
    void test(){
        /*
        System.setProperty("webdriver.chrome.driver", "src\\test\\chromedriver.exe");
        drover = new ChromeDriver();
        drover.manage().window().maximize();
         */
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void chromeSession(ChromeDriver driver) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\piotr\\Desktop\\sele\\chromedriver.exe");
        WebDriver wd =new ChromeDriver();
        String baseUrl = "https://www.google.com";
        wd.get(baseUrl);
    }

    @Test
    public void showCacheMetrics() {
        driver.get("http://localhost:3000");
        driver.manage().window().setSize(new Dimension(1920, 985));
        {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cache")));
        }
        driver.findElement(By.linkText("Cache")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
        }
        assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("CACHE"));
        assertThat(driver.findElement(By.cssSelector(".mt-2")).getText(), is("CHECK SOME VALUES ABOUT HIT AND MISS REQUESTS"));
        assertThat(driver.findElement(By.cssSelector(".mt-md-0 b")).getText(), is("Total Hits"));
        assertThat(driver.findElement(By.cssSelector(".mt-lg-0 b")).getText(), is("Total Misses"));
        assertThat(driver.findElement(By.cssSelector(".col-lg-12 b")).getText(), is("Total Requests"));
        driver.findElement(By.linkText("Air Quality App")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-lg-4:nth-child(3) a")));
        }
        driver.findElement(By.cssSelector(".col-lg-4:nth-child(3) a")).click();
        driver.findElement(By.linkText("Cache Statistics")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")
            ));
        }
        assertThat(driver.findElement(By.cssSelector(".mt-2")).getText(), is("CHECK SOME VALUES ABOUT HIT AND MISS REQUESTS"));
        assertThat(driver.findElement(By.cssSelector(".mt-md-0 b")).getText(), is("Total Hits"));
        assertThat(driver.findElement(By.cssSelector(".mt-lg-0 b")).getText(), is("Total Misses"));
        assertThat(driver.findElement(By.cssSelector(".col-lg-12 b")).getText(), is("Total Requests"));
        assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("CACHE STATISTICS"));
    }

    public static class IndexUITest {

        private WebDriver driver;

        @BeforeEach
        public void setUp() {
            driver = new ChromeDriver();
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void indexUITest() {
            driver.get("http://127.0.0.1:8080/");
            driver.manage().window().setSize(new Dimension(1920, 985));
            assertThat(driver.findElement(By.cssSelector("a > span")).getText(), is("Air Quality App"));
            assertThat(driver.findElement(By.linkText("By City")).getText(), is("By City"));
            assertThat(driver.findElement(By.linkText("By Day")).getText(), is("By Day"));
            assertThat(driver.findElement(By.linkText("Cache Statistics")).getText(), is("Cache Statistics"));
            assertThat(driver.findElement(By.id("select2-city-container")).getText(), is("Search city"));
            {
                WebDriverWait wait = new WebDriverWait(driver, 30);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
            }
            assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("FEATURES"));
            assertThat(driver.findElement(By.cssSelector("p")).getText(), is("CHECK THE FEATURES"));
            assertThat(driver.findElement(By.linkText("Air Metrics By City")).getText(), is("Air Metrics By City"));
            assertThat(driver.findElement(By.linkText("Air Metrics By City and Day")).getText(), is("Air Metrics By City and Day"));
            assertThat(driver.findElement(By.cssSelector(".col-lg-4:nth-child(3) a")).getText(), is("Cache Statistics"));
            assertThat(driver.findElement(By.cssSelector(".copyright")).getText(), is("© 2020 - Developed with by Vasco Ramos"));
        }
    }
}
