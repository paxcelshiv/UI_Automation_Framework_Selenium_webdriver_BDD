package com.adidas.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = { "codebinding" },
        // dry run using for generate feature steps
        dryRun=true,
        monochrome=true
)
public class JUnitTestRunner {

}
