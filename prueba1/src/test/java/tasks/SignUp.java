package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.userinterface.LoguinPage.*;

public class SignUp implements Task {

    String user;
    String password;


    public static SignUp thepage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(user).into(TXT_USERNAME),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_INGRESAR)
        );


    }

    public SignUp withThisUser(String user) {
        this.user = user;
        return this;
    }

    public SignUp andThisPassword(String password) {
        this.password = password;
        return this;
    }

}
