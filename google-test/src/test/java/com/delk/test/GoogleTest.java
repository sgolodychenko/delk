package com.delk.test;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Serhiy_Golodychenko on 7/13/2016.
 */
public class GoogleTest {
    @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        open("http://google.com");

    }
}
