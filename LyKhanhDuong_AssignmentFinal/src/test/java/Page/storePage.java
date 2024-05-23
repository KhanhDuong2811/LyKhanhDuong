package Page;

import org.openqa.selenium.By;

public class storePage {
    // Menu Bar - Store
    // Click
    public By store = By.xpath("//nav[@class='admin__menu']/ul/li[5]/a");
    public By product = By.xpath("//li[@class='item-catalog-attributes-attributes    level-2']/a/span");
    public By saveBtn = By.id("save");
    public By rowOnly = By.xpath("//table[@id='attributeGrid_table']/tbody/tr");

    // isDisplayed
    public By addNewAttributeBtn = By.id("add");
    public By defaultLabelText = By.id("attribute_label");
    public By catalogInputTypeForStoreOwnerCombobox = By.id("frontend_input");
    public By valuesRequiredCombobox = By.id("is_required");
    public By advancedAttributeProperties = By.xpath("//*[@class='entry-edit form-inline']/div/div/strong");
    public By attributeCode = By.name("attribute_code");
    public By scope = By.id("is_global");
    public By defaultValue = By.id("default_value_text");
    public By uniqueValue = By.id("is_unique");
    public By inputValidationForStoreOwner = By.id("frontend_class");
    public By addToColumnOptions = By.id("is_used_in_grid");
    public By useInFilterOptions = By.id("is_filterable_in_grid");
    public By searchBtn = By.xpath("//div[@class='admin__filter-actions']/button[1]");
    public By resetFilter = By.xpath("//div[@class='admin__filter-actions']/button[2]");
    public By productAttributeTable = By.xpath("//table[@class='data-grid']");
    public By productAttributeTable20rows = By.xpath("//select[@id='attributeGrid_page-limit']");
    public By verifyDefaultLabel = By.xpath("//table[@id='attributeGrid_table']/tbody/tr/td[2]");

    // getText
    public By message = By.xpath("//div[contains(text(),'You saved the product attribute.')]");

    //input
    public By searchAttributeCode = By.name("attribute_code");

}
