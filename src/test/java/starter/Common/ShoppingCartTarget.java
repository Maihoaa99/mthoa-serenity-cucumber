package starter.Common;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartTarget {
    public static final Target addPrd1 = Target.the("prd1 field").locatedBy("#add-to-cart-sauce-labs-backpack");
    public static final Target addPrd2 = Target.the("prd2 field").locatedBy("#add-to-cart-sauce-labs-bike-light");
    public static final Target addPrd3 = Target.the("prd3 field").locatedBy("#add-to-cart-sauce-labs-bolt-t-shirt");

    public static final Target mountCart = Target.the("mount cart").locatedBy("//span[@class='shopping_cart_badge']");

    public static final Target namePrd1 = Target.the("name prd1").locatedBy("//div[text()='Sauce Labs Bolt T-Shirt']");
    public static final Target namePrd2 = Target.the("name prd2").locatedBy("//div[text()='Sauce Labs Backpack']");
    public static final Target namePrd3 = Target.the("name prd3").locatedBy("//div[text()='Sauce Labs Bike Light']");

    public static final Target pricePrd1 = Target.the("price prd1").locatedBy("//div[text()='15.99']");
    public static final Target pricePrd2 = Target.the("price prd2").locatedBy("//div[text()='29.99']");
    public static final Target pricePrd3 = Target.the("price prd3").locatedBy("//div[text()='9.99']");

    public static final Target removePrd1 = Target.the("remove prd1").locatedBy("#remove-sauce-labs-bike-light");

    public static final Target title = Target.the("title").locatedBy("//span[@class='title']");
}
