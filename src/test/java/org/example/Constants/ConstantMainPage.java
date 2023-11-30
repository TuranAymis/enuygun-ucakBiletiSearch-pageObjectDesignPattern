package org.example.Constants;
import org.openqa.selenium.By;

public class ConstantMainPage { //testte kullanıcak elementleri tanımladık
    public static final By GIDIS_DONUS = By.xpath("//label[@data-testid='search-round-trip-label']");
    public static final By NEREDEN = By.xpath("//input[@data-testid='endesign-flight-origin-autosuggestion-input']");
    public static final By NEREYE = By.xpath("//input[@data-testid='endesign-flight-destination-autosuggestion-input']");
    public static final By ONERILEN_ILK = By.xpath("(//div[@class='sc-inyXkq kXIpqf'])[1]");
    public static final By GIDIS_TARIH = By.xpath("//input[@data-testid='enuygun-homepage-flight-departureDate-datepicker-input']");
    public static final By GIDIS_GUN_SEC = By.xpath("(//button[@data-day='30'])[1]");
    public static final By DONUS_TARIH = By.xpath("//input[@data-testid='enuygun-homepage-flight-returnDate-datepicker-input']");
    public static final By DONUS_GUN_SEC = By.xpath("(//button[@data-day='30'])[2]");
    public static final By AKTARMASIZ = By.xpath("(//div[@data-testid='flight-oneWayCheckbox-text'])[1]");
    public static final By YOLCU_SAYISI = By.xpath("//input[@data-testid='undefined-popover-button']");
    public static final By YOLCU_SAYISI_ARTTIR = By.xpath("//button[@data-testid='flight-adult-counter-plus-button']");
    public static final By BUSINESS_SEC = By.xpath("//button[@data-testid='enuygun-homepage-flight-businessCabin']");
    public static final By CLICK_BILET_BUL = By.xpath("//button[@data-testid='enuygun-homepage-flight-submitButton']");
    public static final By IKINCI_SAYFA_KONTROL = By.xpath("(//span[text()='Aramayı Düzenle'])[2]");

}
