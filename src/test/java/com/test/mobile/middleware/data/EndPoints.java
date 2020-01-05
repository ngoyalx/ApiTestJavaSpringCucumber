package com.test.mobile.middleware.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EndPoints {

    @Value("${baseURI}")
    private String baseURI;
    @Value("${getComments}")
    private String getComments;


    //************************ Open Services ************************
    public String getGetCommentsEndpointURL() { return baseURI + getComments; }
}
