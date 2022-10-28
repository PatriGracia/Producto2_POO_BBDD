package grupoP.modelo;


    /*
     - public class Lista<T> {
        protected ArrayList<T> lista;
        …
    }

    - En la declaración anterior, T constituye un parámetro que incide en el
    tipo de elemento que se gestiona en el atributo lista, de tipo ArrayList.
    A partir de la clase Lista, se definirán las clases derivadas:
    ListaArticulos, ListaClientes y ListaPedidos, según el tipo de objeto a gestionar
     */
    public class Lista<T> {
        protected ArrayList<T> lista;
        public Lista() {
            lista = new ArrayList<>();
        }
        public int getSize() {
// TO-BE-DONE
        }
        public void add(T t) {
// TO-BE-DONE
        }
        public void borrar(T t) {
// TO-BE-DONE
        }
        public T getAt(int position) {
// TO-BE-DONE
        }
        public void clear() {
// TO-BE-DONE
        }
        public boolean isEmpty() {
// TO-BE-DONE
        }
        public ArrayList<T> getArrayList() {
            ArrayList<T> arrlist = new ArrayList<>(lista);
            return arrlist;
        }
    }
