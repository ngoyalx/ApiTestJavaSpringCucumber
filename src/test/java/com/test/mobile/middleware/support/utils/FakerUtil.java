package com.test.mobile.middleware.support.utils;

import com.test.mobile.middleware.data.enums.Months;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class FakerUtil {

    @Autowired
    private Faker getFaker;

    @Autowired
    private FakeValuesService getFakeValuesService;

    public String cellPhone() {
        return getFaker.numerify(getFakeValuesService.resolve("cell_phone.formats", this, getFaker));
    }

    public String country() {
        return getFaker.address().countryCode();
    }

    public String email() {
        return (getFaker.internet().emailAddress()).replace("@", "//");
    }

    public String phoneNumber() {
        String phoneNumber = getFakeValuesService.regexify("[1-9]{10}");
        Matcher alphaNumericMatcher = Pattern.compile("[1-9]{10}").matcher(phoneNumber);
        return phoneNumber;
    }

    public String emiratesEmail() {
        String email = getFakeValuesService.bothify("#####//EMIRATES.COM");
        Matcher emailMatcher = Pattern.compile("\\d{5}//EMIRATES.COM").matcher(email);
        email = "S" + email;
        return email;
    }

    public String passport() {
        String passportNumber = getFakeValuesService.regexify("[A-Z]{1}[0-9]{7}");
        Matcher alphaNumericMatcher = Pattern.compile("[A-Z]{1}[0-9]{7}").matcher(passportNumber);
        return passportNumber;
    }

    public String visaNo() {
        String visaNo = getFakeValuesService.regexify("[A-Z]{1}[0-9]{7}");
        Matcher alphaNumericMatcher = Pattern.compile("[A-Z]{1}[0-9]{7}").matcher(visaNo);
        return visaNo;
    }

    public String expirationDate() {
        String expirationDate = getFakeValuesService.regexify("[1-2]{1}[1-8]{1}[-][2]{1}[1-3]{1}");
        Matcher alphaNumericMatcher = Pattern.compile("[1-2]{1}[1-8]{1}[-][2]{1}[1-3]{1}").matcher(expirationDate);
        expirationDate = expirationDate.replace("-", Months.getRandomMonth().name());
        return expirationDate;
    }

    public String dateOfBirth() {
        String dob = getFakeValuesService.regexify("[1-2]{1}[1-8]{1}[-][8]{1}[1-9]{1}");
        Matcher alphaNumericMatcher = Pattern.compile("[1-2]{1}[1-8]{1}[-][8]{1}[1-9]{1}").matcher(dob);
        dob = dob.replace("-", Months.getRandomMonth().name());
        return dob;
    }

    public String getPostalCode(){
        return getFaker.address().zipCode();
    }

    public String getAddress(){
        return getFaker.address().streetAddress();
    }
}