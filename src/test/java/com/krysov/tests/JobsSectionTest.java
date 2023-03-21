package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class JobsSectionTest extends TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @DisplayName("Проверка заполнения формы с валидными данными")
    @Owner("Krysov")
    @Test
    void checkForm() {
        openPage.openStdprPage();
        navigationPage.openJobsSectionTesting();
        navigationPage.openVacancyTesting();
        navigationPage.clickJobApplyButton();
        inputData.setName();
        inputData.setCity();
        inputData.setPhone();
        inputData.setTelegram();
        navigationPage.clickAgreeCheckmark();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с валидными, рандомными данными")
    @Owner("Krysov")
    @Test
    void checkFormWithRandomData() {
        openPage.openStdprPage();
        navigationPage.openJobsSectionTesting();
        navigationPage.openVacancyTesting();
        navigationPage.clickJobApplyButton();
        randomData.setRandomName();
        randomData.setRandomPhone();
        randomData.setRandomCity();
        randomData.setRandomTelegram();
        navigationPage.clickAgreeCheckmark();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }
}
