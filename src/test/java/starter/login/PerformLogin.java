package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class PerformLogin {
    public static Performable about(String username, String password) {
        return Task.where("{0} login with valid credentials",
                Enter.theValue(username)
                        .into(LoginBox.USERNAME_FIELD),
                Enter.theValue(password)
                        .into(LoginBox.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
