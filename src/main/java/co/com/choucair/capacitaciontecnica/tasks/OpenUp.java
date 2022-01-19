package co.com.choucair.capacitaciontecnica.tasks;

import co.com.choucair.capacitaciontecnica.userinterface.PaginaAcademiaChoucair;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task { //Implementa la interfaz
    private PaginaAcademiaChoucair paginaAcademiaChoucair;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) { //Metodo de la interfaz
        actor.attemptsTo(Open.browserOn(paginaAcademiaChoucair));
    }
}
