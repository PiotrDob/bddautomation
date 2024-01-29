package tests.restApi.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONArray;
import utils.RestApi;
import utils.SessionObjects;
import utils.models.ExchangeRate;

import java.math.BigDecimal;
import java.util.HashMap;

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
  System.out.println("Code: " + exchangeRate.getCode() + "; Currency: " + exchangeRate.getCurrency() + "; Mid: "+ exchangeRate.getMid().toString() + ";");
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
  System.out.println("Code: " + exchangeRate.getCode() + "; Currency: " + exchangeRate.getCurrency() + "; Mid: "+ exchangeRate.getMid().toString() + ";");
  // TODO ADD PRETTY PRINT VALUES TO REPORT FORM ExchangeRate OBJECT
 }

 @Then("I'm want to get exchange rates above {int}")
 public void i_m_want_to_get_exchange_rates_above(Integer int1) {
  // TODO OUT OF THE TIME, BUT STREAM LIKE BEFORE
 }

 @Then("I'm want to get exchange rates below {int}")
 public void i_m_want_to_get_exchange_rates_below(Integer int1) {
  // TODO OUT OF THE TIME, BUT STREAM LIKE BEFORE
 }

}
