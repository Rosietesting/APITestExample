package Utilities;

import org.junit.Test;

import static io.restassured.RestAssured.given;
/**
 * Created by rossy on 04/09/2017.
 */
public class TestEnvironment {


    @Test
     public static String  getCookie() {
        String cookieSession;
        String response = given().
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
                cookieSession = response;
        return  cookieSession;
    }
}
