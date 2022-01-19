package co.com.choucair.capacitaciontecnica.stepdefinitions;
import co.com.choucair.capacitaciontecnica.model.Datos;
import co.com.choucair.capacitaciontecnica.questions.Answer;
import co.com.choucair.capacitaciontecnica.tasks.Login;
import co.com.choucair.capacitaciontecnica.tasks.OpenUp;
import co.com.choucair.capacitaciontecnica.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Dado("^que Neyla quiere aprender automatizacion en la academia Choucair$")
    public void queNeylaQuiereAprenderAutomatizacionEnLaAcademiaChoucair(List<Datos> datos) {
        OnStage.theActorCalled("Neyla").wasAbleTo(OpenUp.thePage(), Login.OnthePage(datos.get(0).getUsuario(), datos.get(0).getPassword()));
    }

    @Cuando("^el busca el curso en la plataforma de la academia Choucair$")
    public void elBuscaElCursoEnLaPlataformaDeLaAcademiaChoucair(List<Datos> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(datos.get(0).getCourse()));
    }

    @Entonces("^el encuentra el curso llamado$")
    public void elEncuentraElCurso(List<Datos> datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(datos.get(0).getCourse())));
    }

}
