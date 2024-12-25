package minus417;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends AbstractPage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getEmptyBasket() {
        return emptyBasket;
    }
    @FindBy(xpath = "//h3[contains(text(),'Ваша корзина пуста')]")
    private WebElement emptyBasket;
}
