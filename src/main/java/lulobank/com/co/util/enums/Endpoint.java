package lulobank.com.co.util.enums;

public enum Endpoint {
    ENDPOINT_BASE("https://dummy.restapiexample.com/api/v1"),
    ENDPOINT_GET_EMPLOYEES("/employees"),
    ENDPOINT_POST_CREATE_EMPLOYEE("https://dummy.restapiexample.com/api/v1/create"),
    ENDPOINT_GET_EMPLOYEE("/employee/{id}"),
    ENDPOINT_DELETE_EMPLOYEE("/delete/{id}");

    private final String uri;

    Endpoint(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}
