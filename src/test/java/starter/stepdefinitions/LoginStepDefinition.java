package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.navigation.NavigateTo;
import starter.pages.Login;

public class LoginStepDefinition {
    Login login;

    @Given("{actor} on login page")
    public void customerOnLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSauceDemoPage());
    }

    @When("{actor} enter {string} and {string}")
    public void customerEnterAnd(Actor actor, String username, String password) {
        actor.attemptsTo(
                login.enterUsernameAndPassword(username, password),
                login.clickBtnLogin()
        );
    }

    @Then("{actor} should see home page {string}")
    public void customerShouldSeeHomePage(Actor actor, String title) {
        actor.attemptsTo(
                Ensure.that(TheWebPage.title()).containsIgnoringCase(title)
        );
    }
}
