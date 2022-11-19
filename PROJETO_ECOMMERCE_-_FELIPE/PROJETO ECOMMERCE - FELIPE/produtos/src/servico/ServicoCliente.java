package servico;

import Cliente.Cliente;

public class ServicoCliente implements IServicoCliente {

    private Cliente [] clientes;
    private int idx = 0;

    public ServicoCliente(int tamanho) {
        this.clientes = new Cliente[tamanho];
    }

    @Override
    public void inserirCliente(Cliente cliente) {
        cliente.setIdCliente(idx);
        this.clientes[idx] = cliente;
        idx++;
    }

    @Override
    public void alterarCliente(Cliente cliente) { this.clientes[cliente.getIdCliente()] = cliente;
    }

    @Override
    public void excluirCliente(Cliente cliente) {
        for(int i = cliente.getIdCliente(); i < this.idx - 1; i++) {
            this.clientes[i] = this.clientes[i + 1];
            this.clientes[i].setIdCliente(i);
        }
        this.clientes[idx - 1] = null;
        this.idx--;
    }

    @Override
    public Cliente pesquisarClientePorId(int id) {
        return this.clientes[id];
    }

    @Override
    public Cliente[] listarClientes() {
        return this.clientes;
    }

}
