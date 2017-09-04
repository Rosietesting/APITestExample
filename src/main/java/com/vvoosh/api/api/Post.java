package com.vvoosh.api.api;

import com.vvoosh.payloads.request.PostPayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * Created by rossy on 31/08/2017.
 */
public class Post {
    private static String baseUrl = "http://test-vpc.vvoosh.com";

    public static Response getPost(){
        return given().get(baseUrl + "/data/communitypost");

    }

    public static Response postPost(PostPayload payload){
        return given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(baseUrl + "/data/communitypost");



    }
}
