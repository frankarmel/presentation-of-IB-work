import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;


public class DefaultSuiteTest {
    private WebDriver driver;
    JavascriptExecutor js;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() {
        // Test name: test1
        // Step # | name | target | value
        // 1 | open | /fr/translator |
        driver.get("https://www.deepl.com/fr/translator");
        // 2 | runScript | window.scrollTo(0,0) |
       js.executeScript("window.scrollTo(0,0)");
        // 3 | click | css=.ProductNavigation-module--container--34e1a |
        driver.findElement(By.cssSelector(".ProductNavigation-module--container--34e1a")).click();
        // 4 | click | id=document-tab-heading |
        driver.findElement(By.id("document-tab-heading")).click();
        // 5 | click | id=text-tab-heading |
        driver.findElement(By.id("text-tab-heading")).click();
        // 6 | mouseOver | id=text-tab-heading |
        {
            WebElement element = driver.findElement(By.id("text-tab-heading"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 7 | mouseOut | id=text-tab-heading |
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        // 8 | click | css=.min-h-0 > div:nth-child(1) |
        driver.findElement(By.cssSelector(".min-h-0 > div:nth-child(1)")).click();
        // 9 | editContent | css=.min-h-0 > div:nth-child(1) | <p _d-id="4">test</p>
        {
            WebElement element = driver.findElement(By.cssSelector(".min-h-0 > div:nth-child(1)"));
            js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<p _d-id=\"4\">test</p>'}", element);
        }
    }
}