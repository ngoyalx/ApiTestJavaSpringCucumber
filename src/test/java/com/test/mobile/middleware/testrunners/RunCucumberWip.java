package com.test.mobile.middleware.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.TestPropertySource;

@RunWith(Cucumber.class)
@TestPropertySource({"classpath:endpoints.properties"})
@CucumberOptions(
    tags = ("@wip"),
    features = {"src/test/resources/features/"},
    plugin = {"pretty", "html:target/cucumber-reports"
            , "json:target/cucumber-reports/Cucumber.json"},
    glue = {"com.emirates.mobile.middleware"})
public class RunCucumberWip {
}
