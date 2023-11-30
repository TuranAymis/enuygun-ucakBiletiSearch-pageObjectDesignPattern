package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.Constants.ConstantMainPage.*;

public class MainPage extends BasePage {

    //Parametrik istediği için değişken tanımladım
    String gidisSehir = "Ankara";
    String donusSehir = "İstanbul";

    //testte kullanıcak elemtleri nasıl kullanacaksam ona göre tanımladım
    public MainPage(WebDriver driver){
        super(driver);
    }
    public MainPage clickGidisDonus() {
        click(GIDIS_DONUS);
        return this;
    }
    public MainPage sendNereden() {
        sendKeys(NEREDEN, gidisSehir);
        return this;
    }
    public MainPage clickOnerilenIlk() {
        click(ONERILEN_ILK);
        return this;
    }
    public MainPage sendNereye() {
        sendKeys(NEREYE, donusSehir);
        return this;
    }
    public MainPage clickGidisTarih() {
        click(GIDIS_TARIH);
        return this;
    }
    public MainPage clickGidisGunSec() {
        click(GIDIS_GUN_SEC);
        return this;
    }
    public MainPage clickDonusTarih() {
        click(DONUS_TARIH);
        return this;
    }
    public MainPage clickDonusGunSec() {
        click(DONUS_GUN_SEC);
        return this;
    }
    public MainPage clickAktarmasiz() {
        click(AKTARMASIZ);
        return this;
    }
    public MainPage clickYolcuSayisi() {
        click(YOLCU_SAYISI);
        return this;
    }
    public MainPage clickYolcuSayisiArttir() {
        click(YOLCU_SAYISI_ARTTIR);
        return this;
    }
    public MainPage clickBusinessSec() {
        click(BUSINESS_SEC);
        return this;
    }
    public MainPage clickBiletBul() {
        click(CLICK_BILET_BUL);
        return this;
    }
    public MainPage findIkinciSayfaKontrol() {
        findElement(IKINCI_SAYFA_KONTROL);
        return this;
    }
}