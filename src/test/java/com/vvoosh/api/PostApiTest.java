package com.vvoosh.api;


import com.vvoosh.payloads.request.PostPayload;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by rossy on 31/08/2017.
 */
public class PostApiTest {
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
    public void posting200() {
        PostPayload postPayload = new PostPayload.postPayloadBuilder()
                .setPrivacyLevel("REGISTERED")
                .setTitle("title api post 1217")
                .setText("POST API TEXT")
                .build();
        given().
                proxy("localhost", 8888).
                and().
                relaxedHTTPSValidation().
                and().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().
                header("cookie", cookieSession).
                contentType("application/json").
                and().
                body(postPayload).
                when().
                post("https://test-vpc.vvoosh.com/data/communitypost").
                then().
                statusCode(200);

    }




    @Test
    public void postingPrivacyPostWithTitleAndDrescription() {
         String myJson = "{\"title\":\"Summer and weather 04 sep 1040\", \"PrivacyLevel\":\"REGISTERED\", \"text\":\"is this text there \"}";

        given().
                proxy("localhost", 8888).
                and().
                relaxedHTTPSValidation().
                and().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().
                header("cookie", cookieSession).
                contentType("application/json").
                and().
                body(myJson).
                when().
                post("https://test-vpc.vvoosh.com/data/communitypost").
                then().
                statusCode(200);
    }

}
