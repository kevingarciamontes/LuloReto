package lulobank.com.co.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


@Subject("Se verifica que el estado sea exitoso con codigo 200")
public class CodigoEstado implements Question<Integer> {


    public static CodigoEstado es() {return new CodigoEstado(); }


    @Override
    public Integer answeredBy(Actor actor) {return SerenityRest.lastResponse().getStatusCode();}
}
