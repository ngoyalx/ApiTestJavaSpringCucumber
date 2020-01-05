package com.test.mobile.middleware.data.enums;

public enum ErrorCodes {
    INVALID_PNR_CODE(""),
    INVALID_PNR_MESSAGE(""),
    GROUP_PNR_ERROR_CODE(""),
    GROUP_PNR_ERROR_MESSAGE(""),
    INVALID_LASTNAME_CODE(""),
    INVALID_LASTNAME_MESSAGE(""),
    INVALID_LASTNAME("XXXXX"),
    BLANK_LASTNAME(""),
    INVALID_PNR("HPXYWP");

    private String errorText;

    ErrorCodes(String errorStr) { errorText = errorStr; }

    public String getText () {
        return errorText;
    }
}