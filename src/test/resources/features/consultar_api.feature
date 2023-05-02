#language:es
@e2e
Característica: Consultar los empleados de un sitema
    Yo como usuario tecnico
    Quiero saber las respuestas del api
    Para tener el response de la solicitud y comparar

    Antecedentes:
        Dado que "user" consume el api para comparar


    @MetodoGetConsulta
    Escenario: Obtener empleados del api
        Cuando user consulta  los empleados en el api get
        Entonces verifica que tenga un estado 200 en la consulta
        Y el observa que el mensaje de exito en consulta fue "Successfully! All records has been fetched."


    @MetodoPostCrear
    Escenario: Crear empleado en el api
        Cuando user realiza la creacion de un empleado
            | name    | salary  | age |
            | user    | 8000000 | 29  |
        Entonces verifica que tenga un estado 200 en la creacion
        Y el observa que el mensaje de exito en crear fue "success"





    @MetodoPutConsultar
    Escenario: Consultar un empleado en el api
        Cuando user consulta un empleado en el sistema con id "4"
        Entonces verifica que tenga un estado 200 en consulta
        Y el observa que el mensaje de exito en la consulta fue "success"



    @MetodoDeleteEliminar
    Escenario: Eliminar un empleado del api
        Cuando user elimina un empleado en el sistema
        Entonces el verifica que el status code es 200 en la respuesta de la peticion
        Y  observa el mensaje de exito   "Successfully! Record has been deleted"