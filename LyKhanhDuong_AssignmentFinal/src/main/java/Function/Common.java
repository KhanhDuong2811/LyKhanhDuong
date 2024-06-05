package Function;

import Core.AppiumBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Common extends AppiumBase {
    // scroll
    public void checkScroll(By locator ,int startx, int starty, int endx, int endy) throws IOException {
        for (int i = 1; i <= 100; i++){
            if(drive.findElements(locator).size() != 0){
                // If element is displayed then click on it
                System.out.println("Tab " + (i + 1) + " has been found and now clicking on it.");
                // capturing Screenshots
//                capturingScreenshots("");
                // click to element
                drive.findElement(locator).click();
                break;
            }else {
                // If element is not displayed then continues scroll by swipe menthod
                swipe(startx, starty, endx, endy);
            }
        }
    }

    // tab to element
    public void tapByElement (By locator) {
        TouchAction action = new TouchAction(drive);
        WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }
    //tapByCoordinates
    public void tapByCoordinates (int x, int y) {
        TouchAction action = new TouchAction(drive);
        action.tap(PointOption.point(x,y));
    }


    //tapByCoordinates
    public void longPress (int x, int y) {
        TouchAction action = new TouchAction(drive);
        action.longPress(PointOption.point(x,y));
    }
    //swipe == vuot
    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(drive).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();

    }

    public void swipeMobileUp() {
        Dimension size = drive.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, starty, startx, endy);

    }
    public void swipeMobileDown() {
        Dimension size = drive.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, endy, startx, starty);

    }
    public void rightLeftSwipe() {
        Dimension size = drive.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(startx, starty, endx, starty);

    }
    public void leftRightSwipe() {
        Dimension size = drive.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(endx, starty, startx, starty);


    }
    //Capturing screenshots
    public void capturingScreenshots(String name) throws IOException {
        File screenShot = drive.getScreenshotAs(OutputType.FILE);
        File location = new File("screenshots");
        String screenShotName = location.getAbsolutePath() + File.separator + name;
        FileUtils.copyFile(screenShot, new File(screenShotName));

    }
    public void removeApp(){
        drive.currentActivity();
    }


    public void clickToElement(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    public void click(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }
    public void refresh(){
        driver.navigate().refresh();
    }

    public void sendKeys(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }
    public void sendKeysEnter(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value, Keys.ENTER);
    }
    public void enter(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        element.sendKeys(Keys.ENTER);
    }

    public void isdisplayed(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.isDisplayed();
    }
    public void isDisplayed(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
        String a = element.getText();
        Assert.assertEquals(a, value);
    }
    public void isDisplayed2(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
        String a = element.getAttribute("value");
        Assert.assertEquals(a, value);
    }
    public void isSelected(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertFalse(element.isSelected());
    }

    public void checkText(By locator, String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String a = element.getText();
        Assert.assertEquals(a, value);
    }
    public void verifyTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }


    public void getCookie(){
        Cookie cookie1 = driver.manage().getCookieNamed("store");
        Set<Cookie> list = driver.manage().getCookies();
        for(Cookie cookie : list){
            System.out.println(cookie);

        }
    }


    public void selectByVisibleText(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectLocator(By locator, int index){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void switchToWindowByIndex(int index) {
        ArrayList<String> window = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(window.get(1));
    }

    public void switchToWindowByTitle(String title) {
        for (String windowID : driver.getWindowHandles()) {
            String getTitle = driver.switchTo().window(windowID).getTitle();
            if (getTitle.equals("Selenium Easy - Window popup Modal Demo)")) {
                driver.switchTo().window(windowID);
                break;
            }
        }
    }
    public void getTable(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        List<WebElement> rows = element.findElements(By.tagName("tr"));
        for(WebElement row : rows){
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for(WebElement col : cols){
                System.out.println(col.getText());
            }
            System.out.println();
        }
    }
    public void displayList(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        List<WebElement> lists = element.findElements(By.tagName("li"));
        for(WebElement list : lists){
            Assert.assertFalse(list.isDisplayed());
        }
    }
    public void alert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

