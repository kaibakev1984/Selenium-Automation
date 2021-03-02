import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderContainer {
    private WebDriver driver;

    public HeaderContainer(WebDriver driver) {
        this.driver = driver;
    }

    public String getPhoneNumber() {
        WebElement shopPhoneElement = driver.findElement(By.className("shop-phone"));
        WebElement phoneElement = shopPhoneElement.findElement(By.tagName("strong"));
        return phoneElement.getText();
    }
}
