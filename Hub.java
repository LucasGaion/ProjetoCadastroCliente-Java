package lobby;

import javax.swing.JOptionPane;

import Cliente.Cliente;
import servico.ServicoCliente;
import servico.IServicoCliente;

public class Hub {

    public static final String tela = ""
            + "  (1) - Inserir Cliente \n"
            + "  (2) - Alterar Cliente \n"
            + "  (3) - Excluir Cliente \n"
            + "  (4) - Pesquisar Cliente por Id \n"
            + "  (5) - Listar Cliente \n"
            + "  (6) - Sair \n";


    public static void main(String [] args) {
        IServicoCliente ICS = getServicoCliente();
        String opcao = "";
        while(!opcao.equals("6")) {
            opcao = JOptionPane.showInputDialog(tela);
            switch(opcao) {
                case "1":
                    Cliente c = getCliente();
                    ICS.inserirCliente(c);
                    break;
                case "2":
                    int index = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que sera alterado"));
                    c = getCliente();
                    c.setIdCliente(index);
                    ICS.alterarCliente(c);
                    break;
                case "3":
                    index = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que sera alterado"));
                    c = new Cliente();
                    c.setIdCliente(index);
                    ICS.excluirCliente(c);
                    break;
                case "4":
                    index = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que sera alterado"));
                    c = ICS.pesquisarClientePorId(index);
                    JOptionPane.showMessageDialog(null, c);
                    break;
                case "5":
                    String resposta = "";
                    for(Cliente cont : ICS.listarClientes()) {
                        if(cont != null)
                            resposta += cont + "\n";
                    }
                    JOptionPane.showMessageDialog(null, resposta);
                    break;
                case "6": break;
                default: JOptionPane.showMessageDialog(null, "Digite uma oopcao valida ");

            }
        }

    }

    public static Cliente getCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente"));
        cliente.setCpf(JOptionPane.showInputDialog("Digite o cpf do Cliente"));
        cliente.setEndereco(JOptionPane.showInputDialog("Digite o endereco do Cliente"));
        cliente.setProfissao(JOptionPane.showInputDialog("Digite a profissao do Cliente"));
        return cliente;
    }


    public static IServicoCliente getServicoCliente () { return new ServicoCliente(100);
    }


}
