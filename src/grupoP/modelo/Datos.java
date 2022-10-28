package grupoP.modelo;

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
    public Datos (){
        listaArticulos = new ListaArticulos ();
        listaClientes = new ListaClientes();
        listaPedidos = new ListaPedidos ();
    }
// TO-BE-DONE
}
