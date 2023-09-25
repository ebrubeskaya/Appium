package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;
import Pages.n11Pages;

public class n11StepDefinitions {

    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());

    @When("Categories are clicked")
    public void categoriesAreClicked() {
        n11Pages.categoriesClick();
    }

    @When("Electronic is clicked")
    public void electronicIsClicked() {
        n11Pages.electronicClick();
    }

    @When("Choose Phone and Accessories")
    public void choosePhoneAndAccessories() {
        n11Pages.choosePhoneAccessories();
    }

    @When("Mobile phone is selected")
    public void mobilePhoneIsSelected() {
        n11Pages.mobilePhoneSelect();
    }

    @When("Filtering is clicked")
    public void filteringIsClicked() {
        n11Pages.filterClick();
    }
    @When("Do Filtering")
    public void doFiltering() {
        n11Pages.doFilter();
    }


    @When("Show Results is clicked")
    public void showResultsIsClicked() {
        n11Pages.showResultClick();
    }
    @When("The product is added to the cart")
    public void theProductIsAddedToTheCart() {
        n11Pages.theProductAddCart();
    }


    @When("Go to my cart")
    public void goToMyCart() {
        n11Pages.myCart();
    }

    @Then("Checking that the product has been added to the cart")
    public void checkingThatTheProductHasBeenAddedToTheCart() {
        n11Pages.checkProductAddCart();
    }




}
