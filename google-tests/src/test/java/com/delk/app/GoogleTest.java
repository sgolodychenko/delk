package com.delk.app;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;


/**
 * Created by Serhiy_Golodychenko on 7/15/2016.
 */
public class GoogleTest {
    @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\delk\\chromedriver\\chromedriver.exe");
        open("https://www.google.com.ua/");
        $(By.name("q")).setValue("delk").pressEnter();
        //$("#ires li.g").shouldHave(text("Wikipedia, the free encyclopedia"));
        $$("#ires .g").shouldHave(size(10));
    }
}