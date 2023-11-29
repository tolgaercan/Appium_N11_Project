package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By kategorilerButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By telefonAksesuarButon = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Telefon & Aksesuarları\")");
    By markasec = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");
    By filtreleme = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By dahilihafizabuton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By hafizamiktari = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By uygulaButon = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\")");
    By sonucgoster = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By artibuton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
    By sepeteeklebuton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepetegit = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By sepetkontrol = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayout\")");

    public n11Pages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);  // Duration yerine doğrudan uzun bir değer kullanılıyor
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoritıklma() {
        elementHelper.findElement(kategorilerButonu).click();
    }

}
