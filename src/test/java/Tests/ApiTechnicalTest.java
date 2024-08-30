package Tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ApiPackage.*;
public class ApiTechnicalTest {
    Helper helper = new Helper();
    int StatusCode;
    Response response;
    String country, postCode, jsonBody, bearerToken, cookie,responseString,
     postCodeResponse , countryResponse , countryAbbreviationResponse,placeNameResponse , longitudeResponse , stateResponse,
     stateAbbreviationResponse ,
     latitudeResponse;
    @BeforeTest
    public void callApiAndGetVariables(){


    }

    @Test (priority = 1)
    public void TestValidCountryAndValidPostCodeCase() {

        country = "ES"; //valid country
        postCode = "01001"; //valid postcode


        jsonBody = bearerToken = cookie = ""; // not required in this api
        response = helper.callGetCountryAndPostCodeAPI(country, postCode, jsonBody, bearerToken, cookie);//call api
        StatusCode = response.getStatusCode();//get api status code
        responseString = response.getBody().asPrettyString();//get response as string

        //get variables form api response
        postCodeResponse = helper.getPostalCodeFromJsonResponse(responseString);
        countryResponse = helper.getCountryFromJsonResponse(responseString);
        countryAbbreviationResponse = helper.getCountryAbbreviationFromJsonResponse(responseString);
        placeNameResponse = helper.getPlaceNameFromJsonResponse(responseString);
        longitudeResponse = helper.getLongitudeFromJsonResponse(responseString);
        stateResponse = helper.getStateFromJsonResponse(responseString);
        stateAbbreviationResponse = helper.getStateAbbreviationFromJsonResponse(responseString);
        latitudeResponse = helper.getLatitudeFromJsonResponse(responseString);

        //Assertion
        Assert.assertEquals(postCodeResponse,"01001","Wrong postCode !");
        Assert.assertEquals(countryResponse,"Spain","Wrong country !");
        Assert.assertEquals(countryAbbreviationResponse,"ES","Wrong country Abbreviation !");
        Assert.assertEquals(placeNameResponse,"Vitoria-Gasteiz","Wrong place Name");
        Assert.assertEquals(longitudeResponse,"-2.6667","Wrong longitude !");
        Assert.assertEquals(stateResponse,"Pais Vasco","Wrong state !");
        Assert.assertEquals(stateAbbreviationResponse,"PV","Wrong state Abbreviation !");
        Assert.assertEquals(latitudeResponse,"42.85","Wrong latitude !");

        System.out.println("Post Code Is :" + postCodeResponse);
        System.out.println("Country Is :" + countryResponse);
        System.out.println("country Abbreviation Is :" + countryAbbreviationResponse);
        System.out.println("place Name Is :" + placeNameResponse);
        System.out.println("longitude Is :" + longitudeResponse);
        System.out.println("state Is :" + stateResponse);
        System.out.println("state Abbreviation Is :" + stateAbbreviationResponse);
        System.out.println("latitude Is :" + latitudeResponse);

    }

    @Test(priority = 2)
    public void TestValidCountryAndInvalidPostCodeCase() {
        country = "ES"; //valid country
        postCode = "AD10014141"; //invalid postcode


        jsonBody = bearerToken = cookie = ""; // not required in this api
        response = helper.callGetCountryAndPostCodeAPI(country, postCode, jsonBody, bearerToken, cookie);//call api
        StatusCode = response.getStatusCode();//get api status code
        responseString = response.getBody().asPrettyString();//get response as string

        //get variables form api response
        postCodeResponse = helper.getPostalCodeFromJsonResponse(responseString);
        countryResponse = helper.getCountryFromJsonResponse(responseString);
        countryAbbreviationResponse = helper.getCountryAbbreviationFromJsonResponse(responseString);
        placeNameResponse = helper.getPlaceNameFromJsonResponse(responseString);
        longitudeResponse = helper.getLongitudeFromJsonResponse(responseString);
        stateResponse = helper.getStateFromJsonResponse(responseString);
        stateAbbreviationResponse = helper.getStateAbbreviationFromJsonResponse(responseString);
        latitudeResponse = helper.getLatitudeFromJsonResponse(responseString);

        //Assertion
        Assert.assertEquals(StatusCode, 404, "Response Status code is not 404 for Invalid endpoint");
        Assert.assertNull(postCodeResponse, "Post code is not null");
        Assert.assertNull(countryResponse, "county is not null");
        Assert.assertNull(countryAbbreviationResponse, "country abbreviation is not null");
        Assert.assertNull(placeNameResponse, "place name is not null");
        Assert.assertNull(longitudeResponse, "longitude is not null");
        Assert.assertNull(stateResponse, "state is not null");
        Assert.assertNull(stateAbbreviationResponse, "state abbreviation is not null");
        Assert.assertNull(latitudeResponse, "latitude is not null");
    }


    @Test(priority = 3)
    public void TestInValidCountryAndValidPostCodeCase() {
        country = "ABC"; //invalid country
        postCode = "AD100"; //valid postcode


        jsonBody = bearerToken = cookie = ""; // not required in this api
        response = helper.callGetCountryAndPostCodeAPI(country, postCode, jsonBody, bearerToken, cookie);//call api
        StatusCode = response.getStatusCode();//get api status code
        responseString = response.getBody().asPrettyString();//get response as string

        //get variables form api response
        postCodeResponse = helper.getPostalCodeFromJsonResponse(responseString);
        countryResponse = helper.getCountryFromJsonResponse(responseString);
        countryAbbreviationResponse = helper.getCountryAbbreviationFromJsonResponse(responseString);
        placeNameResponse = helper.getPlaceNameFromJsonResponse(responseString);
        longitudeResponse = helper.getLongitudeFromJsonResponse(responseString);
        stateResponse = helper.getStateFromJsonResponse(responseString);
        stateAbbreviationResponse = helper.getStateAbbreviationFromJsonResponse(responseString);
        latitudeResponse = helper.getLatitudeFromJsonResponse(responseString);

        //Assertion
        Assert.assertEquals(StatusCode, 404, "Response Status code is not 404 for Invalid endpoint");
        Assert.assertNull(postCodeResponse, "Post code is not null");
        Assert.assertNull(countryResponse, "county is not null");
        Assert.assertNull(countryAbbreviationResponse, "country abbreviation is not null");
        Assert.assertNull(placeNameResponse, "place name is not null");
        Assert.assertNull(longitudeResponse, "longitude is not null");
        Assert.assertNull(stateResponse, "state is not null");
        Assert.assertNull(stateAbbreviationResponse, "state abbreviation is not null");
        Assert.assertNull(latitudeResponse, "latitude is not null");
    }


    @Test(priority = 4)
    public void TestInValidCountryAndInValidPostCodeCase() {
        country = "ABC"; //invalid country
        postCode = "AD100342"; //invalid postcode


        jsonBody = bearerToken = cookie = ""; // not required in this api
        response = helper.callGetCountryAndPostCodeAPI(country, postCode, jsonBody, bearerToken, cookie);//call api
        StatusCode = response.getStatusCode();//get api status code
        responseString = response.getBody().asPrettyString();//get response as string

        //get variables form api response
        postCodeResponse = helper.getPostalCodeFromJsonResponse(responseString);
        countryResponse = helper.getCountryFromJsonResponse(responseString);
        countryAbbreviationResponse = helper.getCountryAbbreviationFromJsonResponse(responseString);
        placeNameResponse = helper.getPlaceNameFromJsonResponse(responseString);
        longitudeResponse = helper.getLongitudeFromJsonResponse(responseString);
        stateResponse = helper.getStateFromJsonResponse(responseString);
        stateAbbreviationResponse = helper.getStateAbbreviationFromJsonResponse(responseString);
        latitudeResponse = helper.getLatitudeFromJsonResponse(responseString);

        //Assertion
        Assert.assertEquals(StatusCode, 404, "Response Status code is not 404 for Invalid endpoint");
        Assert.assertNull(postCodeResponse, "Post code is not null");
        Assert.assertNull(countryResponse, "county is not null");
        Assert.assertNull(countryAbbreviationResponse, "country abbreviation is not null");
        Assert.assertNull(placeNameResponse, "place name is not null");
        Assert.assertNull(longitudeResponse, "longitude is not null");
        Assert.assertNull(stateResponse, "state is not null");
        Assert.assertNull(stateAbbreviationResponse, "state abbreviation is not null");
        Assert.assertNull(latitudeResponse, "latitude is not null");
    }

}
