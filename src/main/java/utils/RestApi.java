package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;

public class RestApi {

    public JSONArray getResponseBodyFromNbpExchangeRatesATable() {
         Response response = RestAssured
                .get(GlobalDefinitions.NBP_EXCHANGE_EXCHANGE_RATES_A)
                .then()
                .extract()
                .response();
        JSONArray responseBody = new JSONArray(response.getBody().asString());
        if (response.statusCode() != 200) {
        }
        return responseBody;
    }


}
