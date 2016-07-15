package com.delk.app;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Serhiy_Golodychenko on 7/15/2016.
 */
public class GoogleTests {
    public GoogleTests() {
    }

    @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        open("http://google.com");

    }
}