package com.amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class Cukes_Runner {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = "https://www.amazon.",
            features = "src/test/resources/Feature",
            glue = "com/amazon/step_definitions",
            dryRun = false,
            tags = "@search"
    )
    public class Cukes_Runner {

    }

}
