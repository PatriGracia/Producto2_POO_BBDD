package grupoP.modelo;

public class ListaClientes extends Lista<Cliente> {
    private Cliente cliente;

    public ListaClientes(Cliente cliente){
        this.cliente=cliente;
    }

    public ListaClientes(){}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}