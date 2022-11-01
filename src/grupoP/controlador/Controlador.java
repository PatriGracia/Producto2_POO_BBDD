package grupoP.controlador;


import grupoP.modelo.Datos;


/*
La clase Controlador será utilizada para intervenir entre la vista y
los datos del modelo. Con este objetivo, la clase Controlador utilizará
una instancia de la clase Datos, por ser la clase principal de la capa modelo.
 */
public class Controlador {
    private Datos datos;

    public Controlador() {
        datos = new Datos ();
    }
    // TO-BE-DONE
    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }


    public void entradaArticulo(String id, String descripcion, float precio, float gastosEnvio, int tiempoPreparacion) {
        datos.aniadirArticulo(id, descripcion, precio, gastosEnvio, tiempoPreparacion);

    }

    public void entradaCliente(String nombre, String domicilio, String nif, String email, Float descuento){
        if(descuento != null){
            datos.aniadirCliente(nombre, domicilio, nif, email, descuento);
        }else {
            datos.aniadirCliente(nombre, domicilio, nif, email, null);
        }

    }

}
