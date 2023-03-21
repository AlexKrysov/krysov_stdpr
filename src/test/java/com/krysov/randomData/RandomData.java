package com.krysov.randomData;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RandomData {

    public static Faker faker = new Faker();

    private SelenideElement
            name = $("[placeholder='Имя*']"),
            city = $("[placeholder='Город*']"),
            telegram = $("[placeholder='Имя в телеграм']"),
            phone = $("[placeholder='Телефон*']");


    private String randomEmail = faker.internet().emailAddress();

    private String randomCity = faker.address().city();
    private String randomName = faker.name().firstName();
    private String randomPhone = faker.phoneNumber().phoneNumber();


    public void setRandomName() {
        step("Вводим рандомное имя", () -> {
            name.setValue(randomName);
        });
    }

    public void setRandomCity() {
        step("Вводим рандомный город", () -> {
            city.setValue(randomCity);
        });
    }

    public void setRandomPhone() {
        step("Вводим рандомный номер телефона", () -> {
            phone.setValue(randomPhone);
        });
    }

    public void setRandomTelegram() {
        step("Вводим рандомный адрес электронной почты", () -> {
            telegram.setValue(randomEmail);
        });
    }
}
