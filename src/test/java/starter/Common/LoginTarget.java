package starter.Common;

import net.serenitybdd.screenplay.targets.Target;

public class LoginTarget {
    public static final Target USERNAME = Target.the("username field").locatedBy("#user-name");
    public static final Target PASSWORD = Target.the("password field").locatedBy("#password");
    public static final Target BTN_LOGIN = Target.the("btn login field").locatedBy("#login-button");
}
