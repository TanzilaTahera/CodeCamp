package au.com.ncs;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

//URL ::: https://digitalapi.auspost.com.au/postcode/search.{format}?q=Melbourne&state=VIC

public class AusPostAPITests {

    private static String URL = "https://digitalapi.auspost.com.au/postcode/search.json";

    @Test
    public void tascottPostcodeTests(){
       given().header("auth-key", "3164eb31-08a2-48a7-aa80-802f0184df6d").and().param("q", "Sydney").and().param("state", "NSW").
                when().get(URL).
                then().assertThat().statusCode(is(200));
    }
}
