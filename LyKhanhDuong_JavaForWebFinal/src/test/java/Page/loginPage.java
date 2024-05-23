package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    // Login
    public By username = By.name("uid");
    public By password = By.name("password");
    public By signInBtn = By.name("btnLogin");
    public By nav = By.xpath("//ul[@class='nav navbar-nav']");

    // Verify HomePage
    public By selenium = By.xpath("//ul[@class='nav navbar-nav']/li[1]");
    public By insuranceProject = By.xpath("//ul[@class='nav navbar-nav']/li[3]");
    public By agileProject = By.xpath("//ul[@class='nav navbar-nav']/li[4]");
    public By bankProject = By.xpath("//ul[@class='nav navbar-nav']/li[5]");
    public By securityProject = By.xpath("//ul[@class='nav navbar-nav']/li[6]");
    public By telecomProject = By.xpath("//ul[@class='nav navbar-nav']/li[8]");
    public By paymentGatewayProject = By.xpath("//ul[@class='nav navbar-nav']/li[9]");
    public By newTours = By.xpath("//ul[@class='nav navbar-nav']/li[10]");
    public By seo = By.xpath("//ul[@class='nav navbar-nav']/li[11]");
    public By Guru99Bank = By.tagName("h2");
    public By manager = By.xpath("//ul[@class='menusubnav']/li[1]");
    public By newCustomer = By.xpath("//ul[@class='menusubnav']/li[2]");
    public By editCustomer = By.xpath("//ul[@class='menusubnav']/li[3]");
    public By deleteCustomer = By.xpath("//ul[@class='menusubnav']/li[4]");
    public By newAccount = By.xpath("//ul[@class='menusubnav']/li[5]");
    public By editAccount = By.xpath("//ul[@class='menusubnav']/li[6]");
    public By deleteAccount = By.xpath("//ul[@class='menusubnav']/li[7]");
    public By deposit = By.xpath("//ul[@class='menusubnav']/li[8]");
    public By withdrawal = By.xpath("//ul[@class='menusubnav']/li[9]");
    public By fundTransfer = By.xpath("//ul[@class='menusubnav']/li[10]");
    public By changePass = By.xpath("//ul[@class='menusubnav']/li[11]");
    public By balanceEnquiry = By.xpath("//ul[@class='menusubnav']/li[12]");
    public By miniStatement = By.xpath("//ul[@class='menusubnav']/li[13]");
    public By customisedStatement = By.xpath("//ul[@class='menusubnav']/li[14]");
    public By logOut = By.xpath("//ul[@class='menusubnav']/li[15]");
    public By img = By.tagName("center");
    public By welcome = By.tagName("marquee");
    public By mangerId = By.xpath("//tr[@class='heading3']/td");

    // Verify ChangePassword Page
    public By oldPassword = By.name("oldpassword");
    public By newPassword = By.name("newpassword");
    public By confirmPassword = By.name("confirmpassword");
    public By submitBtn = By.name("sub");
    public By resetBtn = By.name("res");
    public By homeBtn = By.linkText("Home");

    // Create Customer
    public By customerName = By.name("name");
    public By gender = By.linkText("//table[@class='layout']/tbody/tr/td/table/tbody/tr[5]/td[1]");
    public By genderFemale = By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
    public By genderMale = By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
    public By dateOfBith = By.id("dob");
    public By address = By.name("addr");
    public By city = By.name("city");
    public By state = By.name("state");
    public By pin = By.name("pinno");
    public By phoneNumber = By.name("telephoneno");
    public By email = By.name("emailid");
    public By pass = By.name("password");
    public By submit2 = By.name("sub");
    public By verifyMessage = By.xpath("//table[@id='customer']/tbody/tr/td[1]/p");

}
