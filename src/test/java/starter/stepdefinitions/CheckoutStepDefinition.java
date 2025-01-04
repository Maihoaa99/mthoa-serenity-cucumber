package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.Common.CheckoutTarget;
import starter.pages.Checkout;

public class CheckoutStepDefinition {
    Checkout checkout;

    @And("{actor} click checkout")
    public void customerClickCheckout(Actor actor) {
        actor.attemptsTo(
                checkout.clickOnCheckout()
        );
    }

    @And("{actor} enter firstname {string}")
    public void customerEnterFirstname(Actor actor, String firstName) {
        actor.attemptsTo(
                checkout.enterFirstName(firstName)
        );
    }

    @And("{actor} enter lastname {string}")
    public void customerEnterLastname(Actor actor, String lastname) {
        actor.attemptsTo(
                checkout.enterLastName(lastname)
        );
    }

    @And("{actor} enter zipcode {string}")
    public void customerEnterZipcode(Actor actor, String zipcode) {
        actor.attemptsTo(
                checkout.enterZipcode(zipcode)
        );
    }

    @And("{actor} click btn continue")
    public void customerClickBtnContinue(Actor actor) {
        actor.attemptsTo(
                checkout.clickBtnContinue()
        );
    }

    @And("{actor} check product information")
    public void customerCheckProductInformation(Actor actor) {
        actor.attemptsTo(
                checkout.checkProductInformation(),
                checkout.clickBtnFinish()
        );
    }

    @Then("{actor} see page thank you")
    public void customerSeePageThankYou(Actor actor) {
        actor.attemptsTo(
                checkout.seePageThankYou()
        );
    }

    @Then("{actor} see error notification")
    public void customerSeeErrorNotification(Actor actor) {
        actor.attemptsTo(
                checkout.seeMessageError()
        );
    }
}
