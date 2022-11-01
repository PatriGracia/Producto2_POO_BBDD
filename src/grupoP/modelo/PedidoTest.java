package grupoP.modelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

class PedidoTest {

    @Test
    void pedidoEnviado() {
        String f = "01/11/2022/10/30";
        LocalDateTime fecha = LocalDateTime.parse(f, DateTimeFormatter.ofPattern("dd/MM/yyyy/HH/mm"));
        Articulo a = new Articulo("A1", "Marrón", 3, 3, 10);
        Pedido p = new Pedido(1, 23, fecha, a);
        LocalDateTime hoy = LocalDateTime.now();
        boolean resultado = p.getFecha().plusMinutes(a.getTiempoPreparacion()).isBefore(hoy);
        boolean esperado = true;
        assertEquals(esperado, resultado);


    }

    @Test
    void precioEnvio() {
        Articulo a = new Articulo("A1", "Marrón", 10, 10, 10);
        ClientePremium c = new ClientePremium ("Patri", "Madrid", "B3834", "patri@", 20);
        float resultado =(a.getPrecio() + a.getGastosEnvio())-((a.getPrecio() + a.getGastosEnvio()) * c.descuentoEnv())/100;
        float esperado = 16;
        Assertions.assertEquals(esperado, resultado);
    }
}