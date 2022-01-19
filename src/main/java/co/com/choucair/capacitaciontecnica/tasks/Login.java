package co.com.choucair.capacitaciontecnica.tasks;

import co.com.choucair.capacitaciontecnica.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String usuario;
    private String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static Login OnthePage(String usuario, String password){
        return Tasks.instrumented(Login.class, usuario, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("nmartinezd").into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue("F62856far1").into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
                );
    }
}
