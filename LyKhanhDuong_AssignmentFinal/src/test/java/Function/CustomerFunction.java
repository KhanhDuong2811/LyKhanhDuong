package Function;

import Core.basePage;
import Page.customersPage;
import org.openqa.selenium.WebDriver;

public class CustomerFunction extends basePage {
    public CustomerFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    customersPage customers_Page = new customersPage();

    public void customer(){
        common_Function.click(customers_Page.customers);
        common_Function.click(customers_Page.allCustomers);
    }

    public void addNewCustomer(String firstName, String lastName, String email){
        common_Function.click(customers_Page.addNewCustomers);
        common_Function.refresh();
        common_Function.sendKeys(customers_Page.firstname, firstName);
        common_Function.sendKeys(customers_Page.lastname, lastName);
        common_Function.sendKeys(customers_Page.email, email);
        common_Function.click(customers_Page.saveCustomerBtn);
        common_Function.isDisplayed(customers_Page.messages, "You saved the customer.");
    }
    public void searchKey(String value) {
        common_Function.sendKeysEnter(customers_Page.searchKey, value);
        common_Function.isdisplayed(customers_Page.edit);
    }
    public void edit(){
        common_Function.click(customers_Page.edit);
        common_Function.refresh();
        common_Function.click(customers_Page.accountInformation);
        common_Function.isDisplayed2(customers_Page.firstname, "Marie");
        common_Function.isDisplayed2(customers_Page.lastname, "Delabre");
    }
}
