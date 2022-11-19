package servico;

import Cliente.Cliente;

public interface IServicoCliente {

    public void inserirCliente(Cliente cliente);

    public void alterarCliente(Cliente cliente);

    public void excluirCliente(Cliente cliente);

    public Cliente pesquisarClientePorId(int idCliente);

    public Cliente[] listarClientes();

}
