package lulobank.com.co.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


@Subject("Se valida el mensaje que fueron consultados exitosamente")
public class ElEmpleado implements Question<String> {


    public static ElEmpleado consultadoExitosamente() {return new ElEmpleado();}

    @Override
    public String answeredBy(Actor actor) {return SerenityRest.lastResponse().jsonPath().get("message");}
}
