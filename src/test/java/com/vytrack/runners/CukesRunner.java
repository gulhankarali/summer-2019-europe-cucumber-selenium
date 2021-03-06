package com.vytrack.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        // where our feature files are located
        features = "src/test/resources/features/",
        glue="com/vytrack/step_definitions/",
        dryRun = false,
        // tags = "@store_manager or @driver or @sales_manager"
        // tags= "@login"
        // tags= "@driver and @VYT-123"
        // tags={"@driver", "VYT-123"}
        // tags = "@login and not @wip"
        // tags= {"@login","~@wip"}
         tags="@wip"
)

public class CukesRunner {

}
