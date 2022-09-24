package starter.login;

import net.serenitybdd.screenplay.targets.Target;

class loginBox {
    static Target USERNAME_FIELD = Target.the("user-name").locatedBy("#user-name");
    static Target PASSWORD_FIELD = Target.the("password").locatedBy("#password");
}
