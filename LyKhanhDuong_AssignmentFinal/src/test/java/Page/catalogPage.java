package Page;

import org.openqa.selenium.By;

public class catalogPage {
    // Menu Bar - Catalog
    // Click
    public By catalog = By.xpath("//nav[@class='admin__menu']/ul/li[2]/a");
    public By product = By.xpath("//li[@class='item-catalog-products    level-2']/a/span");
    public By searchBtn = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div[5]/button");
    public By edit = By.xpath("//tr[@class='data-row']/td[13]/a");

    // isDisplayed
    public By addProductBtn = By.id("add_new_product-button");
    public By searchKey = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div/input");
    public By filtersBtn = By.xpath("//button[contains(text(),'Filters')]");
    public By newView = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div[1]/div[1]/div[1]/button");
    public By columns = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div/div[2]/button");
    public By tableListOutProduct = By.className("");
    public By resultSearch = By.xpath("//div[contains(text(),'Joust Duffle Bag-Black')]");
    public By productName = By.name("product[name]");
    public By price = By.name("product[price]");
    public By attributeSet = By.xpath("//div[contains(text(),'Bag')]");
}
