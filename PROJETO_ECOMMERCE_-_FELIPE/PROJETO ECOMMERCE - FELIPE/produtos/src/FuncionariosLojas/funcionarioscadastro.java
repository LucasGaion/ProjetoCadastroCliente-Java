package FuncionariosLojas;

public class funcionarioscadastro {
    private funcionarios funcionarios;

    public static void main(String[] args) {
        funcionarios jonas = new funcionarios();
        jonas.idFuncionario = 1;
        jonas.nome = ("Jonas Souza");
        jonas.cpf = ("320.897.048-03");
        jonas.lojaTrabalha = ("Porsche");
        jonas.funcaoEmpresa = ("Desenvolvedor - Mobile");

        System.out.println("Id Funcinario: " + jonas.idFuncionario);
        System.out.println("Nome Funcionario: " + jonas.nome);
        System.out.println("Cpf Cliente: " + jonas.cpf);
        System.out.println("Loja Trabalha: " + jonas.lojaTrabalha);
        System.out.println("Funcao Empresa: " + jonas.funcaoEmpresa);

        System.out.println("---------------------------------------");

        funcionarios bruno = new funcionarios();
        bruno.idFuncionario = 2;
        bruno.nome = ("Bruno ferreira");
        bruno.cpf = ("310.457.028-03");
        bruno.lojaTrabalha = ("Tesla");
        bruno.funcaoEmpresa = ("Desenvolvedor - BackEnd");

        System.out.println("Id Funcinario: " + bruno.idFuncionario);
        System.out.println("Nome Funcionario: " + bruno.nome);
        System.out.println("Cpf Cliente: " + bruno.cpf);
        System.out.println("Loja Trabalha: " + bruno.lojaTrabalha);
        System.out.println("Funcao Empresa: " + bruno.funcaoEmpresa);

        System.out.println("---------------------------------------");

        funcionarios carlos = new funcionarios();
        carlos.idFuncionario = 3;
        carlos.nome = ("Carlos Pereira");
        carlos.cpf = ("110.457.028-03");
        carlos.lojaTrabalha = ("BMW");
        carlos.funcaoEmpresa = ("Desenvolvedor - FrontEnd");

        System.out.println("Id Funcinario: " + carlos.idFuncionario);
        System.out.println("Nome Funcionario: " + carlos.nome);
        System.out.println("Cpf Cliente: " + carlos.cpf);
        System.out.println("Loja Trabalha: " + carlos.lojaTrabalha);
        System.out.println("Funcao Empresa: " + carlos.funcaoEmpresa);

        System.out.println("---------------------------------------");

        funcionarios mateus = new funcionarios();
        mateus.idFuncionario = 4;
        mateus.nome = ("Mateus José");
        mateus.cpf = ("130.457.058-03");
        mateus.lojaTrabalha = ("Audi");
        mateus.funcaoEmpresa = ("Desenvolvedor - DataScience");

        System.out.println("Id Funcinario: " + mateus.idFuncionario);
        System.out.println("Nome Funcionario: " + mateus.nome);
        System.out.println("Cpf Cliente: " + mateus.cpf);
        System.out.println("Loja Trabalha: " + mateus.lojaTrabalha);
        System.out.println("Funcao Empresa: " + mateus.funcaoEmpresa);


    }
}
