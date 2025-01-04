package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import starter.pages.ShoppingCart;

public class ShoppingCartStepDefinition {
    ShoppingCart shoppingCart;

    @And("{actor} add product to cart")
    public void customerAddProductToCart(Actor actor) {
        actor.attemptsTo(
                shoppingCart.addProductToCart()
        );
    }

    @And("{actor} click to cart")
    public void customerClickToCart(Actor actor) {
        actor.attemptsTo(
                shoppingCart.clickToCart()
        );
    }

    @And("{actor} check mount product")
    public void customerCheckMountProduct(Actor actor) {
        actor.attemptsTo(
                shoppingCart.checkMountToCart()
        );
    }

    @And("{actor} check name added product")
    public void customerCheckNameAddedProduct(Actor actor) {
        actor.attemptsTo(
                shoppingCart.checkNameProductToCart()
        );
    }

    @And("{actor} check price added product")
    public void customerCheckPriceAddedProduct(Actor actor) {
        actor.attemptsTo(
                shoppingCart.checkPriceProductToCart()
        );
    }

    @Then("{actor} see added product")
    public void customerSeeAddedProduct(Actor actor) {
        actor.attemptsTo(
                shoppingCart.seeAddedProduct()
        );
    }

    @And("{actor} remove product to cart")
    public void customerRemoveProductToCart(Actor actor) {
        actor.attemptsTo(
                shoppingCart.removeProductToCart()
        );
    }

    @And("{actor} check mount remain product")
    public void customerCheckMountRemainProduct(Actor actor) {
        actor.attemptsTo(
                shoppingCart.checkMountRemainProductToCart()
        );
    }

    @Then("{actor} see remain product")
    public void customerSeeRemainProduct(Actor actor) {
        actor.attemptsTo(
                shoppingCart.seeRemainProduct()
        );
    }
}
