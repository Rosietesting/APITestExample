package com.vvoosh.api;


import com.vvoosh.api.api.Post.*;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * Created by rossy on 31/08/2017.
 */
public class PostApiTest {
    String cookieSession;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

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
        PostBody postBody = new PostBody();
        content postContent = new content();
        jsonBody postJsonBody = new jsonBody();
        sections postSections = new sections();
        author postAuthor = new author();
        List <sections> postSectionList = new ArrayList<sections>();
        List <Integer> interestIdsList = new ArrayList<Integer>();
        List <Object> postVerbSummariesList = new ArrayList<Object>();
        List <Object> postHashTagsList = new ArrayList<Object>();
        List <Object> postPlacesList = new ArrayList<Object>();
        postAuthor.setId(226);
        postBody.setPrivacyLevel("REGISTERED");
        postBody.setTitle("RestAssured post at " + dateFormat.format(date));
        interestIdsList.add(379);
        postBody.setInterestIds(interestIdsList);
        postBody.setVerbSummaries(postVerbSummariesList);
        postContent.setText("PostText");
        postSections.setType("text");
        postBody.setPlaces(postPlacesList);
        postSections.setContent(postContent);
        postBody.setAuthor(postAuthor);
        postSectionList.add(postSections);
        postJsonBody.setsections(postSectionList);
        postBody.setJsonBody(postJsonBody);
        postBody.setHashTags(postHashTagsList);
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
                body(postBody).
                when().
                post("https://test-vpc.vvoosh.com/data/communitypost").
                then().
                statusCode(200);

    }



}
