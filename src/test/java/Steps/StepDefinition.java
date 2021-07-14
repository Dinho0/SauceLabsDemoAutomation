package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;


public class StepDefinition extends Steps {


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions

        launchBrowser();
    }

    @Given("I enter the username")
    public void i_enter_the_username() {
        // Write code here that turns the phrase above into concrete actions
        inputUsername("standard_user");
    }

    @Given("I enter the password")
    public void i_enter_the_password() {
        // Write code here that turns the phrase above into concrete actions
        inputPassword("secret_sauce");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        clickLogin();
    }

    @Then("I am successfully logged in.")
    public void i_should_be_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("The title of the page that is ", "PRODUCTS",driver.findElement(inventory.pageTitle).getText());

    }

    @Given("I enter the username as {string}")
    public void i_enter_the_username_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        inputUsername(string);
    }


    @Given("I enter the password as {string}")
    public void i_enter_the_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        inputPassword(string);
    }

    @Given("I  add a {string} to the cart")
    public void i_add_a_to_the_cart(String string) {
        // Write code here that turns the phrase above into concrete actions
        addItemToCart(string);
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        // Write code here that turns the phrase above into concrete actions
        checkout();
    }

    @When("I click finish")
    public void i_click_finish() {
        // Write code here that turns the phrase above into concrete actions
        clickFinish();
    }

    @Then("my order should be successfully placed.")
    public void my_order_should_be_successfully_placed() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("The title of the page that is ", "CHECKOUT: COMPLETE!",driver.findElement(checkoutComplete.checkoutTitle).getText());

    }

    @And("I fill in my firstname as {string}")
    public void iFillInMyFirstnameAs(String arg0) {
        inputFirstName(arg0);
    }

    @And("I fill in my lastname as {string}")
    public void iFillInMyLastNameAs(String arg0) {
        inputLastName(arg0);
    }


    @And("i fill in my postal code as {string}")
    public void iFillInMyPostalCodeAs(String arg0) {
        inputPostalCode(arg0);
    }

    @And("I click the continue button")
    public void iClickTheContinueButton() {
        clickContinue();
    }

    @And("I am on the checkout overview page")
    public void iAmOnTheCheckoutOverviewPage() {
         assertEquals("The title of the page that is ", "CHECKOUT: OVERVIEW",driver.findElement(checkoutOverview.checkoutTitle).getText());
    }

    @And("I {string} inventory")
    public void iInventory(String arg0) {
        filter(arg0);
    }

    @And("I click the hamburger menu")
    public void iClickTheHamburgerMenu() {
        clickMenu();
    }

    @When("I click the logout button")
    public void iClickTheLogoutButton() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clicklogout();
        
    }

    @Then("I am successfully logged out")
    public void iAmSuccessfullyLoggedOut() {
        assertEquals("The title of the page that is ","Login", driver.findElement(login.loginButton).getAttribute("value"));

    }

    @Then("I should be successfully logged in.")
    public void iShouldBeSuccessfullyLoggedIn() {
        assertEquals("The title of the page that is ","PRODUCTS", driver.findElement(inventory.pageTitle).getText());

    }
}
