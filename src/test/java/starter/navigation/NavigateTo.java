package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSauceDemoHomePage() {
        return Task.where("{0} opens the SauceDemo home page",
                Open.browserOn().the(SauceDemoHomePage.class));
    }
}
