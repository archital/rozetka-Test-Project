package com.luxoft.rozetka;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by APopichenko on 05.04.2017.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/LookupADefinition.feature",
        plugin="pretty", glue ={"com.luxoft.rozetka.steps.serenity"})
public class TestRunner {

}
