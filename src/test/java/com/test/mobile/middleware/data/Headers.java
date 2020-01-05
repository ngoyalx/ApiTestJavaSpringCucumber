package com.test.mobile.middleware.data;

import io.restassured.http.Header;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Component
public class Headers {

    private List<Header> headers = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public io.restassured.http.Headers getHeaders () {
        if (headers == null || headers.isEmpty()) {
            headers = new ArrayList(
                    asList(
                            new Header("locale", "global/english")
                    )
            );
        }
        return new io.restassured.http.Headers(headers);
    }

    public void addAHeader (Header header) {
        headers.add(header);
    }

    public void resetHeaders () {
        if (headers != null) headers.clear();
    }
}
