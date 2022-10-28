package grupoP.modelo;

public class ClientePremium extends Cliente{

    private float descuento;
    public ClientePremium(String nombre, String domicilio, String nif, String email, float descuento) {
        super(nombre, domicilio, nif, email);
        this.descuento=descuento;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "ClientePremium{" +
                "descuento=" + descuento +
                '}';
    }

    public String tipoCliente(){
        return "Cliente Estandar";
    }
}
