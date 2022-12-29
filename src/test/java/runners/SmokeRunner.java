package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use provide the path of all the features files
        features = "src/test/resources/features/",
        glue = "steps",
        //when you set dry run to true, it stops actual execution
        //it will quickly scan all the gherkin steps whether they are implemented or not
        //when we set dry run to false, it starts execution again
        dryRun = false,
        tags = "@tc1101",
        //to remove irrelevant information from console you need to set monochrome to true
        monochrome = true,
        //pretty keyword prints the steps in the console to increase readability
        //to generate the reports we need plugin of runner class
        //when we generate any report, this should be under target folder
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json" }

)
class SmokeRunner {
}
