package grupoP.modelo;

import java.util.ArrayList;

public  class ListaArticulos extends Lista<Articulo> {
    private Articulo articulo;

    public ListaArticulos(ArrayList lista){
        super(lista);
    }
    public ListaArticulos(){

    }

    public ListaArticulos(Articulo articulo) {
        this.articulo=articulo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }


    public Articulo nuevoArticulo(String id, String descripcion, float precio, float gastos, int tiempo){
        System.out.println(lista.size());
        articulo = new Articulo();
        articulo.setIdArticulo(id);
        articulo.setDescripcion(descripcion);
        articulo.setPrecio(precio);
        articulo.setGastosEnvio(gastos);
        articulo.setTiempoPreparacion(tiempo);

        System.out.println(lista.size());
        return articulo;

    }


    public Lista copia (Lista l) {
        ListaArticulos la = (ListaArticulos) l;
        ListaArticulos copia = new ListaArticulos(la.getArticulo()) {
        };
        return copia;
    }
}
