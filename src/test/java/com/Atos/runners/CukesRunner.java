package com.Atos.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/default-html-reports",
                "rerun:target/cucumber-reports/rerun.txt",
                },
        features = "src/test/resources/features",
        glue = "com/Atos/step_definitions",
        dryRun = false,
        tags = "@FNW-561"
)
public class CukesRunner {

}
