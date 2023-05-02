package lulobank.com.co.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import lulobank.com.co.exceptions.ExcepcionGeneral;
import lulobank.com.co.model.ModeloCrearEmpleado;
import lulobank.com.co.questions.CodigoEstado;
import lulobank.com.co.questions.ElEmpleado;
import lulobank.com.co.questions.ElEstado;
import lulobank.com.co.task.Consulta;
import lulobank.com.co.task.Consultar;
import lulobank.com.co.task.CreacionEmpleado;
import lulobank.com.co.task.Eliminar;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;

import static lulobank.com.co.util.enums.Endpoint.ENDPOINT_BASE;
import static lulobank.com.co.util.enums.Excepciones.*;
import static lulobank.com.co.util.enums.Numeros.CERO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ApiGestionSteps {

    @Dado("que {string} consume el api para comparar")
    public void queConsumeElApiParaComparar(String actor) {
        theActorCalled(actor).whoCan(CallAnApi.at(ENDPOINT_BASE.getUri()));
    }

    @Cuando("user consulta  los empleados en el api get")
    public void userConsultaLosEmpleadosEnElApiGet() {
        theActorInTheSpotlight().attemptsTo(Consultar.losEmpleados());

    }

    @Entonces("verifica que tenga un estado {int} en la consulta")
    public void verificaQueTengaUnEstadoEnLaConsulta(Integer exitoso) {
        theActorInTheSpotlight().should(seeThat(CodigoEstado.es(), Matchers.comparesEqualTo(exitoso))
                .orComplainWith(ExcepcionGeneral.class,ERROR_CODIGO_ESTATUS.getExcepcion()));

    }

    @Entonces("el observa que el mensaje de exito en consulta fue {string}")
    public void elObservaQueElMensajeDeExitoEnConsultaFue(String string) {
        theActorInTheSpotlight().should(seeThat(ElEmpleado.consultadoExitosamente(),Matchers.comparesEqualTo(string))
                .orComplainWith(ExcepcionGeneral.class,ERROR_NOMBRE_MENSAJE.getExcepcion()));

    }

 ///////////////////////////////////////////////////////////////////////////////////////////

    @Cuando("user realiza la creacion de un empleado")
    public void userRealizaLaCreacionDeUnEmpleado(List<ModeloCrearEmpleado> datos) {
        theActorInTheSpotlight().attemptsTo(CreacionEmpleado.conLos(datos.get(CERO.getNumero())));

    }

    @Entonces("el observa que el mensaje de exito en crear fue {string}")
    public void elObservaQueElMensajeDeExitoEnCrearFue(String string) {
        theActorInTheSpotlight().should(seeThat(ElEstado.esExitoso(), Matchers.comparesEqualTo(string))
                .orComplainWith(ExcepcionGeneral.class, ERROR_NOMBRE_ESTATUS.getExcepcion()));

    }

    ////////////////////////////////////////////////////////////////////////////////////////77

    @Cuando("user consulta un empleado en el sistema con id {string}")
    public void userConsultaUnEmpleadoEnElSistemaConId(String id) {
        theActorInTheSpotlight().attemptsTo(Consulta.empleadoCon(id));
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////7

    @Cuando("user elimina un empleado en el sistema")
    public void userEliminaUnEmpleadoEnElSistema() {
        theActorInTheSpotlight().attemptsTo(Eliminar.unEmpleado());
    }

    @Entonces("el verifica que el status code es {int} en la respuesta de la peticion")
    public void elVerificaQueElStatusCodeEsEnLaRespuestaDeLaPeticion(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
