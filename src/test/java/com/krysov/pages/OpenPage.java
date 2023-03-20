package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenPage {

    private final String CompanyUrl = "https://stdpr.ru/";

    public void openStdprPage() {
        step("Открыть страницу", () ->
                open(CompanyUrl));
    }
}
