package com.delk.app;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;


/**
 * Created by Serhiy_Golodychenko on 7/15/2016.
 */
public class EsuranceTest {

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "D:\\Projects\\delk\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\Projects\\delk\\geckodriver\\geckodriver.exe");
    }

    @Test
    public void userCanGetQuoteByScenicRoute() throws Exception {
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
        //Page 5 - esurance customers
        $(id("companies.business_name")).setValue("Developers corp");
        $(id("companies.contact_name")).setValue("John Doh");
        $(id("companies.contact_phone")).setValue("1-866-333-4606");
        $(id("companies.phone")).setValue("1-866-333-4603");
        $(id("companies.email")).setValue("john.doh@gmail.com");
        $(id("companies.state")).setValue("CA");
        $(id("companies.nature")).setValue("IT");
        $(id("type_CA")).click();
        $(name("submit")).pressEnter();

        //Page 6 - Thank You
        $(id("companies.contact_name")).setValue("John");
        $(id("companies.contact_phone")).setValue("1-866-333-4606").pressEnter();

        //Page 7 - Quote
        $(id("companies.zipcode")).setValue("94949");
        $(id("companies.city")).setValue("California");
        $(id("companies.state")).setValue("CA");
        $(id("companies.email")).setValue("john.doh@gmail.com");
        $(id("companies.nature")).setValue("IT");
        $(name("submit")).pressEnter();

        //Page 8 - Confirmation
        $(id("confirmation_internal")).exists();
        System.out.println($(id("confirmation_internal")));
    }

    @Test
    public void userCanGetQuoteByExpressLane() throws Exception {
        open("https://www.esurance.com/");
        //Page 1
        $(id("ProductList")).setValue("Auto");
        $(id("txtZipCode")).setValue("94949");
        $(id("btnGoZip")).pressEnter();
        //Page 2
        $(id("IBWC1_Clickable")).pressEnter();
        //Page 3 - Basics
        $(id("ODI1_FirstNameData")).setValue("John");
        $(id("ODI1_MiddleInitialData")).setValue("M");
        $(id("ODI1_LastNameData")).setValue("Doh");
        $(id("ODI1_BirthDateData_Month")).setValue("09");
        $(id("ODI1_BirthDateData_Day")).setValue("15");
        $(id("ODI1_BirthDateData_Year")).setValue("1982");
        $(id("ODI1_StreetAddressData")).setValue("4 Madrid Ct");
        $(id("ValidateExistingEsurancePolicy_Clickable")).pressEnter();
        //Page 4 - Car Info
        $(id("VCN1_YearData")).setValue("2013");
        $(id("VCN1_MakeIdDisplayData")).setValue("134");
        $(id("VCN1_ModelIdDisplayData")).setValue("19645");
        $(id("VCN1_VehiclePaymentTypeCd_CAData")).setValue("P");
        $(id("VCN1_VehicleUsageTypeCdData")).setValue("B");
        $(id("VCN1_AnnualMileage_CAData")).setValue("10000");
        $(id("IBWC2_Clickable")).pressEnter();
        //Page 5 - Car Use
        $(id("CQC1_CommercialQuestionControlItems_5Data")).click();
        $(id("IBWC2_Clickable")).pressEnter();
        //Page 6 - esurance customers
        $(id("companies.business_name")).setValue("Developers corp");
        $(id("companies.contact_name")).setValue("John Doh");
        $(id("companies.contact_phone")).setValue("1-866-333-4606");
        $(id("companies.phone")).setValue("1-866-333-4603");
        $(id("companies.email")).setValue("john.doh@gmail.com");
        $(id("companies.state")).setValue("CA");
        $(id("companies.nature")).setValue("IT");
        $(id("type_CA")).click();
        $(name("submit")).pressEnter();

        //Page 6 - Thank You
        $(id("companies.contact_name")).setValue("John");
        $(id("companies.contact_phone")).setValue("1-866-333-4606").pressEnter();

        //Page 7 - Quote
        $(id("companies.zipcode")).setValue("94949");
        $(id("companies.city")).setValue("California");
        $(id("companies.state")).setValue("CA");
        $(id("companies.email")).setValue("john.doh@gmail.com");
        $(id("companies.nature")).setValue("IT");
        $(name("submit")).pressEnter();

        //Page 8 - Confirmation
        $(id("confirmation_internal")).exists();
        System.out.println($(id("confirmation_internal")));
    }

    @Ignore @Test
    public void userCanSearchKeywordWithGoogle() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\delk\\chromedriver\\chromedriver.exe");
        open("https://www.google.com.ua/");
        $(name("q")).setValue("delk").pressEnter();
        //$("#ires li.g").shouldHave(text("Wikipedia, the free encyclopedia"));
        $$("#ires .g").shouldHave(size(10));
        //zip 94949
    }

}