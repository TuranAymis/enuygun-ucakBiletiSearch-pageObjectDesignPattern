package org.example.test;

import org.example.base.BaseTest;
import org.example.page.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainPageTest extends BaseTest {
    MainPage mainPage;

    @Before
    public void before() {
        mainPage = new MainPage(getWebDriver());
    }

    @Test
    public void test() {
        mainPage.clickGidisDonus().sendNereden().clickOnerilenIlk().sendNereye().clickOnerilenIlk().clickGidisTarih().clickGidisGunSec().clickDonusTarih().clickDonusGunSec().clickYolcuSayisi().clickYolcuSayisiArttir().clickBusinessSec().clickAktarmasiz().clickBiletBul().ikinciSayfaKontrol();
    }

    @After
    public void after() {
        tearDown();
    }
}
