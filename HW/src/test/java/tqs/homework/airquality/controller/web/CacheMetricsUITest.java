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
import org.openqa.selenium.edge.EdgeDriver;
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
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void showCacheMetrics() {
        driver.get("http://localhost:3000");
        driver.manage().window().setSize(new Dimension(1920, 985));
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cache")));
        }
        driver.findElement(By.linkText("Cache")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
        }
        assertThat(driver.findElement(By.cssSelector(".mt-md-0 b")).getText(), is("Total Hits"));
        assertThat(driver.findElement(By.cssSelector(".mt-lg-0 b")).getText(), is("Total Misses"));
        assertThat(driver.findElement(By.cssSelector(".col-lg-12 b")).getText(), is("Total Requests"));
        driver.findElement(By.linkText("HW")).click();
        driver.findElement(By.linkText("Cache")).click();
        assertThat(driver.findElement(By.cssSelector(".mt-md-0 b")).getText(), is("Total Hits"));
        assertThat(driver.findElement(By.cssSelector(".mt-lg-0 b")).getText(), is("Total Misses"));
        assertThat(driver.findElement(By.cssSelector(".col-lg-12 b")).getText(), is("Total Requests"));
    }

    public static class IndexUITest {

        private WebDriver driver;

        @BeforeEach
        public void setUp() {
            System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        @AfterEach
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void indexUITest() {
            driver.get("http://localhost:3000");
            driver.manage().window().setSize(new Dimension(1920, 985));
            assertThat(driver.findElement(By.cssSelector("a > span")).getText(), is("HW"));
            assertThat(driver.findElement(By.linkText("Cache")).getText(), is("Cache"));
            assertThat(driver.findElement(By.id("select2-city-container")).getText(), is("City"));
        }
    }
}
