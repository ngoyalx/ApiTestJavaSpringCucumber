package com.test.mobile.middleware.providers;

import com.test.mobile.middleware.support.dto.getcommentsdetails.GetCommentsResponse;
import io.restassured.response.Response;
import org.springframework.stereotype.Component;

@Component
public class GetCommentsDetails {

    private GetCommentsResponse[] getCommentsResponse;

    public void setGetCommentDetails(Response response){
        this.getCommentsResponse = response.getBody().as(GetCommentsResponse[].class);
    }

    public GetCommentsResponse[] getCommentsResponse(){
        return this.getCommentsResponse;
    }

    public String getName(){
        return getCommentsResponse[0].getName();
    }

    public String getEmail(){
        return getCommentsResponse[0].getEmail();
    }
}
