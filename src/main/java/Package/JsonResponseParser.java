package Package;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonResponseParser {

    public static void parseResponse(String jsonResponse) {
        JSONObject obj = new JSONObject(jsonResponse);

        // Extracting data from the JSON
        String postCode = obj.getString("post code");
        String country = obj.getString("country");
        String countryAbbreviation = obj.getString("country abbreviation");

        System.out.println("Post Code: " + postCode);
        System.out.println("Country: " + country);
        System.out.println("Country Abbreviation: " + countryAbbreviation);

        // Extracting data from the nested JSON array
        JSONArray places = obj.getJSONArray("places");
        for (int i = 0; i < places.length(); i++) {
            JSONObject place = places.getJSONObject(i);

            String placeName = place.getString("place name");
            String longitude = place.getString("longitude");
            String latitude = place.getString("latitude");
            String state = place.optString("state", ""); // Handles possible empty field
            String stateAbbreviation = place.optString("state abbreviation", "");

            System.out.println("Place Name: " + placeName);
            System.out.println("Longitude: " + longitude);
            System.out.println("Latitude: " + latitude);
            System.out.println("State: " + state);
            System.out.println("State Abbreviation: " + stateAbbreviation);
        }
    }


}
