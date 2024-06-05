package Page;

import org.openqa.selenium.By;

public class shopinessPage {
    // TC01
    public By btnTraiNghiem = By.id("com.nct.shopiness:id/btn_trai_nghiem");
    public By deny = By.xpath("//android.widget.Button[@resource-id=\"com.android.packageinstaller:id/permission_deny_button\"]");
    public By cartIcon = By.id("com.nct.shopiness:id/icn_giohang");
    public By searchIcon = By.id("com.nct.shopiness:id/menu_item_search");
    public By startNowBtn = By.id("com.nct.shopiness:id/btn_try_cash_back");


    // Menu footer
    public By hoanTien = By.xpath("//android.widget.TextView[@text=\"Hoàn tiền\"]");
    public By thuongHieu = By.xpath("//android.widget.TextView[@text=\"Thương hiệu\"]");
    public By uuDai = By.xpath("//android.widget.TextView[@text=\"Ưu đãi\"]");
    public By voucher = By.xpath("//android.widget.TextView[@text=\"Voucher\"]");
    public By caNhan = By.xpath("//android.widget.TextView[@text=\"Cá nhân\"]");

    // TC02
    public By muaSamOnline = By.xpath("//android.widget.TextView[ @text=\"Mua Sắm\n" +
            "Online\"]");
    public By shopee = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[1]");
    public By lazada = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[2]");
    public By tiki = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[3]");
    public By aeon = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/iv_brand_logo\"])[4]");

    // TC03
    public By firstItem = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nct.shopiness:id/imageView_deal\"])[1]");
    public By discountImage = By.id("com.nct.shopiness:id/deal_image_view");
    public By description = By.id("com.nct.shopiness:id/rating_criteria_text_view");
    public By danhMucUuDaiBtn = By.className("android.widget.Button");

    // TC04
    public By lastVoucher = By.xpath("//android.widget.TextView[@text=\"Voucher tiền mặt 500k Annam Gourmet\"]");
    public By voucherImage = By.id("com.nct.shopiness:id/imgView");
    public By voucherDescription = By.id("com.nct.shopiness:id/tv_description");
    public By muaNgayBtn = By.xpath("//android.widget.Button[@text=\"MUA NGAY\n" +
            "Còn (999)\"]");
    public By addCarIcon = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.nct.shopiness:id/llt_redeem_button\"]/android.widget.Button[2]");

    // TC05
    public By maUuDai = By.xpath("//android.widget.TextView[@text=\"Mã ưu đãi\"]");
    public By uuDai2 = By.xpath("(//android.widget.TextView[@text=\"Ưu đãi\"])[1]");
    public By voucher2 = By.xpath("(//android.widget.TextView[@text=\"Voucher\"])[1]");
    public By thuongHieu2 = By.xpath("(//android.widget.TextView[@text=\"Thương hiệu\"])[1]");

}
