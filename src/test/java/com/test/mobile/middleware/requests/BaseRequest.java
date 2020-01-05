package com.test.mobile.middleware.requests;

import com.test.mobile.middleware.data.EndPoints;
import com.test.mobile.middleware.support.utils.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseRequest {
    @Autowired
    public RestUtil restUtil;
    @Autowired
    public EndPoints endPoints;
}
