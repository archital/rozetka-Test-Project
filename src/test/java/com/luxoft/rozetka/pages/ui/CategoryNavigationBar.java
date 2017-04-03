package com.luxoft.rozetka.pages.ui;

import com.luxoft.rozetka.pages.model.Category;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by APopichenko on 03.04.2017.
 */
public class CategoryNavigationBar extends PageObject {
    public void selectCatwgory(Category category) {
        $("*[id=2416]").find(By.linkText(category.name())).click();

    }
}
