package minus417;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    public WebElement getNumber() {
        return number;
    }
    @FindBy(xpath = "//a[@title='8 (800) 333-20-18")
    private WebElement number;
    public WebElement getPhilosophy() {
        return philosophy;
    }
    @FindBy(xpath = "//a[@title='Философия бренда']")
    private WebElement philosophy;
    public WebElement getNews() {
        return news;
    }
    @FindBy(xpath = "//ul[@class='right__list']//a[@title='Новости'][contains(text(),'Новости')]")
    private WebElement news;
    public WebElement getDelivery() {
        return delivery;
    }
    @FindBy(xpath = "//ul[@class='right__list']//a[@title='Доставка'][contains(text(),'Доставка')]")
    private WebElement delivery;
    public WebElement getContact() {
        return contact;
    }
    @FindBy(xpath = "//ul[@class='right__list']//a[@title='Контакты'][contains(text(),'Контакты')]")
    private WebElement contact;
    public WebElement getInfo() {
        return info;
    }
    @FindBy(xpath = "//ul[@class='right__list']//a[@title='Оплата'][contains(text(),'Оплата')]")
    private WebElement info;
    public WebElement getBasket1() {
        return basket1;
    }
    @FindBy(xpath = "//li[@class='basket-price-wrapper']//a[@class='basket-price'][contains(text(),'0 руб.')]")
    private WebElement basket1;
    public WebElement getBasket2() {
        return basket2;
    }
    @FindBy(xpath = "//div[@class='d-flex col-lg-12 align-items-center bg-black justify-content-between']//span[@class='mini_cart_wrapper']//a[1]")
    private WebElement basket2;
    public WebElement getSearchInput() {
        return searchInput;
    }
    @FindBy(id = "title-search-input")
    private WebElement searchInput;
    public WebElement getSearchButton() {
        return searchButton;
    }
    @FindBy(xpath = "//button[@name='s']//*[name()='svg']")
    private WebElement searchButton;
    public WebElement getLogo() {
        return logo;
    }
    @FindBy(xpath = "//div[@class='logo d-flex justify-content-center align-items-center']//a")
    private WebElement logo;
    public WebElement getNewItems() {
        return newItems;
    }
    @FindBy(xpath = "//a[@title='НОВИНКИ']")
    private WebElement newItems;
    public WebElement getBestseller() {
        return bestseller;
    }
    @FindBy(xpath = "//a[@title='БЕСТСЕЛЛЕРЫ']")
    private WebElement bestseller;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
