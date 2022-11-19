package FuncionariosLojas;

public class funcionarios {
    public int idFuncionario;
    public String nome;
    public String cpf;
    public String funcaoEmpresa;
    public String lojaTrabalha;


    //método construtor
    public void funcionarios(int idFuncionario, String nome, String cpf, String funcaoEmpresa, String lojaTrabalha){
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.lojaTrabalha = lojaTrabalha;
        this.funcaoEmpresa = funcaoEmpresa;
    }
}
