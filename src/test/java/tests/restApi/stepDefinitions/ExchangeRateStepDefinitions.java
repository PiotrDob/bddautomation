package tests.restApi.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONArray;
import org.testng.Assert;
import utils.RestApi;
import utils.SessionObjects;
import utils.models.ExchangeRate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExchangeRateStepDefinitions {

 RestApi restApi;

 public ExchangeRateStepDefinitions() {
  restApi = new RestApi();
 }

 @Given("Main path API was hit")
 public void main_path_api_was_hit() {
  SessionObjects.setResponse(restApi.getResponseBodyFromNbpExchangeRatesATable());
 }

 @When("I'm get exchange rates")
 public void i_m_get_exchange_rates() {
  SessionObjects.setRatesList(SessionObjects.getResponse().getJSONObject(0).get("rates"));
 }

 @Then("I'm want to get exchange rate for CurrencyCode={string}")
 public void i_m_want_to_get_exchange_rate_for_currency_code(String string) {
  ExchangeRate exchangeRate = new ExchangeRate();
  ((JSONArray) SessionObjects.getRatesList())
          .toList()
          .stream()
          .filter(e -> ((HashMap) e)
                  .get("code")
                  .toString()
                  .equals(string))
          .forEach(e -> {
           exchangeRate.setCode(((HashMap) e).get("code").toString());
           exchangeRate.setCurrency(((HashMap) e).get("currency").toString());
           exchangeRate.setMid(BigDecimal.valueOf(Double.valueOf(String.valueOf(((HashMap) e).get("mid")))));
          });
  Assert.assertFalse(exchangeRate.isNull(), "Cannot find currency code ='" + string + "' in rates list");
  System.out.println("\nExchange rate for CurrencyCode " + string);
  System.out.println(exchangeRate.toString());
  // TODO ADD PRETTY PRINT VALUES TO REPORT FORM ExchangeRate OBJECT
 }

 @Then("I'm want to get exchange rate for CurrencyName={string}")
 public void i_m_want_to_get_exchange_rate_for_currency_name(String string) {
  ExchangeRate exchangeRate = new ExchangeRate();
  ((JSONArray) SessionObjects.getRatesList())
          .toList()
          .stream()
          .filter(e -> ((HashMap) e)
                  .get("currency")
                  .toString()
                  .equals(string))
          .forEach(e -> {
           exchangeRate.setCode(((HashMap) e).get("code").toString());
           exchangeRate.setCurrency(((HashMap) e).get("currency").toString());
           exchangeRate.setMid(BigDecimal.valueOf(Double.valueOf(String.valueOf(((HashMap) e).get("mid")))));
          });
     Assert.assertFalse(exchangeRate.isNull(), "Cannot find currency name ='" + string + "' in rates list");
     System.out.println("\nExchange rate for CurrencyName " + string);
     System.out.println(exchangeRate.toString());
  // TODO ADD PRETTY PRINT VALUES TO REPORT FORM ExchangeRate OBJECT
 }

 @Then("I'm want to get exchange rates above {int}")
 public void i_m_want_to_get_exchange_rates_above(Integer int1) {
     List<ExchangeRate> exchangeRateList = new ArrayList<>();
     ((JSONArray) SessionObjects.getRatesList())
             .toList()
             .stream()
             .filter(e -> Double.valueOf(((HashMap) e)
                     .get("mid")
                     .toString()) > int1)
             .forEach(e -> {
                 String code = (((HashMap) e).get("code").toString());
                 String currency = (((HashMap) e).get("currency").toString());
                 BigDecimal mid = (BigDecimal.valueOf(Double.valueOf(String.valueOf(((HashMap) e).get("mid")))));
                 exchangeRateList.add(new ExchangeRate()
                         .setCode(code)
                         .setCurrency(currency)
                         .setMid(mid));
             });
     Assert.assertFalse(exchangeRateList.isEmpty(), "Cannot find currencies above '" + int1 + "' in rates list");
     System.out.println("\nExchange rate rates above " + int1);
     for (ExchangeRate e : exchangeRateList)
         System.out.println(e.toString());
     // TODO ADD PRETTY PRINT VALUES TO REPORT FORM ExchangeRate OBJECT
 }

 @Then("I'm want to get exchange rates below {int}")
 public void i_m_want_to_get_exchange_rates_below(Integer int1) {
     List<ExchangeRate> exchangeRateList = new ArrayList<>();
     ((JSONArray) SessionObjects.getRatesList())
             .toList()
             .stream()
             .filter(e -> Double.valueOf(((HashMap) e)
                     .get("mid")
                     .toString()) < int1)
             .forEach(e -> {
                 String code = (((HashMap) e).get("code").toString());
                 String currency = (((HashMap) e).get("currency").toString());
                 BigDecimal mid = (BigDecimal.valueOf(Double.valueOf(String.valueOf(((HashMap) e).get("mid")))));
                 exchangeRateList.add(new ExchangeRate()
                         .setCode(code)
                         .setCurrency(currency)
                         .setMid(mid));
             });
     Assert.assertFalse(exchangeRateList.isEmpty(), "Cannot find currencies below '" + int1 + "' in rates list");
     System.out.println("\nExchange rate rates below " + int1);
     for (ExchangeRate e : exchangeRateList)
         System.out.println(e.toString());
 }

}
