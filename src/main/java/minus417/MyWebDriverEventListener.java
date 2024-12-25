package minus417;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyWebDriverEventListener implements WebDriverListener {

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("I want to find element: " + by.toString());
    }
}
