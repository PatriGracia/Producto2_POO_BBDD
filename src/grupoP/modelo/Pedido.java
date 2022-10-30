package grupoP.modelo;

import java.time.LocalDate;

public class Pedido {
    private int numPedido;
    private int cantidad;
    private LocalDate fecha;
    private Cliente cliente;
    private Articulo articulo;

    public Pedido (int numPedido, int cantidad, LocalDate fecha, Cliente cliente, Articulo articulo){
        this.numPedido = numPedido;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cliente = cliente;
        this.articulo = articulo;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public boolean pedidoEnviado(){
        LocalDate hoy = LocalDate.now();
        if(getFecha().isBefore(hoy)){
            System.out.printf("El pedido ya ha sido enviado");
            return true;
        }
        System.out.printf("El pedido no ha sido enviado");
        return false;
    }

    public float precioEnvio(){
        float costeTotal = (articulo.getPrecio() + articulo.getGastosEnvio()) * getCliente().descuentoEnv();
        return costeTotal;
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", cantidad=" + cantidad +
                ", fecha y hora=" + fecha +
                ", cliente=" + cliente +
                ", artículo=" + articulo +
                ", precio total=" + precioEnvio() +
                ", estado del pedido=" + pedidoEnviado() +
                '}';
    }

    /*
    - public boolean pedidoEnviado();

    - public float precioEnvio();

    - El método toString debe construir una cadena con los datos siguientes:
    número de pedido, fecha y hora del pedido, Nif y nombre del cliente,
    código y descripción del artículo, cantidad, precio artículo, coste envío,
    precio total y si ya se ha enviado.
     */
}

