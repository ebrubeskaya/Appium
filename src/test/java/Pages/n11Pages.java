package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;



public class n11Pages {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;


    By categoriesButton = MobileBy.xpath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.FrameLayout/android.widget.ImageView");
    By electronicButton= MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
    By chooseItems=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
    By mobilSelect=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
    By filterClk = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");

    By brandFilt=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[2]");
    By brandChoose=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]/android.widget.CheckBox");
    By filterApply = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tv_name\")");
    By showResults=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\")");
    By productChoose=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
    By productAddCart=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By cart=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvBasketTitle\")");
    By checkCart=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayout\")");




    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void categoriesClick() {
        driver.findElement(categoriesButton).click();
    }

    public void electronicClick() {
        driver.findElement(electronicButton).click();
    }

    public void choosePhoneAccessories() {
        driver.findElement(chooseItems).click();
    }

    public void mobilePhoneSelect() {
        driver.findElement(mobilSelect).click();
    }

    public void filterClick() {
        driver.findElement(filterClk).click();
    }

    public void doFilter() {
        driver.findElement(brandFilt).click();
        driver.findElement(brandChoose).click();
        driver.findElement(filterApply).click();
    }
    public void showResultClick() {
        driver.findElement(showResults).click();
    }
    public void theProductAddCart() {
        driver.findElement(productChoose).click();
        driver.findElement(productAddCart).click();
    }
    
    public void myCart() {
        driver.findElement(cart).click();
    }
    public void checkProductAddCart() {
        elementHelper.checkVisible(checkCart);
    }



}
