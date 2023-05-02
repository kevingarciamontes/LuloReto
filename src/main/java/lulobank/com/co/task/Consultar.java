package lulobank.com.co.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import static lulobank.com.co.util.enums.Endpoint.ENDPOINT_GET_EMPLOYEES;

public class Consultar implements Task {


    public static Consultar losEmpleados() {return Tasks.instrumented(Consultar.class);}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(ENDPOINT_GET_EMPLOYEES.getUri()));

    }
}
