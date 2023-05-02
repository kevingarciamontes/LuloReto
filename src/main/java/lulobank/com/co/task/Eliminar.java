package lulobank.com.co.task;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static lulobank.com.co.util.NumeroAleatorio.generarNumero;
import static lulobank.com.co.util.enums.Endpoint.ENDPOINT_DELETE_EMPLOYEE;

public class Eliminar implements Task {





    public static Eliminar unEmpleado() { return Tasks.instrumented(Eliminar.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(ENDPOINT_DELETE_EMPLOYEE.getUri())
                .with(
                        request -> request
                                .pathParam("id", generarNumero())
                )
        );
    }
}