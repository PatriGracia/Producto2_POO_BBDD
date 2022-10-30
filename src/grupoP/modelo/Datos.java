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
        listaArticulos = new ListaArticulos();
        listaClientes = new ListaClientes();
        listaPedidos = new ListaPedidos ();
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



  /*
    public void addArticulo(Articulo articulo){
        listaArticulos.add(articulo);
    }

*/
   /* public boolean addArticulo(Articulo articulo){
        for(Articulo art: listaArticulos){
            if(art.getIdArticulo() == articulo.getIdArticulo()){
                return false;
            }
        }
        listaArticulos.add(articulo);
        return true;
    }*/
}
