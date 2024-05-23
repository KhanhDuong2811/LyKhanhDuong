package Test;

import Core.ExcelUtils;
import Core.baseTest;
import Function.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class final_test extends baseTest {
    @DataProvider()
    public static Object[][] getAccountData(){
        String path = "src/Source/AssignmentFinalNew.xlsx";
        String sheet = "Sheet1";
        return ExcelUtils.getTableArray(path, sheet,0, 2);
    }
    @DataProvider()
    public static Object[][] inputData(){
        String path = "src/Source/AssignmentFinalNew.xlsx";
        String sheet = "Sheet2";
        return ExcelUtils.getTableArray(path, sheet,0, 5);
    }
    @DataProvider()
    public static Object[][] inputNewAttribute(){
        String path = "src/Source/AssignmentFinalNew.xlsx";
        String sheet = "Sheet3";
        return ExcelUtils.getTableArray(path, sheet,0, 6);
    }

        @Test(dataProvider = "getAccountData")
        public void tc01_VerifyLoginPage (String user, String pass){
            loginFunction login_function  = new loginFunction(driver);
            dashboardFunction dashboard_Function = new dashboardFunction(driver);
            try {
                login_function.verifyLoginPage();
                login_function.login(user, pass);
//                login_function.closeIncomingMessage();
                dashboard_Function.verifyLoginSuccess();
                ExcelUtils.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Pass");
            } catch (Exception e) {
                ExcelUtils.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", "Failed");
            } catch (AssertionError a) {
                ExcelUtils.writeData("2", "TCs_01", "tc01_VerifyLoginPage", "Pass", String.valueOf(a));
            }
        }

    @Test(dataProvider = "inputData")
    public void tc02_VerifyCreateNewCustomer (String user, String pass, String firstName, String lastName, String email){
        loginFunction login_function  = new loginFunction(driver);
        CustomerFunction customerFunction = new CustomerFunction(driver);

        try {
            login_function.login(user, pass);
//            login_function.closeIncomingMessage();
            customerFunction.customer();;
            customerFunction.addNewCustomer(firstName, lastName, email);
            ExcelUtils.writeData("2", "TCs_02", "tc02_VerifyCreateNewCustomer", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_02", "tc02_VerifyCreateNewCustomer", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_02", "tc02_VerifyCreateNewCustomer", "Pass", String.valueOf(a));
        }
    }
    @Test(dataProvider = "getAccountData")
    public void tc03_VerifyEditCustomer (String user, String pass) throws InterruptedException {
        loginFunction login_function  = new loginFunction(driver);
        CustomerFunction customerFunction = new CustomerFunction(driver);
        try {
            login_function.login(user, pass);
            customerFunction.customer();
            customerFunction.searchKey("Marie Delabre");
            customerFunction.edit();
            ExcelUtils.writeData("2", "TCs_03", "tc03_VerifyEditCustomer", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_03", "tc03_VerifyEditCustomer", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_03", "tc03_VerifyEditCustomer", "Pass", String.valueOf(a));
        }
    }
    @Test(dataProvider = "getAccountData")
    public void tc04_VerifyProductPage (String user, String pass){
        loginFunction login_function  = new loginFunction(driver);
        catalogFunction catalog_Function = new catalogFunction(driver);
        try {
            login_function.login(user, pass);
            catalog_Function.catalog();
            catalog_Function.verifyCatalogPage();
            ExcelUtils.writeData("2", "TCs_04", "tc04_VerifyProductPage", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_04", "tc04_VerifyProductPage", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_04", "tc04_VerifyProductPage", "Pass", String.valueOf(a));
        }

    }
    @Test(dataProvider = "getAccountData")
    public void tc05_VerifySearchProductPage (String user, String pass){
        loginFunction login_function  = new loginFunction(driver);

        catalogFunction catalog_Function = new catalogFunction(driver);

        try {
            login_function.login(user, pass);
            catalog_Function.catalog();
            catalog_Function.searchKey();
            ExcelUtils.writeData("2", "TCs_05", "tc05_VerifySearchProductPage", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_05", "tc05_VerifySearchProductPage", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_05", "tc05_VerifySearchProductPage", "Pass", String.valueOf(a));
        }

    }
    @Test(dataProvider = "getAccountData")
    public void tc06_VerifySearchProductPage2 (String user, String pass){
        loginFunction login_function  = new loginFunction(driver);
        catalogFunction catalog_Function = new catalogFunction(driver);
        try {
            login_function.login(user, pass);
            catalog_Function.catalog();
            catalog_Function.searchKey();
            catalog_Function.edit();
            ExcelUtils.writeData("2", "TCs_06", "tc06_VerifySearchProductPage2", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_06", "tc06_VerifySearchProductPage2", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_06", "tc06_VerifySearchProductPage2", "Pass", String.valueOf(a));
        }
    }
    @Test(dataProvider = "getAccountData")
    public void tc07_VerifyProductAttributesPage (String user, String pass){
        loginFunction login_function  = new loginFunction(driver);
        storeFunction store_Function = new storeFunction(driver);
        try {
            login_function.login(user, pass);
            store_Function.store();
            store_Function.verifyStorePage();
            ExcelUtils.writeData("2", "TCs_07", "tc07_VerifyProductAttributesPage", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_07", "tc07_VerifyProductAttributesPage", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_07", "tc07_VerifyProductAttributesPage", "Pass", String.valueOf(a));
        }
    }
    @Test(dataProvider = "getAccountData")
    public void tc08_VerifyAddNewProductAttributesPage (String user, String pass){
        loginFunction login_function  = new loginFunction(driver);
        storeFunction store_Function = new storeFunction(driver);
        try {
            login_function.login(user, pass);
            store_Function.store();
            store_Function.addNewAttribute();
            store_Function.advancedAttributeProperties();
            ExcelUtils.writeData("2", "TCs_08", "tc08_VerifyAddNewProductAttributesPage", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_08", "tc08_VerifyAddNewProductAttributesPage", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_08", "tc08_VerifyAddNewProductAttributesPage", "Pass", String.valueOf(a));
        }
    }
    @Test(dataProvider = "inputNewAttribute")
    public void tc09_VerifyCreateNewProductAttributesSuccessfully (String user, String pass,String defaultLabel, String catalog, String required, String message){
        loginFunction login_function  = new loginFunction(driver);
        storeFunction store_Function = new storeFunction(driver);
        try {
            login_function.login(user, pass);
            store_Function.store();
            store_Function.addNewAttribute();
            store_Function.inputAddNewAttribute(defaultLabel, catalog, required, message);
            ExcelUtils.writeData("2", "TCs_09", "tc09_VerifyCreateNewProductAttributesSuccessfully", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_09", "tc09_VerifyCreateNewProductAttributesSuccessfully", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_09", "tc09_VerifyCreateNewProductAttributesSuccessfully", "Pass", String.valueOf(a));
        }
    }
    @Test(dataProvider = "getAccountData")
    public void tc10_VerifySearchProductAttributes (String user, String pass){
        loginFunction login_function  = new loginFunction(driver);
        storeFunction store_Function = new storeFunction(driver);
        try {
            login_function.login(user, pass);
            store_Function.store();
            store_Function.attributeCode();
            ExcelUtils.writeData("2", "TCs_10", "tc10_VerifySearchProductAttributes", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_10", "tc10_VerifySearchProductAttributes", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_10", "tc10_VerifySearchProductAttributes", "Pass", String.valueOf(a));
        }
    }
}
