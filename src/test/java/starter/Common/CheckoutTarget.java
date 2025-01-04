package starter.Common;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutTarget {
    public static final Target btnCheckout = Target.the("btn Checkout").locatedBy("#checkout");

    public static final Target firstname = Target.the("first name").locatedBy("#first-name");
    public static final Target lastname = Target.the("last name").locatedBy("#last-name");
    public static final Target zipCode = Target.the("zip code").locatedBy("#postal-code");

    public static final Target btnContinue = Target.the("continue").locatedBy("#continue");

    public static final Target messageError = Target.the("message error").locatedBy("//h3[@data-test='error']");

    public static final Target btnFinish = Target.the("finish").locatedBy("#finish");

    public static final Target messageSuccess = Target.the("message success").locatedBy("//h2[text()='Thank you for your order!']");
}
