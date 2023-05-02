package lulobank.com.co.util.enums;

public enum Numeros {

    CERO(0);
    int numero;

    Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

