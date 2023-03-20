package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class InputData {

    private SelenideElement
            name = $("[placeholder='Имя*']"),
            city = $("[placeholder='Город*']"),
            telegram = $("[placeholder='Имя в телеграм']"),
            phone = $("[placeholder='Телефон*']");

    private String nameData = "Алексей";
    private String phoneData = "9609898725";
    private String cityData = "Omsk";
    private String telegramData = "https://t.me/KrysovAlex";


    public void setName() {
        step("Вводим имя", () -> {
            name.setValue(nameData);
        });
    }

    public void setCity() {
        step("Вводим город", () -> {
            city.setValue(cityData);
        });
    }

    public void setPhone() {
        step("Вводим номер телефона", () -> {
            phone.setValue(phoneData);
        });
    }

    public void setTelegram() {
        step("Вводим ссылку на телеграм", () -> {
            telegram.setValue(telegramData);
        });
    }
}
