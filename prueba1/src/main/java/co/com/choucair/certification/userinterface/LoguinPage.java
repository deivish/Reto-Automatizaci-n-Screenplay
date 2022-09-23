package co.com.choucair.certification.userinterface;


import net.serenitybdd.screenplay.targets.Target;

public class LoguinPage {

    public static final Target TXT_USERNAME = Target.the("campo para agregar nombre de usuario")
            .locatedBy("//input[@id='user-name']");

    public static final Target TXT_PASSWORD = Target.the("campo para agregar la contraseña")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_INGRESAR = Target.the("Dar cliK en el campo iniciar")
            .locatedBy("//input[@id='login-button']");
}
