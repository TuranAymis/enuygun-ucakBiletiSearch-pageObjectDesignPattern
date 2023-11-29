package org.example.page;

import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.Constants.ConstantMainPage.*;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver){
        super(driver);
    }
    public MainPage sendNereden() {
        sendKeys(NEREDEN, "Ankara");
        return this;
    }
    public MainPage sendNereye() {
        sendKeys(NEREYE, "İstanbul");
        return this;
    }
    public MainPage sendGidisTarih() {
        sendKeys(GIDIS_TARIH, "2024-01-12");
        return this;
    }
    public MainPage sendDonusTarih() {
        sendKeys(DONUS_TARIH, "2022-02-12");
        return this;
    }
    public MainPage clickAktarmasiz() {
        click(AKTARMASIZ);
        return this;
    }
    public MainPage sendYolcuSayisi() {
        sendKeys(YOLCU_SAYISI, "1 Yolcu / Ekonomi");
        return this;
    }
    public MainPage clickBiletBul() {
        click(CLICK_BILET_BUL);
        return this;
    }
}