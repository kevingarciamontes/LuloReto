package lulobank.com.co.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static lulobank.com.co.util.enums.Endpoint.ENDPOINT_GET_EMPLOYEE;

public class Consulta implements Task {

    private final String id;

    public Consulta(String id) {this.id = id;}

    public static Consulta empleadoCon(String id) { return Tasks.instrumented(Consulta.class,id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(ENDPOINT_GET_EMPLOYEE.getUri())
                        .with(
                                request -> request
                                        .pathParam("id", id)
                        ));
    }
}
