import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by rossy on 31/08/2017.
 */
public class AuthenticationTest {
    @Test
    public void aUserCanLoginWithValidCredentials() {
        String response =
                given().
                        header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                        formParam("email", "226-vv@mailinator.com").
                        formParam("password", "test1234").
                        when().
                        post("https://test-vpc.vvoosh.com/process-login").
                        then().
                        statusCode(302).
                        and().
                        extract().header("location");
        //extract the cookie header and save it to use in other test
        Assert.assertFalse(response.contains("login-failed"));


    }

    @Test
    public void aUserCannotLoginWithIncorrectEmail() {
        String response=
                given().
                        header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                        and().
                        formParam("email", "none@mailinator.com").
                        formParam("password", "test1234").
                        when().
                        post("https://test-vpc.vvoosh.com/process-login").
                        then().
                        statusCode(302).
                        and().
                        extract().header("location");
        Assert.assertTrue(response.contains("https://test-vpc.vvoosh.com/login-failed"));

    }

    @Test
    public void aUserCannotLoginWithIncorrectPassword() {
        String response =
                given().
                        header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                        and().
                        formParam("email", "226-vv@mailinator.com").
                        formParam("password", "dddd1234").
                        when().
                        post("https://test-vpc.vvoosh.com/process-login").
                        then().
                        statusCode(302).
                        and().
                        extract().header("location");
        Assert.assertTrue(response.contains("https://test-vpc.vvoosh.com/login-failed"));
    }


    @Test
    public void aUserCanLoginWithSetCookie(){
        String jsonAsString;

        Response response =
                given().
                        header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                        and().
                        formParam("email", "226-vv@mailinator.com").
                        formParam("password", "test1234").
                        when().
                        post("https://test-vpc.vvoosh.com/process-login").
                        then().
                        statusCode(302).
                        and().
                        extract().response();

        String myCookie =  response.getHeader("Set-Cookie");


    }

    @Test
    public void loginWithCookie(){

        String response= given().
                proxy("localhost", 8888).
                and().
                relaxedHTTPSValidation().
                and().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().

                header("cookie","SESSION=07f514b8-ac7a-4307-9498-591a4f0f3664;remember-me=MjI2LXZ2QG1haWxpbmF0b3IuY29tOjE1MDY2ODAyNTgwMTk6NDY2NTRkNzNmZDczNDI3MTlkY2IzYjQzNTZmMGJlMGY;").

                when().
                post("https://test-vpc.vvoosh.com/process-login").
                then().
                statusCode(302).
                and().

                extract().header("location");
        Assert.assertFalse(response.contains("login-failed"));
    }

    @Test
    public void successLoginThroughProxy(){
        given().
                proxy("localhost", 8888).
                and().
                relaxedHTTPSValidation().
                and().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().
                formParam("email", "226-vv@mailinator.com").
                formParam("password", "test1234").
                when().
                post("https://test-vpc.vvoosh.com/process-login").
                then().
                statusCode(302);
    }

}
