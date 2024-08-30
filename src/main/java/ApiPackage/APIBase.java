package ApiPackage;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APIBase extends SystemPropertiesClass {
    public Response getRequest(String endPoint, String jsonBody, String bearerToken, String cookie) {
        RestAssured.baseURI = getBaseUrl();
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
                .get(endPoint)
                .then()
                .extract().response();


        return response;
    }
}
