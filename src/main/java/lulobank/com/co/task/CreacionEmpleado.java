package lulobank.com.co.task;

import lulobank.com.co.model.ModeloCrearEmpleado;
import lulobank.com.co.interactions.Post;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


import static lulobank.com.co.util.enums.Endpoint.ENDPOINT_POST_CREATE_EMPLOYEE;




public class CreacionEmpleado implements Task {
    ModeloCrearEmpleado modeloCrearEmpleado;
    public CreacionEmpleado(ModeloCrearEmpleado modeloCrearEmpleado) {this.modeloCrearEmpleado = modeloCrearEmpleado;}


    public static CreacionEmpleado conLos(ModeloCrearEmpleado modeloCrearEmpleado) {
        return Tasks.instrumented(CreacionEmpleado.class, modeloCrearEmpleado);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.conBody(ENDPOINT_POST_CREATE_EMPLOYEE.getUri(),modeloCrearEmpleado.body()));

    }


}



