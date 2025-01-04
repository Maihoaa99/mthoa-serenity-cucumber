package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSauceDemoPage() {
        return Task.where("{0} opens the Sauce Demo home page",
                Open.browserOn().the(SauceDemoPage.class));
    }
}
