import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class testAutomationPractice {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void testGetPhoneNumber() {
        WebElement shopPhoneElement = driver.findElement(By.className("shop-phone"));
        WebElement phoneElement = shopPhoneElement.findElement(By.tagName("strong"));
        String text = phoneElement.getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assertEquals("0123-456-789", text);
    }

    @After
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }

}
