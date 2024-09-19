import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DefaultSuiteTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void explorationtest() {

        driver.get("https://www.deepl.com/fr/translator");

        WheelInput.ScrollOrigin origin = WheelInput.ScrollOrigin.fromViewport(0, 0);
        new Actions(driver).scrollFromOrigin(origin, 0, 0);

        driver.findElement(By.cssSelector(".ProductNavigation-module--container--34e1a")).click();

        driver.findElement(By.id("document-tab-heading")).click();

        driver.findElement(By.id("text-tab-heading")).click();

        {
            WebElement element = driver.findElement(By.id("text-tab-heading"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }

        driver.findElement(By.cssSelector(".min-h-0 > div:nth-child(1)")).click();

        {
            WebElement element = driver.findElement(By.cssSelector(".min-h-0 > div:nth-child(1)"));
        }
    }
}