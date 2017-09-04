import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by rossy on 28/08/2017.
 */
public class PublicPageTest {

    @Test
    public void aUserCanJoinTheWaitingList(){

        given().
                header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                and().
                //body("{\"email\":\"LOLO@HOTMAIL.COM\",\"firstName\":\"LOLO NAME\",\"lastName\":\"LOLO LAST NAME\"}").
                        formParam("226-vv@mailinator.com", "apinaME", "aPIlASTnAME").
                when().
                post("https://test-vpc.vvoosh.com/data/intercom").
                then().
                statusCode(302);

    }
}
