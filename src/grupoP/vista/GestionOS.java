package grupoP.vista;

import grupoP.controlador.Controlador;

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
                    // TO-BE-DONE Gestión Clientes
                    gestionClientes();
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
            System.out.println("2. Mostrar Articulos");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    // TO-BE-DONE Añadir Articulo
                    addArticulo();
                    break;
                case '2':
                    mostrarArticulos();
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
        controlador.entradaArticulo(id,descripcion,precio,gastosEnvio,tiempoPreparacion);
        System.out.println("Se ha añadido el nuevo Articulo");
    }

    void mostrarArticulos(){
        for(int i = 0; i < controlador.getDatos().getListaArticulos().getSize(); i++){
            System.out.println(controlador.getDatos().getListaArticulos().getAt(i).toString());
        }
        int j = controlador.getDatos().getListaArticulos().getSize();
        System.out.println(j);
    }

    public void gestionClientes(){
        boolean cancelar = false;
        char opcio;
        do {
            System.out.println("1. Añadir Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Mostrar Clientes Estándar");
            System.out.println("4. Mostrar Clientes Premium");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    // Añadir cliente
                    addCliente();
                    break;
                case '2':
                    //Mostrar clientes
                    mostrarClientes();
                    break;
                case '3':
                    // Mostrar Cliente estandar

                    break;
                case '4':
                    //mostrar cliente premium

                    break;

                case '0':
                    cancelar = true;
            }
        } while (!cancelar);
    }

    void addCliente() {
        System.out.printf("Añade nombre del Cliente: ");
        String nombre = teclado.nextLine();
        /*
        if (existeProducto(codigo)) {
            System.out.println("Ya existe ese producto");
            return;
        }
         */
        System.out.println("Domicilio: ");
        String domicilio = teclado.nextLine();
        System.out.println("Nif: ");
        String nif = teclado.nextLine();
        System.out.println("Email: ");
        String email = teclado.nextLine();

        String tipo;
        do {
            System.out.println("(1) Estandar, (2) Premium");
            tipo = teclado.nextLine();
        } while (!"12".contains(tipo));
        switch (tipo) {
            case "1":
                controlador.entradaCliente(nombre, domicilio, nif, email, null);
                System.out.println("Se ha añadido nuevo cliente Estandar");
                break;
            case "2":
                System.out.println("Descuento: ");
                float descuento = teclado.nextFloat();
                teclado.nextLine();

                controlador.entradaCliente(nombre, domicilio, nif,email, descuento);
                System.out.println("Se ha añadido nuevo cliente Premium");
                break;
        }

    }

    void mostrarClientes(){
        for(int i = 0; i < controlador.getDatos().getListaClientes().getSize(); i++){
            System.out.println(controlador.getDatos().getListaClientes().getAt(i).toString());
        }
        int j = controlador.getDatos().getListaClientes().getSize();
        System.out.println(j);
    }
}

