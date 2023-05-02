package lulobank.com.co.setup.datadefinition;

import io.cucumber.java.DataTableType;
import lulobank.com.co.model.ModeloCrearEmpleado;

import java.util.Map;

import static lulobank.com.co.util.enums.VariablesFeature.*;

public class DefinicionModelos {
    @DataTableType
    public ModeloCrearEmpleado crearEmpleadoEntry(Map<String, String> entry) {
        return new ModeloCrearEmpleado(
                entry.get(NOMBRE.getValor()),
                entry.get(SALARIO.getValor()),
                entry.get(EDAD.getValor())
        );
    }
}

