package com.test.mobile.middleware.requests;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;

@Component
public class GetCommentsRequest extends BaseRequest {

    public Response getResponse(){
        return restUtil.getRequest(endPoints.getGetCommentsEndpointURL());
    }
}
