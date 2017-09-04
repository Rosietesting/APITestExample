/**
 * Created by rossy on 24/08/2017.
 */
public class PostTest {

}
/*
public class PostTest {

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
        public void postingPrivatePostWithTitle(PostPayload post) {

            post.setTitle("API POST with a new cookie");
            post.setPrivacyLevel("REGISTERED");
            given().
                    proxy("localhost", 8888).
                    and().
                    relaxedHTTPSValidation().
                    and().
                    header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                    and().
                    header ("cookie", cookieSession).
                    contentType("application/json").
                    and().
                    body(post).
                    when().
                    post("https://test-vpc.vvoosh.com/data/communitypost").
                    then().
                    statusCode(200);

        }

        @Test
        public void postingPrivacyPostWithTitleAndDrescription(PostPayload post) {
            //String myJson = "{\"sections\":[{\"type\":\"text\",\"content\":{\"text\":\"Incredible changes in the weather these days ....\"}}]},\"verbSummaries\":[],\"interestIds\":[],\"hashTags\":[],\"privacyLevel\":\"REGISTERED\",\"title\":\"Summer and weather\",\"author\":{\"id\":226},\"places\":[]}";
            String myJson = "{\"title\":\"Summer and weather 11 33\", \"PrivacyLevel\":\"REGISTERED\", \"text\":\"is this text there \"}";

            post.setTitle("API POST 17:18");
            post.setPrivacyLevel("REGISTERED");

            given().
                    proxy("localhost", 8888).
                    and().
                    relaxedHTTPSValidation().
                    and().
                    header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").

                    and().
                    header ("cookie", cookieSession).

                    contentType("application/json").
                    and().
                    body(post).
                    when().
                    post("https://test-vpc.vvoosh.com/data/communitypost").
                    then().
                    statusCode(200);
        }

        @Test
        public void a(PostPayload post) {
            String myJson = "{\"sections\":[{\"type\":\"text\",\"content\":{\"text\":\"Incredible changes in the weather these days ....\"}}]},\"verbSummaries\":[],\"interestIds\":[],\"hashTags\":[],\"privacyLevel\":\"REGISTERED\",\"title\":\"Summer and weather\",\"author\":{\"id\":226},\"places\":[]}";
            //String myJson = "{\"title\":\"Summer and weather 11 33\", \"PrivacyLevel\":\"REGISTERED\", \"text\":\"is this text there \"}";

            //post.setTitle("API POST 11 26");
            //post.setPrivacyLevel("REGISTERED");
            //post.setText("This post has been created using the vVoosh API");
            given().
                    proxy("localhost", 8888).
                    and().
                    relaxedHTTPSValidation().
                    and().
                    header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").

                    and().
                    header("cookie", "SESSION=07f514b8-ac7a-4307-9498-591a4f0f3664;remember-me=MjI2LXZ2QG1haWxpbmF0b3IuY29tOjE1MDY2ODAyNTgwMTk6NDY2NTRkNzNmZDczNDI3MTlkY2IzYjQzNTZmMGJlMGY;").

                    contentType("application/json").
                    and().
                    body(myJson).
                    when().
                    post("https://test-vpc.vvoosh.com/data/communitypost").
                    then().
                    statusCode(200);
        }

        @Test
        public void postUsingJsonSerialization(PostPayload post){

            post.setTitle("title Json serialisation 1458");
            post.setPrivacyLevel("REGISTERED");
            post.setText("Text post 1458");
            given().
                    proxy("localhost", 8888).
                    and().
                    relaxedHTTPSValidation().
                    and().
                    header("Authorization", "Basic dnZvb3NoOjJuaWNlRFJFU1MyMA==").
                    and().
                    header ("cookie", cookieSession).
                    contentType("application/json").
                    and().
                    body(post).
                    when().
                    post("https://test-vpc.vvoosh.com/data/communitypost").
                    then().
                    statusCode(200);

        }

}

*/