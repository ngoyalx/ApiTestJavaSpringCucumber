package com.test.mobile.middleware.support.utils;

import com.test.mobile.middleware.data.Headers;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Component
public class RestUtil {

    @Autowired
    private Headers headers;

    public Response getRequest(String endPointURL) {
        return given()
                .get(endPointURL);
    }
}
