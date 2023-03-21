package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement
            submitButton = $(".submitBox.svelte-233l5r");

    public void checkForm() {
        step("Проверка формы 'Отклик на вакансию'(кнопки, чтоб не спамить)", () ->
                submitButton.shouldHave(text("Отправить")));
    }
}
