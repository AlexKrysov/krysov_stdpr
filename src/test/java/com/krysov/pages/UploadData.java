package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class UploadData {

    private SelenideElement
            uploadInput = $(".uploadInput.svelte-233l5r");

    public void uploadInputPage() {
        step("Загружаем резюме", () ->
                uploadInput.uploadFromClasspath("pdf/Krysov_QA_ENGINEER.pdf"));
    }
}
