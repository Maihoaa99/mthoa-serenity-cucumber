package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import static starter.Common.CheckoutTarget.*;
import static starter.Common.ShoppingCartTarget.*;

public class Checkout extends PageObject {

    public Performable clickOnCheckout() {
        return Task.where(
                Click.on(btnCheckout)
        );
    }

    public Performable enterFirstName(String firstName) {
        return Task.where(
                Enter.theValue(firstName).into(firstname)
        );
    }

    public Performable enterLastName(String lastName) {
        return Task.where(
                Enter.theValue(lastName).into(lastname)
        );
    }

    public Performable enterZipcode(String zipcode) {
        return Task.where(
                Enter.theValue(zipcode).into(zipCode)
        );
    }

    public Performable clickBtnContinue() {
        return Task.where(
                Click.on(btnContinue)
        );
    }

    public Performable checkProductInformation() {
        return Task.where(
                Ensure.that(namePrd1).isDisplayed(),
                Ensure.that(namePrd2).isDisplayed(),
                Ensure.that(namePrd3).isDisplayed(),
                Ensure.that(pricePrd1).isDisplayed(),
                Ensure.that(pricePrd2).isDisplayed(),
                Ensure.that(pricePrd3).isDisplayed(),
                Task.where("{0} prints product names",
                        actor -> {
                            String product1Name = Text.of(namePrd1).answeredBy(actor);
                            String product2Name = Text.of(namePrd2).answeredBy(actor);
                            String product3Name = Text.of(namePrd3).answeredBy(actor);

                            String product1Price = Text.of(pricePrd1).answeredBy(actor);
                            String product2Price = Text.of(pricePrd2).answeredBy(actor);
                            String product3Price = Text.of(pricePrd3).answeredBy(actor);

                            System.out.println("\nCheck product price after click checkout: ");
                            System.out.println("Price Product 1: " + product1Price);
                            System.out.println("Price Product 2: " + product2Price);
                            System.out.println("Price Product 3: " + product3Price);

                            System.out.println("\nCheck product name after click checkout: ");
                            System.out.println("Name Product 1: " + product1Name);
                            System.out.println("Name Product 2: " + product2Name);
                            System.out.println("Name Product 3: " + product3Name);
                        }
                )
        );
    }

    public Performable clickBtnFinish() {
        return Task.where(
                Click.on(btnFinish)
        );
    }

    public Performable seePageThankYou() {
        return Task.where(
                Ensure.that(messageSuccess).isDisplayed(),
                Task.where("{0} prints message",
                        actor -> {
                            String message = Text.of(messageSuccess).answeredBy(actor);
                            System.out.println("\nCheck message after checkout success: ");
                            System.out.println("Message success: " + message);
                        }
                )
        );
    }

    public Performable seeMessageError() {
        return Task.where(
                Ensure.that(messageError).isDisplayed(),
                Task.where("{0} prints message",
                        actor -> {
                            String message = Text.of(messageError).answeredBy(actor);
                            System.out.println("\nCheck message after checkout unsuccess: ");
                            System.out.println("Message unsuccess: " + message);
                        }
                )
        );
    }
}
