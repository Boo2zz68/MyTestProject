package minus417;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage extends AbstractTest {
    @Test
    @Description("Проверка корректности телефона")
    @Severity(SeverityLevel.TRIVIAL)
    void numberTelephone() {
            HomePage homePage = new HomePage(getDriver());
        try {
            String number = homePage.getNumber().getText();
            Assertions.assertEquals(number, "8 (800) 333-20-18");
        } catch (NoSuchElementException e) {
            MyUtils.makeScreenshot(getDriver(), "Скрин ошибки.png");
        }

    }
    @Test
    @Description("Переход на вкладку Философия бренда")
    @Severity(SeverityLevel.NORMAL)
    void brandPhilosophy() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getPhilosophy())
                .build()
                .perform();
        String nameHost = getDriver().getCurrentUrl();
        String textbrandPhilosophy = homePage.getPhilosophy().getText();
        Assertions.assertEquals(textbrandPhilosophy, "ФИЛОСОФИЯ БРЕНДА");
        Assertions.assertEquals(nameHost, "https://minus417ru.com/brand/");
    }
    @Test
    @Description("Переход на вкладку Новости")
    @Severity(SeverityLevel.NORMAL)
    void news() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getNews())
                .build()
                .perform();
        String urlNewsButton = getDriver().getCurrentUrl();
        String textNews = homePage.getNews().getText();
        Assertions.assertEquals(urlNewsButton, "https://minus417ru.com/blog/news/");
        Assertions.assertEquals(textNews, "НОВОСТИ");
    }
    @Test
    @Description("Переход на вкладку Доставка")
    @Severity(SeverityLevel.NORMAL)
    void delivery() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getDelivery())
                .build()
                .perform();
        String urlDeliveryButton = getDriver().getCurrentUrl();
        String textDelivery = homePage.getDelivery().getText();
        Assertions.assertEquals(urlDeliveryButton, "https://minus417ru.com/info/delivery/");
        Assertions.assertEquals(textDelivery, "ДОСТАВКА");
    }
    @Test
    @Description("Переход на вкладку Контакты")
    @Severity(SeverityLevel.NORMAL)
    void contact() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getContact())
                .build()
                .perform();
        String urlContactButton = getDriver().getCurrentUrl();
        String textContact = homePage.getContact().getText();
        Assertions.assertEquals(urlContactButton, "https://minus417ru.com/contact/");
        Assertions.assertEquals(textContact, "КОНТАКТЫ");
    }
    @Test
    @Description("Переход на вкладку Оплата")
    @Severity(SeverityLevel.NORMAL)
    void info() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getInfo())
                .build()
                .perform();
        String urlInfoButton = getDriver().getCurrentUrl();
        String textInfo = homePage.getInfo().getText();
        Assertions.assertEquals(urlInfoButton, "https://minus417ru.com/info/");
        Assertions.assertEquals(textInfo, "ОПЛАТА");
    }
    @Test
    @Description("Переход на вкладку Корзина + счетчик товаров")
    @Severity(SeverityLevel.NORMAL)
    void basket1() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getBasket1())
                .build()
                .perform();
        String urlBasket1 = getDriver().getCurrentUrl();
        String textBasket1 = homePage.getBasket1().getText();
        Assertions.assertEquals(urlBasket1, "https://minus417ru.com/personal/cart/");
        Assertions.assertEquals(textBasket1, "0 руб.");
    }
    @Test
    @Description("Переход на вкладку Корзина по ярлыку")
    @Severity(SeverityLevel.NORMAL)
    void basket2() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getBasket2())
                .build()
                .perform();
        String urlBasket2 = getDriver().getCurrentUrl();
        String textBasket2 = homePage.getBasket2().getText();
        Assertions.assertEquals(urlBasket2, "https://minus417ru.com/personal/cart/");
        Assertions.assertEquals(textBasket2, "0 руб.");
    }
    @Test
    @Description("Проверка поиска: поле ввода + кнопка")
    @Severity(SeverityLevel.NORMAL)
    void searchInput() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getSearchInput())
                .sendKeys("крем")
                .click(homePage.getSearchButton())
                .build()
                .perform();
        String searchInput = getDriver().getCurrentUrl();
        Assertions.assertEquals(searchInput, "https://minus417ru.com/search/?q=%D0%BA%D1%80%D0%B5%D0%BC&s=");
    }
    @Test
    @Description("Переход на вкладку Новинки")
    @Severity(SeverityLevel.NORMAL)
    void newItems() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getNewItems())
                .build()
                .perform();
        String urlNewItems = getDriver().getCurrentUrl();
        String textNewItems = homePage.getNewItems().getText();
        Assertions.assertEquals(urlNewItems, "https://minus417ru.com/new/");
        Assertions.assertEquals(textNewItems, "Новинки");
    }
    @Test
    @Description("Переход на вкладку Бестселлер")
    @Severity(SeverityLevel.NORMAL)
    void bestseller() {
        HomePage homePage = new HomePage(getDriver());
        Actions action = new Actions(getDriver());
        action
                .click(homePage.getBestseller())
                .build()
                .perform();
        String urlBestseller = getDriver().getCurrentUrl();
        String textBestseller = homePage.getBestseller().getText();
        Assertions.assertEquals(urlBestseller, "https://minus417ru.com/hit/");
        Assertions.assertEquals(textBestseller, "Бестселлеры");
    }
}
