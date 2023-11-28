package org.example.Constants;
import org.openqa.selenium.By;

public class ConstantMainPage {
    public static final By NEREDEN = By.xpath("//input[@data-testid='endesign-flight-origin-autosuggestion-input']");
    public static final By NEREYE = By.xpath("//input[@data-testid='endesign-flight-destination-autosuggestion-input']");
    public static final By GIDIS_TARIH = By.xpath("//input[@data-testid='enuygun-homepage-flight-departureDate-datepicker-input']");
    public static final By DONUS_TARIH = By.xpath("//input[@data-testid='enuygun-homepage-flight-returnDate-datepicker-input']");
    public static final By AKTARMASIZ = By.xpath("(//div[@data-testid='flight-oneWayCheckbox-text'])[1]");
    public static final By YOLCU_SAYISI = By.xpath("//input[@data-testid='undefined-popover-button']");
    public static final By CLICK_BILET_BUL = By.xpath("//button[@data-testid='enuygun-homepage-flight-submitButton']");

}
