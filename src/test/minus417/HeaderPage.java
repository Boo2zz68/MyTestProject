package minus417;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage extends AbstractTest {
    @Test
    @Description("Проверка корректности телефона")
    @Severity(SeverityLevel.TRIVIAL)
    void numberTelephone() {
        HomePage homePage = new HomePage(getDriver());
        String number = homePage.getNumber().getText();
        Assertions.assertEquals(number, "8 (800) 333-20-18");
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
}
