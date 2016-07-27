package com.delk.app;

import org.junit.Ignore;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;


/**
 * Created by Serhiy_Golodychenko on 7/15/2016.
 */
public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\delk\\chromedriver\\chromedriver.exe");
        open("https://www.google.com.ua/");
        $(name("q")).setValue("delk").pressEnter();
        //$("#ires li.g").shouldHave(text("Wikipedia, the free encyclopedia"));
        $$("#ires .g").shouldHave(size(10));
        //zip 94949
    }
    @Test
    public void userCanGetEsuranceQuote() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\delk\\chromedriver\\chromedriver.exe");
        open("https://www.esurance.com/");
        //Page 1
        $(id("ProductList")).setValue("Auto");
        $(id("txtZipCode")).setValue("94949");
        $(id("btnGoZip")).pressEnter();
        //Page 2
        $(id("IBWC2_Clickable")).pressEnter();
        //Page 3 - Car Info
        $(id("VC1_YearData")).setValue("2013");
        $(id("VC1_MakeIdDisplayData")).setValue("134");
        $(id("VC1_ModelIdDisplayData")).setValue("19645");
        $(id("VC1_VehiclePaymentTypeCd_CAData")).setValue("P");
        $(id("VC1_VehicleUsageTypeCdData")).setValue("B");
        $(id("VC1_AnnualMileage_CAData")).setValue("10000");
        $(id("VCAC1_AddVehicle_N")).setValue("N");
        $(id("IBWC2_Clickable")).pressEnter();
        //Page 4 - Car Use
        $(id("CQC1_CommercialQuestionControlItems_5Data")).click();
        $(id("IBWC2_Clickable")).pressEnter();

//        $(id("ODI1_FirstNameData")).setValue("John");
//        $(id("ODI1_LastNameData")).setValue("Do");
//        $(id("ODI1_BirthDateData_Month")).setValue("09");
//        $(id("ODI1_BirthDateData_Day")).setValue("15");
//        $(id("ODI1_BirthDateData_Year")).setValue("1982");
//        $(id("ODI1_StreetAddressData")).setValue("4 Madrid Ct");
//        $(id("ValidateExistingEsurancePolicy_Clickable")).pressEnter();
//        //Page 4
    }
}