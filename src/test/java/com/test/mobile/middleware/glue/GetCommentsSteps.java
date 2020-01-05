package com.test.mobile.middleware.glue;

import com.test.mobile.middleware.providers.GetCommentsDetails;
import com.test.mobile.middleware.requests.GetCommentsRequest;
import cucumber.api.java8.En;
import io.cucumber.datatable.DataTable;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class GetCommentsSteps implements En {

    @Autowired
    private GetCommentsRequest getCommentsRequest;

    @Autowired
    private GetCommentsDetails getCommentsDetails;

    private Response response;

    public GetCommentsSteps(){
        Given("^I am an authorized user$", () -> {
            System.out.println("I am an authorized user");
        });

        When("^I hit the get comments api$", () -> {
            response = getCommentsRequest.getResponse();
            System.out.println(response.asString());
            Allure.addAttachment("getcommentsResponse", response.asString());
            getCommentsDetails.setGetCommentDetails(response);
        });

        Then("^verify email id is not blank$", () -> {
            Assert.assertTrue("Email is not blank",
                    getCommentsDetails.getEmail()!="");
        });

        Then("^verify parameters as following:$", (DataTable dataTable) -> {
            List<Map<String, String>> dataTableList = dataTable.asMaps(String.class, String.class);
            dataTableList.forEach(dataTableMap -> {
                dataTableMap.keySet().forEach(key -> {
                    switch (key) {
                        case "Email":
                            Assert.assertTrue(true);
                            break;

                        case "Name":
                            Assert.assertTrue(true);
                            break;
                    }
                });
            });
        });
    }
}
