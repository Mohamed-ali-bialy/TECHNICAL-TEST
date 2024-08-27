package Package;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class Helper {

    public String getCountryFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }

        try {
            JSONObject obj = new JSONObject(jsonResponse);
            return obj.optString("country", null);
        } catch (JSONException e) {
            System.err.println("Cannot find Country in response !");
            return null;
        }
    }

    public String getPostalCodeFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }

        try {
            JSONObject obj = new JSONObject(jsonResponse);
            return obj.optString("post code", null);
        } catch (JSONException e) {
            System.err.println("Cannot find post code in response !");
            return null;
        }
    }


    public String getCountryAbbreviationFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }

        try {
            JSONObject obj = new JSONObject(jsonResponse);
            return obj.optString("country abbreviation", null);
        } catch (JSONException e) {
            System.err.println("Cannot find country abbreviation in response !");
            return null;
        }
    }
    public String getPlaceNameFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }
        try {
            JSONObject obj = new JSONObject(jsonResponse);
            JSONArray places = obj.getJSONArray("places");
            JSONObject place = places.getJSONObject(0);
            return place.optString("place name", null);
        } catch (JSONException e) {
            System.err.println("Cannot find place name in response !");
            return null;
        }
    }

    public String getLongitudeFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }
        try {
            JSONObject obj = new JSONObject(jsonResponse);
            JSONArray places = obj.getJSONArray("places");
            JSONObject place = places.getJSONObject(0);
            return place.optString("longitude", null);
        } catch (JSONException e) {
            System.err.println("Cannot find longitude in response !");
            return null;
        }
    }
    public String getStateFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }
        try {
            JSONObject obj = new JSONObject(jsonResponse);
            JSONArray places = obj.getJSONArray("places");
            JSONObject place = places.getJSONObject(0);
            return place.optString("state", null);
        } catch (JSONException e) {
            System.err.println("Cannot find state in response !");
            return null;
        }
    }
    public String getStateAbbreviationFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }
        try {
            JSONObject obj = new JSONObject(jsonResponse);
            JSONArray places = obj.getJSONArray("places");
            JSONObject place = places.getJSONObject(0);
            return place.optString("state abbreviation", null);
        } catch (JSONException e) {
            System.err.println("Cannot find state abbreviation in response !");
            return null;
        }
    }
    public String getLatitudeFromJsonResponse(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.isEmpty()) {
            return null;
        }
        try {
            JSONObject obj = new JSONObject(jsonResponse);
            JSONArray places = obj.getJSONArray("places");
            JSONObject place = places.getJSONObject(0);
            return place.optString("latitude", null);
        } catch (JSONException e) {
            System.err.println("Cannot find latitude in response !");
            return null;
        }
    }





}
