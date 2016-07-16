package com.delk.app;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Serhiy_Golodychenko on 7/15/2016.
 */
public class GoogleTests {
    @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\delk\\chromedriver\\chromedriver.exe");
        open("https://www.google.com.ua/");

    }
}