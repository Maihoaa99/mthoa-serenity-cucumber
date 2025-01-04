package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static starter.Common.ShoppingCartTarget.*;

public class ShoppingCart extends PageObject {
    public Performable addProductToCart() {
        return Task.where(
                Click.on(addPrd1),
                Click.on(addPrd2),
                Click.on(addPrd3)
        );
    }

    public Performable clickToCart() {
        return Task.where(
                WaitUntil.the(mountCart, WebElementStateMatchers.isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(mountCart)
        );
    }

    public Performable checkMountToCart() {
        return Task.where(
                Ensure.that(mountCart).hasText("3"),
                Task.where("{0} prints mount cart",
                        actor -> {
                            String mount = Text.of(mountCart).answeredBy(actor);
                            System.out.println("\nCheck mount cart after add product to cart: ");
                            System.out.println("Mount cart: " + mount);
                        }
                )
        );
    }

    public Performable checkNameProductToCart() {
        return Task.where(
                Ensure.that(namePrd1).isDisplayed(),
                Ensure.that(namePrd2).isDisplayed(),
                Ensure.that(namePrd3).isDisplayed(),
                Task.where("{0} prints product names",
                        actor -> {
                            String product1Name = Text.of(namePrd1).answeredBy(actor);
                            String product2Name = Text.of(namePrd2).answeredBy(actor);
                            String product3Name = Text.of(namePrd3).answeredBy(actor);
                            System.out.println("\nCheck product name after add to cart: ");
                            System.out.println("Name Product 1: " + product1Name);
                            System.out.println("Name Product 2: " + product2Name);
                            System.out.println("Name Product 3: " + product3Name);
                        }
                )
        );
    }

    public Performable checkPriceProductToCart() {
        return Task.where(
                Ensure.that(pricePrd1).isDisplayed(),
                Ensure.that(pricePrd2).isDisplayed(),
                Ensure.that(pricePrd3).isDisplayed(),
                Task.where("{0} prints product prices",
                        actor -> {
                            String product1Price = Text.of(pricePrd1).answeredBy(actor);
                            String product2Price = Text.of(pricePrd2).answeredBy(actor);
                            String product3Price = Text.of(pricePrd3).answeredBy(actor);
                            System.out.println("\nCheck product price after add to cart: ");
                            System.out.println("Price Product 1: " + product1Price);
                            System.out.println("Price Product 2: " + product2Price);
                            System.out.println("Price Product 3: " + product3Price);
                        }
                )
        );
    }

    public Performable seeAddedProduct() {
        return Task.where(
                Ensure.that(title).hasText("Your Cart")
        );
    }

    public Performable removeProductToCart() {
        return Task.where(
                Click.on(removePrd1)
        );
    }

    public Performable checkMountRemainProductToCart() {
        return Task.where(
                Ensure.that(mountCart).hasText("2"),
                Task.where("{0} prints mount cart after remove",
                        actor -> {
                            String mount = Text.of(mountCart).answeredBy(actor);
                            System.out.println("\nCheck mount cart after remove product to cart: ");
                            System.out.println("Mount cart: " + mount);
                        }
                )
        );
    }

    public Performable seeRemainProduct() {
        return Task.where(
                Ensure.that(title).hasText("Your Cart")
        );
    }
}
