package com.luxoft.rozetka.steps.serenity;

import com.luxoft.rozetka.pages.model.Category;
import com.luxoft.rozetka.pages.ui.CategoryNavigationBar;
import com.luxoft.rozetka.pages.ui.CurrentPage;
import com.luxoft.rozetka.pages.ui.RozetkaHomePage;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Step;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by APopichenko on 03.04.2017.
 */
@RunWith(CucumberWithSerenity.class)
public class NavigatingUser {
    RozetkaHomePage rozetkaHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step
    public void isOnTheHomePage() {
    rozetkaHomePage.open();
    }
    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }
    @Step
    public void navigatesToCategoty(Category category) {
    categoryNavigationBar.selectCatwgory(category);
    }
}
