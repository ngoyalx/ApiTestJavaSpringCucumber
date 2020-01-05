package com.test.mobile.middleware.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.TestPropertySource;

@RunWith(Cucumber.class)
@TestPropertySource({"classpath:endpoints.properties"})
@CucumberOptions(
    tags = {"not @pending", "not @TDB", "not @skywards"},
    features = {"src/test/resources/features/get_comments.feature"},
    plugin = {"pretty", "html:target/cucumber-reports"
            , "json:target/cucumber-reports/Cucumber.json"
    },
    glue = {"com.test.mobile.middleware"})
public class RunCucumberITTest {
}

