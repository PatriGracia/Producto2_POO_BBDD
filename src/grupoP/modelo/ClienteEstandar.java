package grupoP.modelo;

public class ClienteEstandar extends Cliente{
    public ClienteEstandar(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }

    @Override
    public String toString() {
        return "ClienteEstandar{}";
    }

    public String tipoCliente(){
        return "Cliente Estandar";
    }

    public float descuentoEnv(){
        float descuentoEnv = 1;
        return descuentoEnv;
    }
}