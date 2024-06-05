package Function;

import Page.shopinessPage;

import java.io.IOException;

public class shopinessFunction {
    Common commonFunction = new Common();
    shopinessPage shopinessPage = new shopinessPage();

    public void clickToBatDau() throws InterruptedException {

        commonFunction.tapByElement(shopinessPage.btnTraiNghiem);
    }

    public void clickToDeny() {
        commonFunction.tapByElement(shopinessPage.deny);
    }

    // TC01
    public void verifyHomeScreen() {
        commonFunction.isdisplayed(shopinessPage.cartIcon);
        commonFunction.isdisplayed(shopinessPage.searchIcon);
        commonFunction.isdisplayed(shopinessPage.startNowBtn);
    }

    public void verifyMenu() {
        commonFunction.isDisplayed(shopinessPage.hoanTien,"Hoàn tiền");
        commonFunction.isDisplayed(shopinessPage.thuongHieu,"Thương hiệu");
        commonFunction.isDisplayed(shopinessPage.uuDai,"Ưu đãi");
        commonFunction.isDisplayed(shopinessPage.voucher,"Voucher");
        commonFunction.isDisplayed(shopinessPage.caNhan,"Cá nhân");
    }

    //
    public void clickToMuaSamOnline() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.tapByElement(shopinessPage.muaSamOnline);
    }
    // TC02
    // Không bắt buộc phải có vì nó là default
    public void clickToThuongHieu() {
        commonFunction.tapByElement(shopinessPage.thuongHieu);
    }
    public void verify_4_BranchName() {
        commonFunction.isdisplayed(shopinessPage.shopee);
        commonFunction.isdisplayed(shopinessPage.lazada);
        commonFunction.isdisplayed(shopinessPage.tiki);
        commonFunction.isdisplayed(shopinessPage.aeon);
    }

    // TC03
    public void clickToUuDai() {
        commonFunction.tapByElement(shopinessPage.uuDai);
    }
    public void clickToFirstItem() {
        commonFunction.tapByElement(shopinessPage.firstItem);
    }
    public void verify_3_Item() {
        commonFunction.isdisplayed(shopinessPage.discountImage);
        commonFunction.isdisplayed(shopinessPage.description);
        commonFunction.isDisplayed(shopinessPage.danhMucUuDaiBtn,"DANH MỤC HOÀN TIỀN\n" +
                "MÃ ƯU ĐÃI");
    }

    // TC04
    public void clickToVoucher() {
        commonFunction.tapByElement(shopinessPage.voucher);
    }
    public void swipeAndClickLastVoucher() throws IOException {
        commonFunction.checkScroll(shopinessPage.lastVoucher,539,1999,516,810);
    }
    public void verify_4_Item() {
        commonFunction.isdisplayed(shopinessPage.voucherImage);
        commonFunction.isdisplayed(shopinessPage.voucherDescription);
        commonFunction.isDisplayed(shopinessPage.muaNgayBtn,"MUA NGAY\n" +
                "Còn (999)");
        commonFunction.isdisplayed(shopinessPage.addCarIcon);
    }

    // TC05
    public void clickToCaNhan() {
        commonFunction.tapByElement(shopinessPage.caNhan);
    }
    public void verify_4_Tabs() {
        commonFunction.isDisplayed(shopinessPage.maUuDai,"Mã ưu đãi");
        commonFunction.isDisplayed(shopinessPage.uuDai2,"Ưu đãi");
        commonFunction.isDisplayed(shopinessPage.voucher2,"Voucher");
        commonFunction.isDisplayed(shopinessPage.thuongHieu2,"Thương hiệu");
    }
}
