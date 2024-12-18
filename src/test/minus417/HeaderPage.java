package minus417;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage extends AbstractTest {
    @Test
    void numberTelephone() {
        String number = getDriver().findElement(By.xpath("//a[@title='8 (800) 333-20-18']")).getText();
        Assertions.assertEquals(number, "8 (800) 333-20-18");
    }
    @Test
    void brandPhilosophy() {
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//a[@title='Философия бренда']")))
                .build()
                .perform();
        String nameHost = getDriver().getCurrentUrl();
        String textbrandPhilosophy = getDriver().findElement(By.xpath("//a[@title='Философия бренда']")).getText();
        Assertions.assertEquals(textbrandPhilosophy, "ФИЛОСОФИЯ БРЕНДА");
        Assertions.assertEquals(nameHost, "https://minus417ru.com/brand/");
    }
    @Test
    void news() {
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Новости'][contains(text(),'Новости')]")))
                .build()
                .perform();
        String urlNewsButton = getDriver().getCurrentUrl();
        String textNews = getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Новости'][contains(text(),'Новости')]")).getText();
        Assertions.assertEquals(urlNewsButton, "https://minus417ru.com/blog/news/");
        Assertions.assertEquals(textNews, "НОВОСТИ");
    }
    @Test
    void delivery() {
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Доставка'][contains(text(),'Доставка')]")))
                .build()
                .perform();
        String urlDeliveryButton = getDriver().getCurrentUrl();
        String textDelivery = getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Доставка'][contains(text(),'Доставка')]")).getText();
        Assertions.assertEquals(urlDeliveryButton, "https://minus417ru.com/info/delivery/");
        Assertions.assertEquals(textDelivery, "ДОСТАВКА");
    }
    @Test
    void contact() {
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Контакты'][contains(text(),'Контакты')]")))
                .build()
                .perform();
        String urlContactButton = getDriver().getCurrentUrl();
        String textContact = getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Контакты'][contains(text(),'Контакты')]")).getText();
        Assertions.assertEquals(urlContactButton, "https://minus417ru.com/contact/");
        Assertions.assertEquals(textContact, "КОНТАКТЫ");
    }
    @Test
    void info() {
        Actions action = new Actions(getDriver());
        action
                .click(getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Оплата'][contains(text(),'Оплата')]")))
                .build()
                .perform();
        String urlInfoButton = getDriver().getCurrentUrl();
        String textInfo = getDriver().findElement(By.xpath("//ul[@class='right__list']//a[@title='Оплата'][contains(text(),'Оплата')]")).getText();
        Assertions.assertEquals(urlInfoButton, "https://minus417ru.com/info/");
        Assertions.assertEquals(textInfo, "ОПЛАТА");
    }
}
