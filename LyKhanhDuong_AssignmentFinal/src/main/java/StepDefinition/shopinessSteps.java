package StepDefinition;

import Core.AppiumBase;
import Function.shopinessFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;

public class shopinessSteps extends AppiumBase {
    shopinessFunction shopinessFunction = new shopinessFunction();
    @Given("open shoppe app")
    public void open_shoppe_app() throws MalformedURLException {
        System.out.println("This steps: open_shoppe_app");
        setup();
    }
    @Given("Click to Bat dau trai nghiem")
    public void click_to_bat_dau_trai_nghiem() throws InterruptedException {
        System.out.println("This steps: click_to_bat_dau_trai_nghiem");
        shopinessFunction.clickToBatDau();
    }
    @When("I click to Deny")
    public void i_click_to_deny() {
        System.out.println("This steps: i_click_to_deny");
        shopinessFunction.clickToDeny();
    }
    // TC01
    @Then("The Home screen should displayed")
    public void the_home_screen_should_displayed() {
        System.out.println("This steps: the_home_screen_should_displayed");
        shopinessFunction.verifyHomeScreen();
    }
    @Then("The menu footer should displayed")
    public void the_menu_footer_should_displayed() {
        System.out.println("This steps: the_menu_footer_should_displayed");
        shopinessFunction.verifyMenu();
    }
    //
    @Given("I am in Home Screen")
    public void i_am_in_home_screen() throws InterruptedException {
        System.out.println("This steps: i_am_in_home_screen");
        shopinessFunction.clickToBatDau();
        shopinessFunction.clickToDeny();
    }
    @When("I click to Mua Sam Online")
    public void i_click_to_mua_sam_online() throws InterruptedException {
        System.out.println("This steps: i_click_to_mua_sam_online");
        shopinessFunction.clickToMuaSamOnline();
    }
    // TC02
    @When("I click to Thuong Hieu")
    public void i_click_to_thuong_hieu() {
        System.out.println("This steps: i_click_to_thuong_hieu");
//        shopinessFunction.clickToThuongHieu();
    }
    @Then("The screen should be displayed {int} branch name")
    public void the_screen_should_be_displayed_branch_name(Integer int1) {
        System.out.println("This steps: the_screen_should_be_displayed_branch_name");
        shopinessFunction.verify_4_BranchName();
    }
    // TC03
    @When("I click to Uu Dai")
    public void i_click_to_uu_dai() {
        System.out.println("This steps: i_click_to_uu_dai");
        shopinessFunction.clickToUuDai();
    }
    @Then("I click to the first item")
    public void i_click_to_the_first_item() {
        System.out.println("This steps: i_click_to_the_first_item");
        shopinessFunction.clickToFirstItem();
    }
    @Then("The screen should be displayed with some item")
    public void the_screen_should_be_displayed_with_some_item() {
        System.out.println("This steps: the_screen_should_be_displayed_with_some_item");
        shopinessFunction.verify_3_Item();
    }
    // TC04
    @When("I click to Voucher")
    public void i_click_to_voucher() {
        System.out.println("This steps: i_click_to_voucher");
        shopinessFunction.clickToVoucher();
    }
    @Then("I swipe and click to the last Voucher")
    public void i_swipe_and_click_to_the_last_voucher() throws IOException {
        System.out.println("This steps: i_swipe_and_click_to_the_last_voucher");
        shopinessFunction.swipeAndClickLastVoucher();
    }
    @Then("The screen should be displayed with some items")
    public void the_screen_should_be_displayed_with_some_items() {
        System.out.println("This steps: the_screen_should_be_displayed_with_some_items");
        shopinessFunction.verify_4_Item();
    }
    // TC05
    @When("I click to Ca Nhan")
    public void i_click_to_ca_nhan() {
        System.out.println("This steps: i_click_to_ca_nhan");
        shopinessFunction.clickToCaNhan();
    }
    @Then("The screen should be displayed {int} tabs")
    public void the_screen_should_be_displayed_tabs(Integer int1) {
        System.out.println("This steps: the_screen_should_be_displayed_tabs");
        shopinessFunction.verify_4_Tabs();
    }




}
