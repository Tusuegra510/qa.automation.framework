package starter.login;

import net.serenitybdd.screenplay.targets.Target;

public class LoginSection {
	public static final Target ERROR_MESSAGE =  Target.the("error").locatedBy(".error-message-container > h3");
}