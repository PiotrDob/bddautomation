package tests.frontend.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.actions.CartPageActions;
import page.object.actions.DevicesPageActions;
import page.object.actions.HomePageActions;

public class ShoppingCartSteps {

 private HomePageActions homepageActions;
 private DevicesPageActions devicesPageActions;
 private CartPageActions cartPageActions;

 public ShoppingCartSteps() {
  homepageActions = new HomePageActions();
  devicesPageActions = new DevicesPageActions();
  cartPageActions = new CartPageActions();
 }

 @Given("I'm on t-mobile homepage")
 public void i_m_on_t_mobile_homepage() {
  homepageActions.acceptAllCookies();
  homepageActions.checkSliderVisibility();
 }

 @When("I'm click on Urzadzenia")
 public void i_m_click_on_urzadzenia() {
  homepageActions.clickUrzadzenia();
 }

 @And("I'm click on {string} under {string} menu")
 public void i_m_click_on_under_menu(String subGroup, String group) {
  homepageActions.goToSpecifiedSubGroup(group, subGroup);
 }

 @And("I'm click on first element of list")
 public void i_m_click_on_first_element_of_list() {
  devicesPageActions.pickFirstElementFromList();

 }

 @And("I'm add it to my cart")
 public void i_m_add_it_to_my_cart() {
  devicesPageActions.savePricesToAssert();
  devicesPageActions.addToCartClick();
 }

 @Then("I'm on cart page and 'Platnosc na start' and 'Rata miesieczna' are correct")
 public void i_m_on_cart_page_and_platnosc_na_start_and_rata_miesieczna_are_correct() {
  cartPageActions.assertPrices();
 }

 @When("I'm back to t-mobile homepage")
 public void i_m_back_to_t_mobile_homepage() {
  cartPageActions.backToHomePage();
  homepageActions.checkSliderVisibility();
 }

 @Then("The cart icon with {string} product is visible")
 public void the_cart_icon_with_product_is_visible(String itemsInCart) {
  homepageActions.assertCartItemsValue(itemsInCart);
 }


}
