package com.luxoft.rozetka.navigation;

import com.luxoft.rozetka.pages.model.Category;
import com.luxoft.rozetka.steps.serenity.NavigatingUser;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by APopichenko on 03.04.2017.
 */

public class WhenBrowsingProductionsCategories {

    @Steps
    NavigatingUser mark;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToTheComputersAndLaptopsCategory() {
     //given
        mark.isOnTheHomePage();
     //When
        mark.navigatesToCategoty(Category.ComputersAndLaptops);
     //Then
        mark.shouldSeePageTitleContaining("Компьютеры и ноутбуки");
    }
}
