package Package;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class APIBase {

    String Baselink="https://api.zippopotam.us/";
    public String GET(String EndPoint, String jsonBody, String bearerToken, String cookie) {
        RestAssured.baseURI = Baselink;
        Response response = given()
                .cookie(String.valueOf(cookie))
                .headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "X-CSRF-TOKEN", "",
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .body(jsonBody)
                .get(EndPoint)
                .then()
                .extract().response();
//        System.out.printf("Time is %s for %s EndPoint %s%n", response.getTime(), "GET", EndPoint);
        int  StautsCode =  response.getStatusCode();
        Assert.assertEquals(StautsCode,200,"Response Status code is not 200");
        return response.getBody().asPrettyString();
    }




}
