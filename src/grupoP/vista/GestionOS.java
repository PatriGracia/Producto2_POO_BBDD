package grupoP.vista;

import grupoP.controlador.Controlador;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionOS {
    private Controlador controlador;

    Scanner teclado = new Scanner(System.in);
    public GestionOS() {
        controlador = new Controlador();
    }
    public void inicio() {
        boolean salir = false;
        char opcio;
        do {
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    // TO-BE-DONE Gestión Articulos
                    gestionArticulos();
                    break;
                case '2':
                    // TO-BE-DONE
                    break;
                case '3':
                    // TO-BE-DONE
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }
    char pedirOpcion() {
        String resp;
        System.out.println("Elige una opción: ");
                resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }


    public void gestionArticulos(){
        boolean cancelar = false;
        char opcio;
        do {
            System.out.println("1. Añadir Articulo");
            System.out.println("2. Mostrar Articulo");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    // TO-BE-DONE Añadir Articulo
                    addArticulo();
                    break;
                case '2':
                    mostrarArticulo();
                    break;

                case '0':
                    cancelar = true;
            }
        } while (!cancelar);
    }

    void addArticulo(){
        System.out.printf("Añade Id de Artículo: ");
        String id = teclado.nextLine();
        /*
        if (existeProducto(codigo)) {
            System.out.println("Ya existe ese producto");
            return;
        }
         */
        System.out.println("Descripcion: ");
        String descripcion = teclado.nextLine();
        System.out.println("Precio: ");
        float precio = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Gastos de envío: ");
        float gastosEnvio = teclado.nextFloat();
        teclado.nextLine();
        System.out.printf("Tiempo de preparación: ");
        int tiempoPreparacion= teclado.nextInt();;
        teclado.nextLine();




        //controlador = new Controlador();
        controlador.entradaDatos(id,descripcion,precio,gastosEnvio,tiempoPreparacion);

    }

    void mostrarArticulo(){

        //controlador = new Controlador();
        int i = controlador.getDatos().getListaArticulos().getSize();
        System.out.println(i);
        //String id = controlador.getDatos().getListaArticulos().getArticulo().getIdArticulo();


    }
}

