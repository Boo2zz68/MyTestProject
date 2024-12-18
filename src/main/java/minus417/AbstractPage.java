package minus417;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    //Поиск элементов в дом-структуре происходит только в момент их вызова! "лениво"
    private WebDriver driver;
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected WebDriver getDriver() {
        return this.driver;
    }
}
