package org.example;

import org.testng.annotations.Test;
import Package.*;

import static Package.JsonResponseParser.parseResponse;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void Test(){
        Helper helper  =  new Helper();
        APIBase apiBase = new APIBase();
        String Country, postCode_ ;

        String response = apiBase.GET("AD/AD100","","","");
        String postCode = helper.getPostalCodeFromJsonResponse(response);
        String country = helper.getCountryFromJsonResponse(response);
        String countryAbbreviation = helper.getCountryAbbreviationFromJsonResponse(response);
        String placeName = helper.getPlaceNameFromJsonResponse(response);
        String longitude = helper.getLongitudeFromJsonResponse(response);
        String state = helper.getStateFromJsonResponse(response);
        String stateAbbreviation = helper.getStateAbbreviationFromJsonResponse(response);
        String latitude = helper.getLatitudeFromJsonResponse(response);


        System.out.println("Post Code Is :" +postCode);
        System.out.println("Country Is :" +country);
        System.out.println("country Abbreviation Is :" +countryAbbreviation);
        System.out.println("place Name Is :" +placeName);
        System.out.println("longitude Is :" +longitude);
        System.out.println("state Is :" +state);
        System.out.println("state Abbreviation Is :" +stateAbbreviation);
        System.out.println("latitude Is :" +latitude);


    }
}
