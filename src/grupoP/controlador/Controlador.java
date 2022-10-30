package grupoP.controlador;
import java.util.List;
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

}
