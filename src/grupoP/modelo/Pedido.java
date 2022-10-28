package grupoP.modelo;

import java.time.LocalDate;

public class Pedido {
    private int numPedido;
    private int cantidad;
    private LocalDate fecha;

    public Pedido (int numPedido, int cantidad, LocalDate fecha){
        this.numPedido = numPedido;
        this.cantidad = cantidad;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                '}';
    }
}

