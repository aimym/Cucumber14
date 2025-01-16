package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//This runner class is responsible to run only failed test cases
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature files
        features = "@target/failed.txt",
        //glue is the keyword we use to find the gherkin step def
        //we provide  the path of steps package where we have all step defs
        glue = "steps",
        //dry run stops the actual execution when set to true
        //it will scan all the steps definitions and provide if there is any step def missing
        // dryRun = false,
        //tags = "@sprint1 and @sprint4"
        monochrome = true,
        plugin = {"pretty"}
)




public class FailedRunner {
}
