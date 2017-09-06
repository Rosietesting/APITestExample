package com.vvoosh.api;

import com.vvoosh.api.api.Registration.Registration;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by rossy on 05/09/2017.
 */
public class RegistrationApiTest {
    String cookieSession;
    @Before
    public void beforeTest() {
        String response =given().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().
                formParam("email", "226-vv@mailinator.com").
                formParam("password", "test1234").
                when().
                post("https://test-vpc.vvoosh.com/process-login").
                then().
                statusCode(302).
                and().
                extract().header("Set-Cookie");
                this.cookieSession=response;

    }


    @Test
    public void RegisterUser(){
        Registration newUser = new Registration();
        newUser.setFirstName("Tony");
        newUser.setMiddleName("A");
        newUser.setLastName("Stone");
        newUser.setPassword("test1234");
        newUser.setConfirmPassword("test1234");
        newUser.setInviteCode("code");
        newUser.setGenderId(2);//2 Female 1 Male
        newUser.setDateOfBirth("225072000000");
        newUser.setGooglePlaceId("4517501182432a6539985e4dbd00278179f70a98");
        newUser.setLocationFormatted("Bogor, West Java, Indonesia");
        newUser.setLatitude(25);
        newUser.setLongitude(55);
        newUser.setTermsAndConditions(true);
        newUser.setPersonalDetailsPrivacyLevel("REGISTERED");
        newUser.setContactInformationPrivacyLevel("FRIENDS");
        newUser.setAboutMePrivacyLevel("FRIENDS");
        newUser.setFriendListPrivacyLevel("REGISTERED");
        newUser.setInterestListPrivacyLevel("REGISTERED");
        newUser.setAllMediaPrivacyLevel("REGISTERED");
        newUser.setMobileNumber("07714589532");
        newUser.setTwitterHandle("twitterme");
        newUser.setAboutMe("it's me");
        newUser.setRelationshipStatus(1);
        newUser.setCanUseEventAdmin(true);
        newUser.setBackgroundImageUri("Image");
        newUser.setResetDefaultProfileImage(true);
        newUser.setResetDefaultHeroImage(true);
        newUser.setCaptcha("03AOmkcwJqiwbiT542fL9mXSIQ81UdZ1cca7hzJDnHxSppNCfd4OTGIXwPOwPxGfLkcxb7gaE5MQdDEtqjv9YP47HnH3uqU0aX_oh7wMwanyZTrsBqVNu6y1z2Bq_0UmhTpv-ezr-cDAA-MPZBNDBc87o_t0WRNnHiRljls_0jBWSI8yC8FH0aR5Ai0xx9k2XDF3-sHsnsOjVN9XEKlYZJvXTeBfMX2FcIUcV1wd9GHgIjNrabKrq6g94FLD6EaRPouvdluwdMDzI9oCtt8ogW8GBaTQ-4nPsEEeFCJx0BeEI2y-7YTMnrqKWAF6pLflU2cTu7EtWp24FK0TCCEXRfR4GIYxPfY4qBZD__H4XqObp8dbJ3Fn9tPJnV441xCzrQ-rySs4jiQ8PcUaYTCl_jZm2oPC6OxuWt3T1ln_JzuGBnDaNQ1LqYKbpd3mbdWlzsUj5X1ur6g5v3Zz0Kl8_t7yvEEgbafb0nww");
        //newUser.List<set> languages = null;
        //newUser.List<set> skills = null;
        newUser.setLanguagesPrivacyLevel("REGISTERED");
        newUser.setSkillsPrivacyLevel("REGISTERED");
        newUser.setEmailsFriendRequestEnabled(true);
        newUser.setEmailsFriendRequestAcceptedEnabled(true);
        newUser.setEmailsEventInviteEnabled(true);
        newUser.setEmailsEventEndedEnabled(true);
        newUser.setEmail("MarkStonea@mailinator.com");
        given().
                proxy("localhost", 8888).
                and().
                relaxedHTTPSValidation().
                and().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().
                contentType("application/json").
                and().
                body(newUser).
                when().
                post("https://test-vpc.vvoosh.com/data/test/register").
                then().
                statusCode(201);
    }

}
