package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class JobsSectionTest extends TestBase {

    @DisplayName("Проверка заполнения формы с валидными данными")
    @Owner("Krysov")
    @Tag("PositiveFormTest")
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
    @Tag("PositiveFormTest")
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

    @DisplayName("Проверка заполнения формы с пустым полем 'Имя'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutName() {
        openPage.openStdprPage();
        navigationPage.openJobsSectionTesting();
        navigationPage.openVacancyTesting();
        navigationPage.clickJobApplyButton();
        randomData.setRandomPhone();
        randomData.setRandomCity();
        randomData.setRandomTelegram();
        navigationPage.clickAgreeCheckmark();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Номер телефона'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutPhoneNumber() {
        openPage.openStdprPage();
        navigationPage.openJobsSectionTesting();
        navigationPage.openVacancyTesting();
        navigationPage.clickJobApplyButton();
        randomData.setRandomName();
        randomData.setRandomCity();
        randomData.setRandomTelegram();
        navigationPage.clickAgreeCheckmark();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'город'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormWithoutCity() {
        openPage.openStdprPage();
        navigationPage.openJobsSectionTesting();
        navigationPage.openVacancyTesting();
        navigationPage.clickJobApplyButton();
        randomData.setRandomName();
        randomData.setRandomPhone();
        randomData.setRandomTelegram();
        navigationPage.clickAgreeCheckmark();
        uploadData.uploadInputPage();
        checkPage.checkForm();
    }
}
