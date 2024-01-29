@RestAPI
Feature: Get an average exchange rates from the table from NBP API

  Scenario Outline: I'm want to get successful response from NBP API and filter using parameters

    Given Main path API was hit
    When I'm get exchange rates
    Then I'm want to get exchange rate for CurrencyCode="<CurrencyCode>"
    And I'm want to get exchange rate for CurrencyName="<CurrencyName>"
    And I'm want to get exchange rates above <CurrencyRateAbove>
    And I'm want to get exchange rates below <CurrencyRateBelow>

    Examples:
    | CurrencyCode | CurrencyName | CurrencyRateAbove | CurrencyRateBelow |
    | USD | dolar amerykański | 5 | 3 |