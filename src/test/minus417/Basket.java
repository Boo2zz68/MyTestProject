package minus417;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

public class Basket extends AbstractTest{
    @Test
    @Description("Отображение элемента Ваша корзина пуста")
    @Severity(SeverityLevel.TRIVIAL)
    void emptyBasket() {
        HomePage homePage = new HomePage(getDriver());
        BasketPage basketPage = new BasketPage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getBasket1())
                .build()
                .perform();
        action
                .moveToElement(basketPage.getEmptyBasket())
                .build()
                .perform();
        String textEmptyBasket = basketPage.getEmptyBasket().getText();
        Assertions.assertEquals(textEmptyBasket, "Ваша корзина пуста");
    }
    @Test
    @Description("Переход на главную страницу")
    @Severity(SeverityLevel.TRIVIAL)
    void clickLogo() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getBasket1())
                .build()
                .perform();
        action
                .click(homePage.getLogo())
                .build()
                .perform();
        String urlClickLogo = getDriver().getCurrentUrl();
        Assertions.assertEquals(urlClickLogo, "https://minus417ru.com/");
    }
}
