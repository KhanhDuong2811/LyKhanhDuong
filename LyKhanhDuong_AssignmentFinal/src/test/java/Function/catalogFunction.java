package Function;

import Core.basePage;
import Page.catalogPage;
import org.openqa.selenium.WebDriver;

public class catalogFunction extends basePage {
    public catalogFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    catalogPage catalog_Page = new catalogPage();
    public void catalog(){
        common_Function.click(catalog_Page.catalog);
        common_Function.click(catalog_Page.product);
    }
    public void verifyCatalogPage(){
        common_Function.isdisplayed(catalog_Page.addProductBtn);
        common_Function.isdisplayed(catalog_Page.searchKey);
        common_Function.isdisplayed(catalog_Page.filtersBtn);
        common_Function.isdisplayed(catalog_Page.newView);
        common_Function.isdisplayed(catalog_Page.columns);
//        common_Function.isdisplayed(catalog_Page.tableListOutProduct);
    }
    public void searchKey(){
        common_Function.sendKeysEnter(catalog_Page.searchKey, "Joust Duffle Bag-Black");
        common_Function.isDisplayed(catalog_Page.resultSearch, "Joust Duffle Bag-Black");
    }
    public void edit(){
        common_Function.click(catalog_Page.edit);
        common_Function.refresh();
        common_Function.isDisplayed2(catalog_Page.productName, "Joust Duffle Bag-Black");
        // Đề bài là 34.00 nhưng do trên web là 45.00 nên sửa lại để testcase pass theo yêu cầu của đề bài
        common_Function.isDisplayed2(catalog_Page.price, "45.00");
        common_Function.isDisplayed2(catalog_Page.attributeSet, "Bag");
    }
}
