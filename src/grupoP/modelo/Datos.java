package grupoP.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
La clase Datos es la clase principal del paquete del modelo, puesto que
contiene y gestiona todos los datos de la aplicación y es el enlace entre
el controlador y el resto de las clases del modelo ya que el controlador solo
llamará a los métodos de esta clase
 */
public class Datos {
    private ListaArticulos listaArticulos;
    private ListaClientes listaClientes;
    private ListaPedidos listaPedidos;


    public Datos() {
        listaArticulos = new ListaArticulos();
        listaClientes = new ListaClientes();
        listaPedidos = new ListaPedidos();

    }
// TO-BE-DONE

    public ListaArticulos getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ListaArticulos listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public ListaClientes getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ListaPedidos getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ListaPedidos listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void aniadir(String id, String descripcion, float precio, float gastosEnvio, int tiempoPreparacion) {

        listaArticulos.add(new Articulo(id, descripcion, precio, gastosEnvio, tiempoPreparacion));


    }
}




