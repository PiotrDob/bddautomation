Feature: Select the first product from the list of devices and add it to your cart.

  Scenario Outline: I want to add first product from "Urzadzenia" \ "<Group>" \ "<Subgroup>" list to cart

    Given I'm on t-mobile homepage
    When I'm click on Urzadzenia
    And I'm click on "<Subgroup>" under "<Group>" menu
    And I'm click on first element of list
    And I'm add it to my cart
    Then I'm on cart page and 'Platnosc na start' and 'Rata miesieczna' are correct
    When I'm back to t-mobile homepage
    Then The cart icon with "1" product is visible

    Examples:
    | Group | Subgroup |
    | Smartwatche i opaski | Bez abonamentu |