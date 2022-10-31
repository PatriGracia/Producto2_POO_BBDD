package grupoP.modelo;


import java.util.ArrayList;

/*
    - En la declaración anterior, T constituye un parámetro que incide en el
    tipo de elemento que se gestiona en el atributo lista, de tipo ArrayList.
    A partir de la clase Lista, se definirán las clases derivadas:
    ListaArticulos, ListaClientes y ListaPedidos, según el tipo de objeto a gestionar
     */
    public class Lista<T> {
        protected ArrayList<T> lista;

    public Lista(ArrayList<T> lista) {
        this.lista = lista;
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    public Lista() {
           lista = new ArrayList<>();
        }
        public int getSize() {
// TO-BE-DONE

            return lista.size();
        }
        public void add(T t) {
// TO-BE-DONE
           // lista.add(t);
        }
        public void borrar(T t) {
// TO-BE-DONE
            lista.remove(t);
        }
        public T getAt(int position) {
// TO-BE-DONE
            return null; //esta linea la añade el programa
        }
        public void clear() {
// TO-BE-DONE
            lista.clear();
        }
        public boolean isEmpty() {
// TO-BE-DONE
            return true;
        }
        public ArrayList<T> getArrayList() {
            ArrayList<T> arrlist = new ArrayList<>(lista);
            return arrlist;
        }

    public Lista copia(Lista li) {
        return null;
    }

}
