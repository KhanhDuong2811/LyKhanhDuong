package Test;

import Core.ExcelUtils;
import Core.baseTest;
import Function.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class final_test extends baseTest {
    @DataProvider()
    public static Object[][] getAccountData(){
        String path = "src/Source/AssignmentFinalNew.xlsx";
        String sheet = "Sheet1";
        return ExcelUtils.getTableArray(path, sheet,0, 7);
    }
    @DataProvider()
    public static Object[][] createNewCustomer(){
        String path = "src/Source/AssignmentFinalNew.xlsx";
        String sheet = "Sheet2";
        return ExcelUtils.getTableArray(path, sheet,0, 12);
    }

        @Test(dataProvider = "getAccountData")
        public void tc01_ChangePass (String user, String pass, String oldPass, String newPass, String confirmPass, String user2, String pass2){
            loginFunction login_function  = new loginFunction(driver);
            try {
                login_function.login(user, pass);
                login_function.verifyHomePage();
                login_function.verifyChangePasswordPage();
                login_function.changePassword(oldPass, newPass, confirmPass);
                login_function.login(user2, pass2);
                login_function.logOut();
                ExcelUtils.writeData("2", "TCs_01", "tc01_ChangePass", "Pass", "Pass");
            } catch (Exception e) {
                ExcelUtils.writeData("2", "TCs_01", "tc01_ChangePass", "Pass", "Failed");
            } catch (AssertionError a) {
                ExcelUtils.writeData("2", "TCs_01", "tc01_ChangePass", "Pass", String.valueOf(a));
            }
        }

    @Test(dataProvider = "createNewCustomer")
    public void tc02_createNewCustomer (String user, String pass, String name,String date,String address, String city, String state, String pin, String phone, String email,String password, String text){
        loginFunction login_function  = new loginFunction(driver);
        try {
            login_function.login(user, pass);
            login_function.verifyHomePage();
            login_function.verifyNewCustomerPage();
            login_function.newCustomer(name,date,address,city,state,pin,phone,email,password, text);
            login_function.logOut();
            ExcelUtils.writeData("2", "TCs_02", "tc02_createNewCustomer", "Pass", "Pass");
        } catch (Exception e) {
            ExcelUtils.writeData("2", "TCs_02", "tc02_createNewCustomer", "Pass", "Failed");
        } catch (AssertionError a) {
            ExcelUtils.writeData("2", "TCs_02", "tc02_createNewCustomer", "Pass", String.valueOf(a));
        }
    }
}
