package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.login.PerformLogin;
import starter.login.ProductSection;

public class SearchStepDefinitions {

    @Given("{actor} is researching products on the Sauce Labs page")
    public void researchingProducts(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSauceDemoHomePage());
    }

    @When("{actor} login with valid credentials. Username: {string} Password: {string}")
    public void loginToPage(Actor actor, String username, String password) {
        actor.attemptsTo(
                PerformLogin.about(username, password)
        );
    }

    @Then("{actor} should see a section about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(ProductSection.HEADING).hasText(term)
        );
    }
}
