import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Authorization extends AbstractTest {
    //static Logger logger = LoggerFactory.getLogger(Authorization.class);
    @Test
    void switchToPersonalAccount() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains("https://minus417ru.com/"));
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//*[name()='path' and contains(@d,'M20.188 21')]")))
                .build()
                .perform();

        }
        /*
         action
                .click(getDriver().findElement(By.xpath("//input[@name='PHONE_LOGIN_EMAIL']")))
                .sendKeys("Невалидный логин")
                .click(getDriver().findElement(By.xpath("//div[@class='bxmaker-authuserphone-enter-auth-by-password-form']//div[@class='bxmaker-authuserphone-button__inner']")))
                .build()
                .perform();
        Thread.sleep(1000);
         */
    }



