package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static starter.Common.LoginTarget.*;

public class Login extends PageObject {
    public Performable enterUsernameAndPassword(String userName, String password) {
        return Task.where(
                Enter.theValue(userName).into(USERNAME),
                Enter.theValue(password).into(PASSWORD)
        );
    }

    public Performable clickBtnLogin() {
        return Task.where(
                Click.on(BTN_LOGIN)
        );
    }
}
