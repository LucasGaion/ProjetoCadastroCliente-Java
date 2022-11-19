package Cliente;

public class Clientecadastro {
    private Cliente cliente;
    public static void main(String[] args) {

        //Cliente = Elon
        Cliente elon = new Cliente();
        elon.idCliente = 1;
        elon.nome = ("Elon Musk");
        elon.cpf = ("785.215.070-54");
        elon.endereco = ("Rua Emirado Arabe");
        elon.saldoCliente = 1000000;
        elon.profissao = ("Empresario");

        System.out.println("Id Cliente: " + elon.idCliente);
        System.out.println("Nome: " + elon.nome);
        System.out.println("Cpf: " + elon.cpf);
        System.out.println("Endereco: " + elon.endereco);
        System.out.println("Saldo Conta Online Cliente: " + elon.saldoCliente);
        System.out.println("Profissao: " + elon.profissao);

        System.out.println("---------------------------------------");

        //Cliente = jobs
        Cliente jobs = new Cliente();
        jobs.idCliente = 2;
        jobs.nome = ("Steve Jobs");
        jobs.cpf = ("650.110.070-54");
        jobs.endereco = ("Rua das America");
        jobs.saldoCliente = 8500000;
        jobs.profissao = ("Empresario");

        System.out.println("Id Cliente: " + jobs.idCliente);
        System.out.println("Nome: " + jobs.nome);
        System.out.println("Cpf: " + jobs.cpf);
        System.out.println("Endereco: " + jobs.endereco);
        System.out.println("Saldo Conta Online Cliente: " + jobs.saldoCliente);
        System.out.println("Profissao: " + jobs.profissao);

        System.out.println("---------------------------------------");

        //Cliente = bezos
        Cliente bezos = new Cliente();
        bezos.idCliente = 3;
        bezos.nome = ("Jeff bezos");
        bezos.cpf = ("890.110.070-54");
        bezos.endereco = ("Rua das Nacoes Unidas");
        bezos.saldoCliente = 7500000;
        bezos.profissao = ("Empresario");

        System.out.println("Id Cliente: " + bezos.idCliente);
        System.out.println("Nome: " + bezos.nome);
        System.out.println("Cpf: " + bezos.cpf);
        System.out.println("Endereco: " + bezos.endereco);
        System.out.println("Saldo Conta Online Cliente: " + bezos.saldoCliente);
        System.out.println("Profissao: " + bezos.profissao);

        System.out.println("---------------------------------------");

        //Cliente = gates
        Cliente gates = new Cliente();
        gates.idCliente = 4;
        gates.nome = ("Bill Gates");
        gates.cpf = ("550.340.070-54");
        gates.endereco = ("Rua Oreste Russi");
        gates.saldoCliente = 8500000;
        gates.profissao = ("Empresario");

        System.out.println("Id Cliente: " + gates.idCliente);
        System.out.println("Nome: " + gates.nome);
        System.out.println("Cpf: " + gates.cpf);
        System.out.println("Endereco: " + gates.endereco);
        System.out.println("Saldo Conta Online Cliente: " + gates.saldoCliente);
        System.out.println("Profissao: " + gates.profissao);



        /*CadastroLoja.cadastroLoja primeiraLoja = new CadastroLoja.cadastroLoja();
        primeiraLoja.saldoTesla = primeiraLoja.saldoTesla;
        primeiraLoja.compradordepositatesla(870000);
        System.out.println(primeiraLoja.saldoTesla);

        primeiraLoja.titular = elon;
        System.out.println(primeiraLoja.titular.nome); */


    }
}
