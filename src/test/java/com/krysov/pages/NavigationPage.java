package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationPage {

    private SelenideElement
            jobsSectionTesting = $(".jobsSection.svelte-129cjbq").$(byText("Тестирование")),
            openVacancy = $(".jobToggle.svelte-129cjbq"),
            agreeCheckmark = $(".agreeCheckmark.svelte-233l5r"),
            jobApplyButton = $(".jobApplyButton.svelte-129cjbq");

    public void openJobsSectionTesting() {
        step("Переходим в раздел 'Тестирования'", () -> {
            jobsSectionTesting.click();
        });
    }

    public void openVacancyTesting() {
        step("Открываем данные о вакансии 'QA engineer'", () -> {
            openVacancy.click();
        });
    }

    public void clickJobApplyButton() {
        step("Нажимаем на кнопку 'Откликнуться'", () -> {
            jobApplyButton.click();
        });
    }

    public void clickAgreeCheckmark() {
        step("Соглашаемся на обработку данных", () -> {
            agreeCheckmark.click();
        });
    }
}
