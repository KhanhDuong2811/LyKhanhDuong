package Page;

import org.openqa.selenium.By;

public class customersPage {
    // Menu Bar - Customers
    // Click
    public By customers = By.xpath("//nav[@class='admin__menu']/ul/li[3]/a");
    public By allCustomers = By.xpath("//li[@class='item-customer-manage    level-1']/a/span");
    public By addNewCustomers = By.id("add");
    public By saveCustomerBtn = By.id("save");
    public By edit = By.xpath("//tr[@class='data-row']/td[17]/a");
    public By accountInformation = By.linkText("Account Information");

    // Input
    public By checkBox = By.linkText("Disable Automatic Group Change Based on VAT ID");
    public By lastname = By.name("customer[lastname]");
    public By firstname = By.name("customer[firstname]");
    public By email = By.name("customer[email]");
    public By searchKey = By.xpath("//*[@class='admin__data-grid-outer-wrap']/div/div/div/input");

    // isDisplayed
    public By messages = By.xpath("//div[@id='messages']/div/div/div");
}
