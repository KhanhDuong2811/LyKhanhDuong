package Function;

import Core.basePage;
import Page.storePage;
import org.openqa.selenium.WebDriver;

public class storeFunction extends basePage {
    public storeFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    storePage store_Page = new storePage();
    public void store(){
        common_Function.click(store_Page.store);
        common_Function.click(store_Page.product);
    }
    public void verifyStorePage(){
        common_Function.isdisplayed(store_Page.addNewAttributeBtn);
        common_Function.isdisplayed(store_Page.searchBtn);
        common_Function.isdisplayed(store_Page.resetFilter);
        common_Function.isdisplayed(store_Page.productAttributeTable);
        common_Function.isdisplayed(store_Page.productAttributeTable20rows);
    }
    public void addNewAttribute(){
        common_Function.click(store_Page.addNewAttributeBtn);
        common_Function.isdisplayed(store_Page.defaultLabelText);
        common_Function.isdisplayed(store_Page.catalogInputTypeForStoreOwnerCombobox);
        common_Function.isdisplayed(store_Page.valuesRequiredCombobox);
    }
    public void advancedAttributeProperties(){
        common_Function.click(store_Page.advancedAttributeProperties);
        common_Function.isdisplayed(store_Page.attributeCode);
        common_Function.isdisplayed(store_Page.scope);
        common_Function.isdisplayed(store_Page.defaultValue);
        common_Function.isdisplayed(store_Page.uniqueValue);
        common_Function.isdisplayed(store_Page.inputValidationForStoreOwner);
        common_Function.isdisplayed(store_Page.addToColumnOptions);
        common_Function.isdisplayed(store_Page.useInFilterOptions);
    }
    public void inputAddNewAttribute(String defaultLabel, String catalog, String required, String message){
        common_Function.sendKeys(store_Page.defaultLabelText, defaultLabel);
        common_Function.selectByVisibleText(store_Page.catalogInputTypeForStoreOwnerCombobox, catalog);
        common_Function.selectByVisibleText(store_Page.valuesRequiredCombobox, required);
        common_Function.click(store_Page.saveBtn);
        common_Function.isDisplayed(store_Page.message, message);
    }
    public void attributeCode(){
        common_Function.sendKeysEnter(store_Page.searchAttributeCode,"color");
        common_Function.isdisplayed(store_Page.rowOnly);
        common_Function.isDisplayed(store_Page.verifyDefaultLabel,"Color");
    }
}
